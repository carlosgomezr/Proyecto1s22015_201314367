/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolavl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Carlos Gomez
 */
public class AVLTree {
public AVLNode root;
public AVLNode padre;
public AVLNode r;

    public void insert( int x,String nombre, String password ){
        root = insert( x, nombre,password,root );
    }
   
     public void buscar(int x){
        buscar(root,x);
    }
    public void padre(AVLNode hijo){
        padre(root,hijo);
    }
    public void balancear(){
        root=balancear(root);
    }

    public void log(int x,String password){
        log(root,x,password);
    }
   
    /*
     * x es una instancia de una clase que implementa Comparable
    */
    private AVLNode insert( int x,String nombre, String password, AVLNode t ){
        System.out.println("    t.insertar  "+t+" ");
        if( t == null )
            t = new AVLNode( x, nombre, password );
        else if( x<( t.id )) {
            t.izquierdo = insert( x,nombre,password, t.izquierdo );
            if( height( t.izquierdo ) - height( t.derecho ) == 2 )
                if( x<( t.izquierdo.id ) )
                    t = rotateWithLeftChild( t ); /* Caso 1 */
                else
                    t = doubleWithLeftChild( t ); /* Caso 2 */
        }
        else if( x>( t.id )) {
            t.derecho = insert( x,nombre,password, t.derecho );
            if( height( t.derecho ) - height( t.izquierdo ) == 2 )
                if( x>( t.derecho.id ))
                    t = rotateWithRightChild( t ); /* Caso 4 */
                else
                    t = doubleWithRightChild( t ); /* Caso 3 */
        }
        else
            ; // Duplicado; no hago nada
        t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
       // imprimir();
        return t;
    }


    private static int max( int lhs, int rhs ){
        return lhs > rhs ? lhs : rhs;
    }
    
    public AVLNode buscar(AVLNode nuevo,int x){
    try{    
        if ( x<nuevo.id){
            if(nuevo.izquierdo!=null){
                buscar(nuevo.izquierdo,x);
            }
           // return null;
        }
        if ( x>nuevo.id){
            if(nuevo.derecho!=null){
                buscar(nuevo.derecho,x);
            }
            //  return null;
        }        
        if( x==nuevo.id){
              return nuevo;
        }
    }catch(Exception ex){
    
    }
        return nuevo;
    }
    public void modificar(AVLNode nodo,int x, String nombre, String password){
        try{
        if ( x<nodo.id){
                modificar(nodo.izquierdo,x,nombre,password);
        }
        if ( x>nodo.id){
                modificar(nodo.derecho,x,nombre,password);
        }        
        if( x==nodo.id){
                nodo.id = x;
                nodo.nombre = nombre;
                nodo.password = password;
                balancear(nodo);
        }
        }
        catch(Exception ex){
        }
    }
    
     public void modificarEliminar(AVLNode nodo,int x, String nombre, String password,int nuevaclave){
        try{
        eliminar(nodo,x);
        insert(nuevaclave,nombre,password);
        }
        catch(Exception ex){
        }
    }
    
