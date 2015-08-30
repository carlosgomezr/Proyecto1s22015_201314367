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
public class AVLTreeAdmin {
public AVLNodeAdmin root;
public AVLNodeAdmin padre;
public AVLNodeAdmin r;    

    public void insert( String correo, String password ){
        root = insert(correo,password,root );
    }
    //public void eliminar(int x){
    //    eliminar(root,x);
    //}
    public void buscar(String x){
        buscar(root,x);
    }
    public void padre(AVLNodeAdmin hijo){
        padre(root,hijo);
    }
    public void balancear(){
        balancear(root);
    }

     private AVLNodeAdmin insert(String nombre, String password, AVLNodeAdmin t ){
        System.out.println("    t.insertar  "+t+" ");
        if( t == null )
            t = new AVLNodeAdmin(nombre, password );
        else if( nombre.compareTo(t.correo)<0 ) {
            t.izquierdo = insert(nombre,password, t.izquierdo );
            if( height( t.izquierdo ) - height( t.derecho ) == 2 )
                if( nombre.compareTo(t.izquierdo.correo)<0 )
                    t = rotateWithLeftChild( t ); /* Caso 1 */
                else
                    t = doubleWithLeftChild( t ); /* Caso 2 */
        }
        else if(nombre.compareTo(t.correo)>0) {
            t.derecho = insert(nombre,password, t.derecho );
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
            return null;
        }
        if ( x.compareTo(nuevo.correo)>0){
            if(nuevo.derecho!=null){
                buscar(nuevo.derecho,x);
            }
              return null;
        }        
        if( x.compareTo(nuevo.correo)==0){
              return nuevo;
        }
        else{
                System.out.println("clave no existe");
            }
    }catch(Exception ex){
    
    }
        return nuevo;
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
                nodo.password = password; 
        }
        else{
                System.out.println("    CLAVE NO EXISTE xD");
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
public static void actualizar_altura(AVLNodeAdmin t){
    if(t!=null){
         t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
    }
}  
    

public void hijo(AVLNodeAdmin padre, AVLNodeAdmin hijo){
     try{
        if(padre.izquierdo.correo.compareTo(hijo.correo)==0){
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
        System.out.println("encontre al tata :D " +aux);
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
        System.out.println("encontre al tata :D " +aux);
       // hijo(aux,hijo);
        padre = aux;
        return aux;
        }
    }
}
return  aux;
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


    
}
    