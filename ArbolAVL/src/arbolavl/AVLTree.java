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
public class AVLTree {
public AVLNode root;

    public void insert( EstacionClave x ){
        root = insert( x, root );
    }

    /*
     * x es una instancia de una clase que implementa Comparable
    */
    private AVLNode insert( EstacionClave x, AVLNode t ){
        if( t == null )
            t = new AVLNode( x, null, null );
        else if( x.id<( t.dato.id )) {
            t.izquierdo = insert( x, t.izquierdo );
            if( height( t.izquierdo ) - height( t.derecho ) == 2 )
                if( x.id<( t.izquierdo.dato.id ) )
                    t = rotateWithLeftChild( t ); /* Caso 1 */
                else
                    t = doubleWithLeftChild( t ); /* Caso 2 */
        }
        else if( x.id>( t.dato.id )) {
            t.derecho = insert( x, t.derecho );
            if( height( t.derecho ) - height( t.izquierdo ) == 2 )
                if( x.id>( t.derecho.dato.id ))
                    t = rotateWithRightChild( t ); /* Caso 4 */
                else
                    t = doubleWithRightChild( t ); /* Caso 3 */
        }
        else
            ; // Duplicado; no hago nada
        t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
        return t;
    }


    private static int max( int lhs, int rhs ){
        return lhs > rhs ? lhs : rhs;
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
            System.out.println("["+ nodo.dato.id + "]");
            imprimir(nodo.izquierdo);
        }
    }

}