     public  AVLNode balancear(AVLNode t){
        if((t!=null)){
                int id = height( t.izquierdo ) - height( t.derecho ) ;
                int di = height( t.derecho ) - height( t.izquierdo ) ;
                System.out.println("        ENTRO A BALANCEAR T "+t+" "+t.height);
                if( height( t.izquierdo ) - height( t.derecho ) == 2 ){
        		if(height(t.izquierdo) >= height(t.derecho))
			{
                                System.out.println("   ENTRE AL CASO 1");
                                t = rotateWithLeftChild( t ); /* Caso 1 */
			}
			else
			{
                                System.out.println("   ENTRE AL CASO 2");
                                t = doubleWithLeftChild( t ); /* Caso 2 */
			}
		}
                if(height( t.derecho ) - height( t.izquierdo ) ==2 ){
        		if(height(t.derecho) >= height(t.izquierdo))
			{
                                System.out.println("   ENTRE AL CASO 4");
        			t = rotateWithRightChild(t); /* Caso 4 */
 
                        }
			else
			{
                                System.out.println("   ENTRE AL CASO 3");
        			t = doubleWithRightChild(t); /* Caso 3 */	
			}
		}
                        t.izquierdo=balancear(t.izquierdo);
                        t.derecho=balancear(t.derecho);
     }
//        System.out.println(" TT"+t+" t.der "+t.derecho+" t.izq "+t.izquierdo);
        return t;
}
public static void actualizar_altura(AVLNode t){
    if(t!=null){
         t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
    }
}   
static int actualizar_h(AVLNode t)
{
    int AltIzq, AltDer;

    if(t==null)
        return -1;
    else
    {
        AltIzq = actualizar_h(t.izquierdo);
        AltDer = actualizar_h(t.derecho);

        if(AltIzq>AltDer){
            t.height = AltIzq+1;
            return AltIzq+1;
        }
            
        else{
            t.height = AltDer+1;
            return AltDer+1;
        }
            
    }
}
public void hijo(AVLNode padre, AVLNode hijo){
    System.out.println("HIJO HIJO XD "+hijo+hijo.id+" PADRE PADRE "+padre+padre.id);
    try{
        if(padre.izquierdo!=null){
            if(padre.izquierdo.id==hijo.id){
                System.out.println("    el hijo es izquierdo");
                padre.izquierdo = null;
            }
        }
        if(padre.derecho!=null){
            if(padre.derecho.id==hijo.id){
                System.out.println("    el hijo es derecho");
                padre.derecho = null;
            }
        }
        
    }catch(Exception ex){
    
    }
   
}public AVLNode padre(AVLNode t,AVLNode hijo){
AVLNode aux = t;
if(aux!=null){
System.out.println("    aux padre "+aux);
if(aux.derecho!=null){
    
    if(hijo.id>aux.derecho.id){
        System.out.println("No encontre tata :c  root " +aux+"  hijo "+hijo);
        padre(aux.derecho,hijo);
    }
    if(hijo.id<aux.derecho.id){
        System.out.println("No encontre tata :c  root " +aux+"  hijo "+hijo);
        padre(aux.izquierdo,hijo);
    }
    if(hijo.id==aux.derecho.id){
        System.out.println("encontre al tata :D " +aux+"aux.derecho"+aux.derecho+"aux.izquierdo"+aux.izquierdo);
       // hijo(aux,hijo);
        padre = aux;
        return aux;
    }
    
}
if(aux.izquierdo!=null){
    if(hijo.id>aux.izquierdo.id){
        System.out.println("No encontre tata :c  root " +aux+"  hijo "+hijo);
        padre(aux.derecho,hijo);
    }
    if(hijo.id<aux.izquierdo.id){
        System.out.println("No encontre tata :c  root " +aux+"  hijo "+hijo);
        padre(aux.izquierdo,hijo);
    }
    if(hijo.id==aux.izquierdo.id){
        System.out.println("encontre al tata :D " +aux+"aux.derecho"+aux.derecho+"aux.izquierdo"+aux.izquierdo);
       /// hijo(aux,hijo);
        padre = aux;
        return aux;
        }
    }
}
return  aux;
}    


public AVLNode eliminar(AVLNode t,int x){
	AVLNode aux;
        AVLNode aux2 = buscar(t,x);
        System.out.println("   eliminar  t   "+t);
        System.out.println("   eliminar aux 2 "+aux2);
        
        if(x<t.id){
                System.out.println("t->izquierda "+t.id);             
		eliminar(t.izquierdo,x);          
	}
	else if(x>t.id){
		System.out.println("t->derecha "+t.id);             
                eliminar(t.derecho,x);
	}
	else{
                if((t.izquierdo ==null) && (t.derecho==null)){
                      System.out.println("encontre esta mierda");
                      System.out.println("nodo t (hijo) "+t);
                      padre(t);
                      System.out.println("  VARIABLE PADRE STATIC "+padre);
                      hijo(padre,t);
                      System.out.println("BALANCEO PADRE "+padre+" p.izq "+padre.izquierdo+" p.der "+padre.derecho);
                      if(t==root){
                          root = null;
                      }
                      balancear();
                      t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;              
        	}
		else if(t.izquierdo==null){
                        System.out.println("Eliminar_izq");
			padre(t);
                        aux = padre.derecho;
                        padre.izquierdo=t.derecho;
                        padre.derecho=aux;
                        //hijo(padre,t);
                        balancear();
                        t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
                        
		}
		else if(t.derecho==null){
                        System.out.println("Eliminar_der");
			padre(t);
                        aux = padre.izquierdo;
                        padre.derecho =t.izquierdo;
                        padre.izquierdo=aux;
                        //hijo(padre,t);
                        balancear();
                        t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
                        
		}
		else
		{
                   
                        System.out.println("Eliminar_min "+t.derecho+" "+t.derecho.id);
                        r = t;
                        t = eliminar_min(t.derecho);
                        balancear();
                    
                }	
	}
               // balancear(t);
               // t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
               // padre = null;
        balancear();
                return t;
}
public AVLNode eliminar_min(AVLNode t){
	
        AVLNodeAdmin auxp;
        if(t==null){
        
        }else{
            if (t.izquierdo==null)
            {
                    AVLNode auxr = r;
                    int auxid = r.id;
                    String auxnombre = r.nombre;
                    String auxpass=r.password;
                    System.out.println("R :v"+r);
                    r.id = t.id;
                    r.nombre = t.nombre;
                    r.password = t.password;
                    t.id = auxid;
                    t.nombre = auxnombre;
                    t.password = auxpass;
                    eliminar(t,auxid);
                    balancear (t);
                    t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;

                return t;
                    
            }
            else
                {
                    eliminar_min(t.izquierdo);
                }
        }
        System.out.println(" este es el t del min "+t);
	return t;
}

