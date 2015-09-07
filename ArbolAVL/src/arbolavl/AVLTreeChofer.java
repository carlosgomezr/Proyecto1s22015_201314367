/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolavl;

/**
 *
 * @author Carlos Gomez
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AVLTreeChofer {
public AVLNodeChofer root;
public AVLNodeChofer padre;
public AVLNodeChofer r;
public String con="";
    public void insert( int x,String nombre,String apellido, String password ){
        root = insert( x, nombre,apellido,password,root );
    }
    public void eliminar(int x){
        eliminar(root,x);
    }
    public void buscar(int x){
        buscar(root,x);
    }
    public void padre(AVLNodeChofer hijo){
        padre(root,hijo);
    }
    public void balancear(){
        balancear(root);
    }
    
    private AVLNodeChofer insert( int x,String nombre,String apellido, String password, AVLNodeChofer t ){
        System.out.println("    t.insertar  "+t+" ");
        if( t == null )
            t = new AVLNodeChofer( x, nombre,apellido, password );
        else if( x<( t.id )) {
            t.izquierdo = insert( x,nombre,apellido,password, t.izquierdo );
            if( height( t.izquierdo ) - height( t.derecho ) == 2 )
                if( x<( t.izquierdo.id ) )
                    t = rotateWithLeftChild( t ); /* Caso 1 */
                else
                    t = doubleWithLeftChild( t ); /* Caso 2 */
        }
        else if( x>( t.id )) {
            t.derecho = insert( x,nombre,apellido,password, t.derecho );
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

    
       public AVLNodeChofer buscarInsertarHora(AVLNodeChofer nuevo,int x,String dia,String bus,String ruta,String hora,String horaf){
    try{    
        if ( x<nuevo.id){
            if(nuevo.izquierdo!=null){
                buscarInsertarHora(nuevo.izquierdo,x,dia,bus,ruta,hora,horaf);
            }
            return null;
        }
        if ( x>nuevo.id){
            if(nuevo.derecho!=null){
                buscarInsertarHora(nuevo.derecho,x,dia,bus,ruta,hora,horaf);
            }
              return null;
        }        
        if( x==nuevo.id){
              nuevo.lista.reemplazarInsertar(dia, bus,ruta,hora,horaf);
              return nuevo;
        }
    }catch(Exception ex){
    
    }
        return nuevo;
    }
    
       public AVLNodeChofer buscarInsertarDia(AVLNodeChofer nuevo,int x,String dia){
    try{    
        if ( x<nuevo.id){
            if(nuevo.izquierdo!=null){
                buscarInsertarDia(nuevo.izquierdo,x,dia);
            }
            return null;
        }
        if ( x>nuevo.id){
            if(nuevo.derecho!=null){
                buscarInsertarDia(nuevo.derecho,x,dia);
            }
              return null;
        }        
        if( x==nuevo.id){
              nuevo.lista.alta(dia);
              return nuevo;
        }
    }catch(Exception ex){
    
    }
        return nuevo;
    }
        public AVLNodeChofer buscar(AVLNodeChofer nuevo,int x){
            boolean flag=false;
    try{    
        if ( x<nuevo.id){
            if(nuevo.izquierdo!=null){
                buscar(nuevo.izquierdo,x);
            }
            return null;
        }
        if ( x>nuevo.id){
            if(nuevo.derecho!=null){
                buscar(nuevo.derecho,x);
            }
              return null;
        }        
        if( x==nuevo.id){
              System.out.print("si existe clave");
              return nuevo;
        }
    }catch(Exception ex){
    
    }
        return nuevo;
    }
        
    public boolean existe(AVLNodeChofer nuevo,int x){
    boolean flag=false;
    try{    
        if ( x<nuevo.id){
            if(nuevo.izquierdo!=null){
                existe(nuevo.izquierdo,x);
            }
        }
        if ( x>nuevo.id){
            if(nuevo.derecho!=null){
                existe(nuevo.derecho,x);
            }
        }        
        if( x==nuevo.id){
              System.out.print("si existe clave");
              flag = true;
        }
    }catch(Exception ex){
    
    }
        return flag;
    }
    
    public String ResumenxChofer(AVLNodeChofer nuevo,int x){
    
    try{    
        if ( x<nuevo.id){
            if(nuevo.izquierdo!=null){
                ResumenxChofer(nuevo.izquierdo,x);
            }
        }
        if ( x>nuevo.id){
            if(nuevo.derecho!=null){
                ResumenxChofer(nuevo.derecho,x);
            }
        }        
        if( x==nuevo.id){
              System.out.print("si existe clave");
              con = nuevo.lista.imprimir();
        }
    }catch(Exception ex){
    
    }
        return con;
    }
    
    
    public void modificar(AVLNodeChofer nodo,int x, String nombre,String apellido, String password){
        try{
        if ( x<nodo.id){
                modificar(nodo.izquierdo,x,nombre,apellido,password);
        }
        if ( x>nodo.id){
                modificar(nodo.derecho,x,nombre,apellido,password);
        }        
        if( x==nodo.id){
                nodo.id = x;
                nodo.nombre = nombre;
                nodo.apellido = apellido;
                nodo.password = password;
                balancear(nodo);
        }
        else{
                System.out.println("    CLAVE NO EXISTE xD");
            }
        
        }
        catch(Exception ex){
        }
    }

    public  AVLNodeChofer balancear(AVLNodeChofer t){
        if((t!=null)){
                int id = height( t.izquierdo ) - height( t.derecho ) ;
                int di = height( t.derecho ) - height( t.izquierdo ) ;
                System.out.println("BALANCEAR t "+t.id+"     altura "+t.height+"     i "+height(t.izquierdo)+"       d "+height(t.derecho)+"     i-d "+id+"      d-i "+di);
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
        //                balancear(t.izquierdo);
        //                balancear(t.derecho);
     }
//        System.out.println(" TT"+t+" t.der "+t.derecho+" t.izq "+t.izquierdo);
        return t;
}
    
public static void actualizar_altura(AVLNodeChofer t){
    if(t!=null){
         t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
    }
}   

public void hijo(AVLNodeChofer padre, AVLNodeChofer hijo){
     try{
        if(padre.izquierdo.id == hijo.id){
            System.out.println("    el hijo es izquierdo");
            padre.izquierdo = null;
            hijo = null;
        }
        else{
            System.out.println("    el hijo es derecho");
            padre.derecho = null;
            hijo = null;
        }
    }catch(Exception ex){
    
    }
   
}
    
public AVLNodeChofer padre(AVLNodeChofer t,AVLNodeChofer hijo){
AVLNodeChofer aux = t;
if(aux!=null){
System.out.println("    aux padre "+aux);
if(aux.derecho!=null){
    if(hijo.id > aux.derecho.id){
        System.out.println("No encontre tata :c  root " +aux+"  hijo "+hijo);
        padre(aux.derecho,hijo);
    }
    if(hijo.id < aux.derecho.id ){
        System.out.println("No encontre tata :c  root " +aux+"  hijo "+hijo);
        padre(aux.izquierdo,hijo);
    }
    if(hijo.id==aux.derecho.id){
        System.out.println("encontre al tata :D " +aux);
       // hijo(aux,hijo);
        padre = aux;
        return aux;
    }
}
if(aux.izquierdo!=null){
    if(hijo.id > aux.izquierdo.id){
        System.out.println("No encontre tata :c  root " +aux+"  hijo "+hijo);
        padre(aux.derecho,hijo);
    }
    if(hijo.id < aux.izquierdo.id){
        System.out.println("No encontre tata :c  root " +aux+"  hijo "+hijo);
        padre(aux.izquierdo,hijo);
    }
    if(hijo.id==aux.izquierdo.id){
        System.out.println("encontre al tata :D " +aux);
       // hijo(aux,hijo);
        padre = aux;
        return aux;
    }
}
}
return  aux;
}    

public AVLNodeChofer eliminar(AVLNodeChofer t,int x){
	AVLNodeChofer aux;
        AVLNodeChofer aux2 = buscar(t,x);
        System.out.println("   eliminar  t   "+t);
        System.out.println("   eliminar aux 2 "+aux2);
        
        if(x < t.id){
                System.out.println("t->izquierda "+t.id);             
		eliminar(t.izquierdo,x);          
	}
	else if(x > t.id){
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
                      balancear(t);
        	}
		else if(t.izquierdo==null){
                        System.out.println("Eliminar_izq");
			padre(t);
                        aux = padre.derecho;
                        padre.derecho = padre.derecho.derecho;
                        aux = null;
                        //padre(t);
                        //hijo(padre,t);
			//t = t.derecho;
                        //aux = null;
                        //t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;

                        balancear(t);
		}
		else if(t.derecho==null){
                        System.out.println("Eliminar_der");
			padre(t);
                        aux = padre.izquierdo;
                        padre.izquierdo = padre.izquierdo.izquierdo;
                        aux = null;
                        //aux = t;
                        //padre(t);
                        //hijo(padre,t);
			//t = t.izquierdo;
                        //aux = null;
                        //t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;

                        balancear(t);
		}
		else
		{
                        System.out.println("Eliminar_min "+t.derecho+" "+t.derecho.id);
                        r = t;
                        t = eliminar_min(t.derecho);
                        balancear(t);
                }	
	}
               // balancear(t);
               // t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
               // padre = null;
                return t;
}

