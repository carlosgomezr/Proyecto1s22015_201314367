/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

/**
 *
 * @author Carlos Gomez
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Carlos Gomez
 */
public class AVLTreeAdmin {
public AVLNodeAdmin root;
public AVLNodeAdmin padre;
public AVLNodeAdmin r;    

    public void insert( String correo, String password,int contador ){
        root = insert(correo,password,contador,root );
    }
    //public void eliminar(int x){
    //    eliminar(root,x);
    //}
    public void buscar(String x){
        buscar(root,x);
    }
    public boolean existe(String x){
        return existe(root,x);
    }
    public void padre(AVLNodeAdmin hijo){
        padre(root,hijo);
    }
    public void balancear(){
        root=balancear(root);
    }

    public boolean log(String x,String password){
        return log(root,x,password);
    }
    
    public boolean existe(AVLNodeAdmin nuevo,String x){
    boolean flag=false;
    try{
        if(root==null){ flag=false;}
        if ( x.compareTo(nuevo.correo)<0){
            if(nuevo.izquierdo!=null){
                existe(nuevo.izquierdo,x);
            }
        }
        if ( x.compareTo(nuevo.correo)>0){
            if(nuevo.derecho!=null){
                existe(nuevo.derecho,x);
            }
        }        
        if( x.compareTo(nuevo.correo)==0){
              System.out.print("si existe clave");
              flag = true;
        }
    }catch(Exception ex){
    
    }
        return flag;
  }
    