    public boolean log(AVLNode nodo,int x,String password){
        boolean flag=false;
    try{   
        if (x<nodo.id){
                log(nodo.izquierdo,x,password);
              //  flag=false;
        }
        if (x>nodo.id){
                log(nodo.derecho,x,password);
              //  flag=false;
        }        
        if( (x==nodo.id)&(password==nodo.password)){
                flag=true; 
                System.out.println("LOG IN "+x+" "+password+" "+flag);
        }
    }catch (Exception ex){
    
    }
        return flag;
    }
    


    private static AVLNode rotateWithLeftChild( AVLNode k2 ){
        System.out.println("ROTATE WITH LEFT CHILD");
        AVLNode k1 = k2.izquierdo;
        k2.izquierdo = k1.derecho;
        k1.derecho = k2;
        k2.height = max( height(k2.izquierdo), height(k2.derecho)) + 1;
        k1.height = max( height( k1.izquierdo ), k2.height ) + 1;
        return k1;
    }


    private static AVLNode rotateWithRightChild( AVLNode k1 ){
        System.out.println("ROTATE WITH RIGHT CHILD "+k1);
        AVLNode k2 = k1.derecho;
        System.out.println("        k2 = k1.der "+k2+" = "+k1.derecho+" k2.der "+k2.derecho);
        k1.derecho = k2.izquierdo;
        System.out.println("        k1.der = k2.izq "+k1.derecho+" = "+k2.izquierdo);
        k2.izquierdo = k1;
        System.out.println("        k2.izq = k1 "+k2.izquierdo+" = "+k1);
        k1.height = max( height(k1.izquierdo), height(k1.derecho) ) + 1;
        k2.height = max( height( k2.derecho ), k1.height ) + 1;
        System.out.println("    ESTO ES LO Q RETORNO k2 "+k2+" k2.derecha "+k2.derecho+" k2.izquierda "+k2.izquierdo);
        return k2;
    }
    private static AVLNode doubleWithLeftChild( AVLNode k3 ){
        System.out.println("DOUBLE WITH LEFT CHILD");
        k3.izquierdo = rotateWithRightChild( k3.izquierdo );
        return rotateWithLeftChild( k3 );
    }