public AVLNodeChofer eliminar_min(AVLNodeChofer t){
	
        AVLNodeChofer auxp;
        if(t==null){
        
        }else{
            if (t.izquierdo==null)
            {
                padre(t);
                AVLNodeChofer auxpadre = padre;
                int auxid=padre.id;
                String auxnombre=padre.nombre;
                String auxapellido=padre.apellido;
                String auxpass=padre.password;
                System.out.println("padre :v "+padre);
                padre.id = t.id;
                padre.nombre = t.nombre;
                padre.apellido = t.apellido;
                padre.password = t.password;
                t.id = auxid;
                t.nombre = auxnombre;
                t.apellido = auxapellido;
                t.password = auxpass;
                eliminar(t,auxid);
                //auxt.id = auxpadre.id;
                //auxt.nombre = auxpadre.nombre;
                //auxt.password = auxpadre.password;
                //AVLNode auxi = padre.izquierdo;
                //t.izquierdo = auxi;
                //auxpadre.izquierdo=null;
                //padre=null;
                balancear(t);
                t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
                return t;
                    
            }
            else
                {   
                    t = t.izquierdo;
                    AVLNodeChofer auxr = r;
                    int auxid = r.id;
                    String auxnombre=r.nombre;
                    String auxapellido=r.apellido;
                    String auxpass=r.password;
                    System.out.println("R :v"+r);
                    r.id = t.id;
                    r.nombre = t.nombre;
                    r.apellido = t.apellido;
                    r.password = t.password;
                    t.id = auxid;
                    t.nombre = auxnombre;
                    t.apellido = auxapellido;
                    t.password = auxpass;
                    eliminar(t,auxid);
                    balancear (t);
                    t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
                return t;                
                    }
        }
        System.out.println(" este es el t del min "+t);
	return t;
}

    private static AVLNodeChofer rotateWithLeftChild( AVLNodeChofer k2 ){
        AVLNodeChofer k1 = k2.izquierdo;
        k2.izquierdo = k1.derecho;
        k1.derecho = k2;
        k2.height = max( height(k2.izquierdo), height(k2.derecho)) + 1;
        k1.height = max( height( k1.izquierdo ), k2.height ) + 1;
        return k1;
    }


    private static AVLNodeChofer rotateWithRightChild( AVLNodeChofer k1 ){
        AVLNodeChofer k2 = k1.derecho;
        k1.derecho = k2.izquierdo;
        k2.izquierdo = k1;
        k1.height = max( height(k1.izquierdo), height(k1.derecho) ) + 1;
        k2.height = max( height( k2.derecho ), k1.height ) + 1;
        return k2;
    }

    private static AVLNodeChofer doubleWithLeftChild( AVLNodeChofer k3 ){
        System.out.println("DOUBLE WITH LEFT CHILD");
        k3.izquierdo = rotateWithRightChild( k3.izquierdo );
        return rotateWithLeftChild( k3 );
    }


    private static AVLNodeChofer doubleWithRightChild( AVLNodeChofer k1 ){
        System.out.println("DOUBLE WITH RIGHT CHILD");
        k1.derecho = rotateWithLeftChild( k1.derecho );
        return rotateWithRightChild( k1 );
    }

    private static int height( AVLNodeChofer t ){
        return t == null ? -1 : t.height;
    }

    
