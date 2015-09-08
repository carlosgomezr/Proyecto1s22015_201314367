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
import com.csvreader.CsvReader;

public class ArbolAVL {
public static int contador = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AVLTree arbolAVL = new AVLTree();
      /*  
        arbolAVL.insert(1," 1 "," 1");
        arbolAVL.insert(2," 2 "," 2");
        arbolAVL.insert(3," 3 "," 3");
        arbolAVL.insert(4," 4 "," 4");
        arbolAVL.insert(5," 5 "," 5");
        arbolAVL.insert(6," 6 "," 6");
        arbolAVL.insert(7," 7 "," 7");
        arbolAVL.insert(8," 8 "," 8"); 
        arbolAVL.insert(9,"9","9");
        arbolAVL.insert(10,"10","10");
        arbolAVL.insert(11,"11","11");
        arbolAVL.insert(12,"12","12");
        arbolAVL.insert(13,"13","13");
        arbolAVL.insert(14,"14","14");
       
        arbolAVL.imprimir();
        System.out.println("\n");
        arbolAVL.eliminar(arbolAVL.root,8); */
       // arbolAVL.eliminar(arbolAVL.root,9);
      //  arbolAVL.modificar(arbolAVL.root,1," 7 xd"," 7 :3");
      //  arbolAVL.imprimir(arbolAVL.root);
       // arbolAVL.insert(8," 8 xxx"," 8zzz");
        System.out.println("\n");
        listad dias = new listad();
        dias.alta("lunes");
        dias.alta("martes");
        dias.alta("miercoles");
       
        dias.reemplazarInsertar("lunes","ABC123","Trebol","17:00", "18:00");
        dias.reemplazarInsertar("lunes","DEF456","SEGMA","19:00", "20:00");
        dias.reemplazarInsertar("lunes","FGH789","Kaya","21:00", "22:00"); 
        dias.reemplazarInsertar("martes","ABC123","Trebol","21:00", "22:00");
        dias.reemplazarInsertar("martes","DEF456","SEGMA","23:00", "00:00");
        
        dias.imprimir();
        
        AVLTreeAdmin admin = new AVLTreeAdmin();
        System.out.println("CONTADORRRRRR"+contador);
        admin.insert("cosa@gmail.com", "cosa",contador);
        contador = contador+1;
        System.out.println("CONTADORRRRRR"+contador);
        admin.insert("arbol@gmail.com", "arbol",contador);
        contador = contador+1;
        System.out.println("CONTADORRRRRR"+contador);
        admin.insert("abeja@gmail.com","abeja",contador);
        contador = contador+1;
        admin.insert("aba@gmail.com","oso",contador);
        admin.imprimir();
        admin.eliminar(admin.root,"cosa@gmail.com");
        admin.imprimir();
        admin.GraphAVL(admin.root,"ARBOL ADMIN","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolAVL\\src\\Diagramas\\graphAdmin.txt");
        
        Funcion f = new Funcion();
        f.generarImagen("ArbolAdmin","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolAVL\\src\\Diagramas\\graphAdmin.txt");
        f.generarFecha(dias,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolAVL\\src\\Diagramas\\graphDia.txt","DIA "+"chofer");
        f.generarImagen("LISTA DIA ","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolAVL\\src\\Diagramas\\graphDia.txt");
        arbolAVL.GraphAVL(arbolAVL.root,"ArbolAVLEstacionesClave", "C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolAVL\\src\\Diagramas\\graph.txt");
        f.generarImagen("ArbolAVLEstacionesClave", "C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolAVL\\src\\Diagramas\\graph.txt");  
       
        listasdobles doble = new listasdobles();
        AVLTreeChofer archo = new AVLTreeChofer();
        listasdobles asignar = new listasdobles();
        listasdobles choferxbus = new listasdobles();
        f.leerCSV(doble, asignar,archo);
        doble.ordenamiento(doble);
        System.out.println("IMPRIMO ARCHO");
        archo.imprimir();
        f.ChoferxDia(archo.root,4,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolAVL\\src\\Diagramas\\fecha.txt","Graph xd");
        f.generarImagen("xD B", "C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolAVL\\src\\Diagramas\\fecha.txt");
        doble.imprimir();
        archo.GraphAVL(archo.root,"ARCHO","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolAVL\\src\\Diagramas\\archo.txt");
        f.generarImagen("ARCHO","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolAVL\\src\\Diagramas\\archo.txt");
//        System.out.println("Tamaño de la lista: "+doble.tamaño()+" elemento b2: "+doble.posicion(2).b.id);
        //doble.ordenamiento(doble);
        f.generarListaDoble(doble,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolAVL\\src\\Diagramas\\graphdoble.txt");
        f.generarImagen("ListaDoble","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolAVL\\src\\Diagramas\\graphdoble.txt");
        
       // String aux = f.leer();
       // System.out.println(aux);
      // listasdobles auxcsv = new listasdobles();
      // Funcion gh = new Funcion();
      // gh.leerCSV(auxcsv);
      // auxcsv.ordenamiento(auxcsv);
      // gh.generarListaDoble(auxcsv,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolAVL\\src\\Diagramas\\graphdoble.txt");
      // gh.generarImagen("LISTA CSV", "C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolAVL\\src\\Diagramas\\graphdoble.txt");
        System.out.println("BUSCAR BUS XD");
        System.out.println(asignar.Busespecifico("JKL123"));
        System.out.println("BUSCAR  Chofer :B");
        System.out.println("conca "+archo.ResumenxChofer(archo.root, 4));
        asignar.reporteChoferxBus(4);
        asignar.reporteChoferxBus(2);
        asignar.reporteHoraxChofer(4, "JKL123");
        listar listaruta = new listar();
        listaruta.InsertarRuta("Ruta 1", "Trebol");
        listaruta.InsertarRuta("Ruta 2", "Chacara");
        listaruta.InsertarRuta("Ruta 3", "Palacio");
        listaruta.InsertarRuta("Ruta 1", "Segma");
        listaruta.InsertarRuta("Ruta 2", "Parque");
        listaruta.InsertarRuta("Ruta 1", "Mariscal");
        System.out.println("RUTAS-------------");
        System.out.println(listaruta.imprimir());
    }
    
}