    private static AVLNode doubleWithRightChild( AVLNode k1 ){
        System.out.println("DOUBLE WITH RIGHT CHILD");
        k1.derecho = rotateWithLeftChild( k1.derecho );
        return rotateWithRightChild( k1 );
    }


    private static int height( AVLNode t ){
        return t == null ? -1 : t.height;
    }

    
/*
     * Imprime el arbol con el recorrido InOrden
     */
    public String imprimir(){
        String c = imprimir(root);
        return c;
    }

    public String imprimir(AVLNode nodo){
        String c="";
        if ( nodo != null ){
                imprimir(nodo.derecho);
                imprimir(nodo.izquierdo);
                int id = height( nodo.izquierdo ) - height( nodo.derecho ) ;
                int di = height( nodo.derecho ) - height( nodo.izquierdo ) ;
                System.out.println(nodo+"  t "+nodo.id+"     altura "+nodo.height+"     i "+height(nodo.izquierdo)+"       d "+height(nodo.derecho)+"     i-d "+id+"      d-i "+di);
                c = c + nodo.id;
//       System.out.println("["+ nodo.id + "] "+nodo.height);
                          
        }
        return c;
    }
    
public String ToDot(AVLNode node)
{
    String stream="";
    try{
   
 
    if(node.izquierdo !=null)
        {   
            stream=stream+"nodea"+node.id+"[label=\" clave: "+node.id+"\n \n NOMBRE: "+node.nombre+" \n \n PASSWORD: "+node.password+"\"];\n";
            stream=stream+"nodea"+node.izquierdo.id+"[label=\" clave: "+node.izquierdo.id+"\n \n NOMBRE: "+node.izquierdo.nombre+" \n \n PASSWORD: "+node.izquierdo.password+"\"];\n";
            stream=stream+"nodea"+node.id+"->nodea"+node.izquierdo.id+"[label=\"izq\"];\n";
            stream=stream+ToDot(node.izquierdo);
            //if(node->lista!=NULL){
            //conca+=graficarjuego(node->lista);
            //} 
                    
        }
    if(node.derecho !=null)
        {
           
            stream=stream+"nodea"+node.id+"[label=\" clave: "+node.id+"\n \n NOMBRE: "+node.nombre+" \n \n PASSWORD: "+node.password+"\"];\n";
            stream=stream+"nodea"+node.derecho.id+"[label=\" clave: "+node.derecho.id+"\n \n NOMBRE: "+node.derecho.nombre+" \n \n PASSWORD: "+node.derecho.password+"\"];\n";
            stream=stream+"nodea"+node.id+"->nodea"+node.derecho.id+"[label=\"der\"];\n";
            stream=stream+ToDot(node.derecho);
            
        }
    if(node!=null){
            stream=stream+"nodea"+node.id+"[label=\" clave: "+node.id+"\n \n NOMBRE: "+node.nombre+" \n \n PASSWORD: "+node.password+"\"];\n";
            //if(node->lista!=NULL){
                 //   conca+=graficarjuego(node->lista);
               // }
                //cod += graficarjuego(node->lista);
            }
    if(node==null){
    
    }
           
    }catch(Exception ex){}
     return stream;
}

public void GraphAVL(AVLNode node,String nombre,String ruta){
	    File f;
	    FileWriter escribir;
	    String cod="";
           
            try{
	    System.out.println(ruta);
	    f = new File(ruta);
	    escribir = new FileWriter(f);
	    BufferedWriter bw = new BufferedWriter(escribir);
	    PrintWriter pw = new PrintWriter(bw);
            pw.write("digraph grafica { \n");
            pw.write("label= \" "+nombre+ "\"");
            pw.write("node [shape=record];\n");
            pw.write("subgraph g {\n");

                cod=cod+(ToDot(node));
            pw.write(cod);    
            pw.write("}\n");
            pw.write("}\n");
            
	    pw.close();
	    bw.close();
            }
	    catch(IOException e){System.out.println("Error: "+e.getMessage());
            
            }
            
       
}


     

    
}