/*
     * Imprime el arbol con el recorrido InOrden
     */
    public void imprimir(){
        imprimir(root);
    }

    public String imprimir(AVLNodeChofer nodo){
        String c="";
        if ( nodo != null ){
            imprimir(nodo.derecho);
                int id = height( nodo.izquierdo ) - height( nodo.derecho ) ;
                int di = height( nodo.derecho ) - height( nodo.izquierdo ) ;
                System.out.println(nodo+"  t "+nodo.id+"     altura "+nodo.height+"     i "+height(nodo.izquierdo)+"       d "+height(nodo.derecho)+"     i-d "+id+"      d-i "+di);
                c = c + nodo.id;
                //         System.out.println("["+ nodo.id + "] "+nodo.height);
                nodo.lista.imprimir();
                imprimir(nodo.izquierdo);
          
        }
     return c;
    }

    
public String ToDot(AVLNodeChofer node)
{
    String stream="";
    try{
   
 
    if(node.izquierdo !=null)
        {   
            stream=stream+"nodea"+node.id+"[label=\" clave: "+node.id+"\n \n NOMBRE: "+node.nombre+node.id+"\n \n APELLIDO: "+node.apellido+" \n \n PASSWORD: "+node.password+"\"];\n";
            stream=stream+"nodea"+node.izquierdo.id+"[label=\" clave: "+node.izquierdo.id+"\n \n NOMBRE: "+node.izquierdo.nombre+"\n \n APELLIDO: "+node.izquierdo.apellido+" \n \n PASSWORD: "+node.izquierdo.password+"\"];\n";
            stream=stream+"nodea"+node.id+"->nodea"+node.izquierdo.id+"[label=\"izq\"];\n";
            stream=stream+ToDot(node.izquierdo);
            //if(node->lista!=NULL){
            //conca+=graficarjuego(node->lista);
            //} 
                    
        }
    if(node.derecho !=null)
        {
           
            stream=stream+"nodea"+node.id+"[label=\" clave: "+node.id+"\n \n NOMBRE: "+node.nombre+"\n \n APELLIDO: "+node.apellido+" \n \n PASSWORD: "+node.password+"\"];\n";
            stream=stream+"nodea"+node.derecho.id+"[label=\" clave: "+node.derecho.id+"\n \n NOMBRE: "+node.derecho.nombre+"\n \n APELLIDO: "+node.derecho.apellido+" \n \n PASSWORD: "+node.derecho.password+"\"];\n";
            stream=stream+"nodea"+node.id+"->nodea"+node.derecho.id+"[label=\"der\"];\n";
            stream=stream+ToDot(node.derecho);
            
        }
    if(node!=null){
            stream=stream+"nodea"+node.id+"[label=\" clave: "+node.id+"\n \n NOMBRE: "+node.nombre+"\n \n APELLIDO: "+node.apellido+" \n \n PASSWORD: "+node.password+"\"];\n";
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

public void GraphAVL(AVLNodeChofer node,String nombre,String ruta){
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