     private AVLNodeAdmin insert(String nombre, String password, int contador,AVLNodeAdmin t ){
        System.out.println("    t.insertar  "+t+" ");
        if( t == null )
            t = new AVLNodeAdmin(nombre, password,contador );
        else if( nombre.compareTo(t.correo)<0 ) {
            t.izquierdo = insert(nombre,password,contador, t.izquierdo );
            if( height( t.izquierdo ) - height( t.derecho ) == 2 )
                if( nombre.compareTo(t.izquierdo.correo)<0 )
                    t = rotateWithLeftChild( t ); /* Caso 1 */
                else
                    t = doubleWithLeftChild( t ); /* Caso 2 */
        }
        else if(nombre.compareTo(t.correo)>0) {
            t.derecho = insert(nombre,password, contador, t.derecho );
            if( height( t.derecho ) - height( t.izquierdo ) == 2 )
                if( nombre.compareTo(t.derecho.correo)>0)
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


    public AVLNodeAdmin buscar(AVLNodeAdmin nuevo,String x){
    try{    
        if ( x.compareTo(nuevo.correo)<0){
            if(nuevo.izquierdo!=null){
                buscar(nuevo.izquierdo,x);
            }
          //  return null;
        }
        if ( x.compareTo(nuevo.correo)>0){
            if(nuevo.derecho!=null){
                buscar(nuevo.derecho,x);
            }
            //  return null;
        }        
        if( x.compareTo(nuevo.correo)==0){
              return nuevo;
        }
    }catch(Exception ex){
    
    }
        return nuevo;
    }
    
    public void modificarEliminar(AVLNodeAdmin nodo,String x, String password,int contador,String nuevaclave){
        try{
            eliminar(nodo,x);
            insert(nuevaclave,password,contador);
        }
        catch(Exception ex){
        }
    }
    
    
    public void modificar(AVLNodeAdmin nodo,String x, String nombre, String password){
        try{
        if (x.compareTo(nodo.correo)<0){
                modificar(nodo.izquierdo,x,nombre,password);
        }
        if (x.compareTo(nodo.correo)>0){
                modificar(nodo.derecho,x,nombre,password);
        }        
        if( x.compareTo(nodo.correo)==0){
                nodo.correo = x;
                nodo.password = password; 
                balancear(nodo);
        }
        }
        catch(Exception ex){
        }
    }
    
    private static int max( int lhs, int rhs ){
        return lhs > rhs ? lhs : rhs;
    }
    
public  AVLNodeAdmin balancear(AVLNodeAdmin t){
        if((t!=null)){
                int id = height( t.izquierdo ) - height( t.derecho ) ;
                int di = height( t.derecho ) - height( t.izquierdo ) ;
                System.out.println("        ENTRO A BALANCEAR T "+t+" "+t.height);
                if( height( t.izquierdo ) - height( t.derecho ) == 2 ){
        		if(height(t.izquierdo.izquierdo) >= height(t.izquierdo.derecho))
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
        		if(height(t.derecho.derecho) >= height(t.derecho.izquierdo))
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
public static void actualizar_altura(AVLNodeAdmin t){
    if(t!=null){
         t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
    }
}  
    

public void hijo(AVLNodeAdmin padre, AVLNodeAdmin hijo){
    System.out.println("HIJO HIJO XD "+hijo+hijo.correo+" PADRE PADRE "+padre+padre.correo);
    try{
        if(padre.izquierdo!=null){
            if(padre.izquierdo.correo.compareTo(hijo.correo)==0){
                System.out.println("    el hijo es izquierdo");
                padre.izquierdo = null;
            }
        }
        if(padre.derecho!=null){
            if(padre.derecho.correo.compareTo(hijo.correo)==0){
                System.out.println("    el hijo es derecho");
                padre.derecho = null;
            }
        }
        
    }catch(Exception ex){
    
    }
   
}

public boolean soyhijo(AVLNodeAdmin padre, AVLNodeAdmin hijo){
    boolean flag = false;
    System.out.println("HIJO HIJO XD "+hijo+hijo.correo+" PADRE PADRE "+padre+padre.correo);
    try{
        if(padre.izquierdo!=null){
            if(padre.izquierdo.correo.compareTo(hijo.correo)==0){
                System.out.println("    el hijo es izquierdo");
                flag=false;
                //padre.izquierdo = null;
            }
        }
        if(padre.derecho!=null){
            if(padre.derecho.correo.compareTo(hijo.correo)==0){
                System.out.println("    el hijo es derecho");
                flag=true;
                //padre.derecho = null;
            }
        }
        
    }catch(Exception ex){
    
    }
   return flag;
}

public AVLNodeAdmin padre(AVLNodeAdmin t,AVLNodeAdmin hijo){
AVLNodeAdmin aux = t;
if(aux!=null){
System.out.println("    aux padre "+aux);
if(aux.derecho!=null){
    
    if(hijo.correo.compareTo(aux.derecho.correo)>0){
        System.out.println("No encontre tata :c  root " +aux+"  hijo "+hijo);
        padre(aux.derecho,hijo);
    }
    if(hijo.correo.compareTo(aux.derecho.correo)<0){
        System.out.println("No encontre tata :c  root " +aux+"  hijo "+hijo);
        padre(aux.izquierdo,hijo);
    }
    if(hijo.correo.compareTo(aux.derecho.correo)==0){
        System.out.println("encontre al tata :D " +aux+"aux.derecho"+aux.derecho+"aux.izquierdo"+aux.izquierdo);
       // hijo(aux,hijo);
        padre = aux;
        return aux;
    }
    
}
if(aux.izquierdo!=null){
    if(hijo.correo.compareTo(aux.izquierdo.correo)>0){
        System.out.println("No encontre tata :c  root " +aux+"  hijo "+hijo);
        padre(aux.derecho,hijo);
    }
    if(hijo.correo.compareTo(aux.izquierdo.correo)<0){
        System.out.println("No encontre tata :c  root " +aux+"  hijo "+hijo);
        padre(aux.izquierdo,hijo);
    }
    if(hijo.correo.compareTo(aux.izquierdo.correo)==0){
        System.out.println("encontre al tata :D " +aux+"aux.derecho"+aux.derecho+"aux.izquierdo"+aux.izquierdo);
       /// hijo(aux,hijo);
        padre = aux;
        return aux;
        }
    }
}
return  aux;
}    


public AVLNodeAdmin eliminar(AVLNodeAdmin t,String x){
	AVLNodeAdmin aux;
        AVLNodeAdmin aux2 = buscar(t,x);
        System.out.println("   eliminar  t   "+t);
        System.out.println("   eliminar aux 2 "+aux2);
        
        if(x.compareTo(t.correo)<0){
                System.out.println("t->izquierda "+t.correo);             
		eliminar(t.izquierdo,x);          
	}
	else if(x.compareTo(t.correo)>0){
		System.out.println("t->derecha "+t.correo);             
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
                      //t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;              
        	}
		else if(t.izquierdo==null){
                        System.out.println("Eliminar_izq");
			padre(t);
                        if(root==t){
                            root = t.derecho;
                            System.out.println("ENTRE T.IZQUIERDO = NULL xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                        }else if(soyhijo(padre,t)==false){
                            aux = padre.derecho;
                            padre.izquierdo = t.derecho;
                            padre.derecho=aux;
                            balancear();
                            
                            //t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
                        }else if(soyhijo(padre,t)==true){
                            aux = padre.izquierdo;
                            padre.derecho=t.derecho;
                            padre.izquierdo=aux;
                            //hijo(padre,t);
                            balancear();
                            //t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
                        }
                        
		}
		else if(t.derecho==null){
                        System.out.println("Eliminar_der");
			padre(t);
                        if(root==t){
                            root = t.izquierdo;
                            System.out.println("ENTRE T.DERECHO = NULL xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                        }
                        else if(soyhijo(padre,t)==false){
                            aux = padre.derecho;
                            padre.izquierdo = t.izquierdo;
                            padre.derecho=aux;
                            balancear();
                          //  t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
                        }else if(soyhijo(padre,t)==true){
                            aux = padre.izquierdo;
                            padre.derecho =t.izquierdo;
                            padre.izquierdo=aux;
                            //hijo(padre,t);
                            balancear();
                        //    t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
                        }
		}
		else
		{
                   
                        System.out.println("Eliminar_min "+t.derecho+" "+t.derecho.correo);
                        r = t;
                        t = eliminar_min(t.derecho);
                      //  t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
                        balancear();
                    
                }	
	}
               // balancear(t);
               // t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
               // padre = null;
        balancear();
                return t;
}

public AVLNodeAdmin eliminar_min(AVLNodeAdmin t){
	
        AVLNodeAdmin auxp;
        if(t==null){
        
        }else{
            if (t.izquierdo==null)
            {
                    AVLNodeAdmin auxr = r;
                    String auxid = r.correo;
                    String auxpass=r.password;
                    System.out.println("R :v"+r);
                    r.correo = t.correo;
                    r.password = t.password;
                    t.correo = auxid;
                    t.password = auxpass;
                    //t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
                    eliminar(t,auxid);
                    balancear();
                    
                return t;
                    
            }
            else
                {
                    eliminar_min(t.izquierdo);
                }
        }
        balancear();
        System.out.println(" este es el t del min "+t);
	return t;
}

    public boolean log(AVLNodeAdmin nodo,String x,String password){
        boolean flag=false;
    try{   
        if (x.compareTo(nodo.correo)<0){
                log(nodo.izquierdo,x,password);
              //  flag=false;
        }
        if (x.compareTo(nodo.correo)>0){
                log(nodo.derecho,x,password);
              //  flag=false;
        }        
        if( (x.compareTo(nodo.correo)==0)&(password.compareTo(nodo.password)==0)){
                flag=true; 
                System.out.println("LOG IN "+x+" "+password+" "+flag);
        }
    }catch (Exception ex){
    
    }
        return flag;
    }
    

    private static AVLNodeAdmin rotateWithLeftChild( AVLNodeAdmin k2 ){
        System.out.println("ROTATE WITH LEFT CHILD");
        AVLNodeAdmin k1 = k2.izquierdo;
        k2.izquierdo = k1.derecho;
        k1.derecho = k2;
        k2.height = max( height(k2.izquierdo), height(k2.derecho)) + 1;
        k1.height = max( height( k1.izquierdo ), k2.height ) + 1;
        return k1;
    }


    private static AVLNodeAdmin rotateWithRightChild( AVLNodeAdmin k1 ){
        AVLNodeAdmin k2 = k1.derecho;
        k1.derecho = k2.izquierdo;
        k2.izquierdo = k1;
        System.out.println("k2 "+k2+" k2.izq "+k2.izquierdo+" k2.der "+k2.derecho);
        k1.height = max( height(k1.izquierdo), height(k1.derecho) ) + 1;
        k2.height = max( height( k2.derecho ), k1.height ) + 1;
        return k2;
    }

    private static AVLNodeAdmin doubleWithLeftChild( AVLNodeAdmin k3 ){
        // izquierda derecha
        k3.izquierdo = rotateWithRightChild( k3.izquierdo );
        return rotateWithLeftChild( k3 );
    }


    private static AVLNodeAdmin doubleWithRightChild( AVLNodeAdmin k1 ){
        //derecha izquierda 
        k1.derecho = rotateWithLeftChild( k1.derecho );
        return rotateWithRightChild( k1 );
    }


    private static int height( AVLNodeAdmin t ){
        return t == null ? -1 : t.height;
    }


    public String imprimir(){
        String conca=imprimir(root);
        return conca;
    }

    public String imprimir(AVLNodeAdmin nodo){
        String c="";
        if ( nodo != null ){
            imprimir(nodo.derecho);
                int id = height( nodo.izquierdo ) - height( nodo.derecho ) ;
                int di = height( nodo.derecho ) - height( nodo.izquierdo ) ;
                System.out.println(nodo+"  t "+nodo.correo+"     altura "+nodo.height+"     i "+height(nodo.izquierdo)+"       d "+height(nodo.derecho)+"     i-d "+id+"      d-i "+di);
                c = c + nodo.correo;
//      System.out.println("["+ nodo.id + "] "+nodo.height);
                imprimir(nodo.izquierdo);
          
        }
        return c;
    }
    
public String ToDot(AVLNodeAdmin node)
{
    String stream="";
    try{
   
 
    if(node.izquierdo !=null)
        {   
            stream=stream+"nodea"+node.contador+"[label=\" correo: "+node.correo+"\n \n password: "+node.password+"\"];\n";
            stream=stream+"nodea"+node.izquierdo.contador+"[label=\" correo: "+node.izquierdo.correo+"\n \n password: "+node.izquierdo.password+"\"];\n";
            stream=stream+"nodea"+node.contador+"->nodea"+node.izquierdo.contador+"[label=\"izq\"];\n";
            stream=stream+ToDot(node.izquierdo);
            //if(node->lista!=NULL){
            //conca+=graficarjuego(node->lista);
            //} 
                    
        }
    if(node.derecho !=null)
        {
           
            stream=stream+"nodea"+node.contador+"[label=\" correo: "+node.correo+"\n \n password: "+node.password+"\"];\n";
            stream=stream+"nodea"+node.derecho.contador+"[label=\" correo: "+node.derecho.correo+"\n \n password: "+node.derecho.password+"\"];\n";
            stream=stream+"nodea"+node.contador+"->nodea"+node.derecho.contador+"[label=\"der\"];\n";
            stream=stream+ToDot(node.derecho);
            
        }
    if(node!=null){
            stream=stream+"nodea"+node.contador+"[label=\" correo: "+node.correo+"\n \n pasword: "+node.password+"\"];\n";
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
    


public void GraphAVL(AVLNodeAdmin node,String nombre,String ruta){
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
     