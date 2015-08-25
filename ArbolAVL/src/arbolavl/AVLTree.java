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

    public void insert( int x,String nombre, String password ){
        root = insert( x, nombre,password,root );
    }
    public void eliminar(int x){
        root =eliminar(root,x);
    }
    public void buscar(int x){
        buscar(root,x);
    }
    /*
     * x es una instancia de una clase que implementa Comparable
    */
    private AVLNode insert( int x,String nombre, String password, AVLNode t ){
        System.out.println("    t.insertar  "+t);
        if( t == null )
            t = new AVLNode( x, null, null );
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
              nuevo = null;
              return nuevo;
        }
        else{
                System.out.println("clave no existe");
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
                
        }
        else{
                System.out.println("    clave no existe");
            }
        
        }
        catch(Exception ex){
        }
    }
    public void balancear(AVLNode t){
        if((t!=null)){
                //int id = height( t.izquierdo ) - height( t.derecho ) ;
                //int di = height( t.derecho ) - height( t.izquierdo ) ;
                //System.out.println("t "+t.id+"     altura "+t.height+"     i "+height(t.izquierdo)+"       d "+height(t.derecho)+"     i-d "+id+"      d-i "+di);
                if( height( t.izquierdo ) - height( t.derecho ) == 2 ){
        		if(height(t.izquierdo.izquierdo) >= height(t.izquierdo.derecho))
			{
                                 int r = height(t.izquierdo.izquierdo);
        			 t = rotateWithLeftChild( t ); /* Caso 1 */
			}
			else
			{
                                int r = height(t.izquierdo.izquierdo);
        			 t = doubleWithLeftChild( t ); /* Caso 2 */
			}
		}
                if(height( t.derecho ) - height( t.izquierdo ) ==2 ){
        		if(height(t.derecho.derecho)>=height(t.derecho.izquierdo))
			{
        			 t = rotateWithRightChild( t ); /* Caso 4 */
			}
			else
			{
        			 t = doubleWithRightChild( t ); /* Caso 3 */	
			}
		}
                        balancear(t.izquierdo);
                        balancear(t.derecho);
     }
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

    
public AVLNode eliminar(AVLNode t,int x){
	AVLNode aux;
        AVLNode aux2 = buscar(t,x);
        System.out.println("    t   "+t);
        System.out.println("    aux 2 "+aux2);
        
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
                      aux2=null;
                      System.out.println("nodo q segun borre "+buscar(t,x));
        	}
		else if(t.izquierdo==null){
                        System.out.println("Eliminar_izq");
			aux = t;
			t = t.derecho;
                        aux = null;
                        //t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;

                        //balancear(root);
		}
		else if(t.derecho==null){
                        System.out.println("Eliminar_der");
			aux = t;
			t = t.izquierdo;
                        aux = null;
                        //t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;

                        //balancear(root);
		}
		else
		{
			t.id = eliminar_min(t.derecho);
                        System.out.println("Eliminar_min");
		}	
	}
                //balancear(t);
                return t;
}

public int eliminar_min(AVLNode t){
	int x=0;
	if(t.izquierdo==null){
		x = eliminar_min(t.izquierdo);
		balancear(t);
       		if(t!=null){
                    t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
                }	
                return x;
	}
	else{
		AVLNode aux = t;
		x = aux.id;
		t = t.derecho;
               
		aux = null;
                balancear(t);
		if(t!=null){
                    t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
                }
		return x;
	}	
}


    private static AVLNode rotateWithLeftChild( AVLNode k2 ){
        AVLNode k1 = k2.izquierdo;
        k2.izquierdo = k1.derecho;
        k1.derecho = k2;
        k2.height = max( height(k2.izquierdo), height(k2.derecho)) + 1;
        k1.height = max( height( k1.izquierdo ), k2.height ) + 1;
        return k1;
    }


    private static AVLNode rotateWithRightChild( AVLNode k1 ){
        AVLNode k2 = k1.derecho;
        k1.derecho = k2.izquierdo;
        k2.izquierdo = k1;
        k1.height = max( height(k1.izquierdo), height(k1.derecho) ) + 1;
        k2.height = max( height( k2.derecho ), k1.height ) + 1;
        return k2;
    }


    private static AVLNode doubleWithLeftChild( AVLNode k3 ){
        k3.izquierdo = rotateWithRightChild( k3.izquierdo );
        return rotateWithLeftChild( k3 );
    }


    private static AVLNode doubleWithRightChild( AVLNode k1 ){
        k1.derecho = rotateWithLeftChild( k1.derecho );
        return rotateWithRightChild( k1 );
    }


    private static int height( AVLNode t ){
        return t == null ? -1 : t.height;
    }

    
/*
     * Imprime el arbol con el recorrido InOrden
     */
    public void imprimir(){
        imprimir(root);
    }

    public void imprimir(AVLNode nodo){
        if ( nodo != null ){
                imprimir(nodo.derecho);
                int id = height( nodo.izquierdo ) - height( nodo.derecho ) ;
                int di = height( nodo.derecho ) - height( nodo.izquierdo ) ;
                System.out.println(nodo+"  t "+nodo.id+"     altura "+nodo.height+"     i "+height(nodo.izquierdo)+"       d "+height(nodo.derecho)+"     i-d "+id+"      d-i "+di);
       //         System.out.println("["+ nodo.id + "] "+nodo.height);
                imprimir(nodo.izquierdo);
          
        }
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
