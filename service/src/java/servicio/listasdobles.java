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
public class listasdobles {
    nodo primero;
    nodo ultimo;
    listasdobles()
    {
        primero=null;
        ultimo=null;
    }
    
      public boolean estavacio()
    {
        if(primero==null) return true;
        else return false;
    }
 
    public listasdobles alta(Bus dat)
    {
        if((primero==null))
        {
            nodo nuevo=new nodo(dat);
            primero=nuevo;
            ultimo=nuevo;
        }
        else
        {
            nodo nuevo=new nodo(dat);
            ultimo.next=nuevo;
            nuevo.ant=ultimo;
            ultimo=nuevo;
        }
        return this;
    }
    
    public listasdobles baja(Bus dat)
    {
        if((ultimo==null))
        {
            nodo nuevo=new nodo(dat);
            primero=nuevo;
            ultimo=nuevo;
        }
        else
        {
            //nodo nuevo=new nodo(dat);
            //ultimo.next=nuevo;
            //nuevo.ant=ultimo;
            //ultimo=nuevo;
            
            nodo nuevo=new nodo(dat);
            primero.ant=nuevo;
            nuevo.next = primero;
            primero = nuevo;
        }
        return this;
    }
    
    
     public boolean delete(String num)
    {
        nodo anterior=null;
        nodo actual=primero;
        
       
        while(actual!=ultimo)
        {
            if(actual.b.id.compareTo(num)==0)
            {
                if(anterior==null)
                {
                    primero=actual.next;
                    primero.ant=null;
                }
                else{
                    anterior.next=actual.next;
                    nodo temporal;
                    temporal=actual.next;
                    temporal.ant=anterior;
                }
                return true;
            }
            anterior=actual;
            actual=actual.next;
        }
       
        if(num.compareTo(ultimo.b.id)==0)
        {
             if(primero==ultimo){
                primero = ultimo = null;
            }
             else{
                ultimo=actual.ant;
             }
            return true;
        }
        return false;
    }

    public int tamaño(){
        int t=0;
        if( estavacio() )
	{
		t=0;
	}
	nodo actual = ultimo;
	while( actual != null)
	{
                t = t+1;
		actual = actual.ant;
	}
        return t;
    }
        
    public nodo posicion(int tam){
        nodo aux=null;
        if( estavacio() )
	{
		aux = null;
	}
	nodo actual = primero;
        for(int i=1;i<=tam;i++){
            if(actual!=null){
                aux = actual;
                actual = actual.next;
                //System.out.println("entre al if posicion "+i);
            }
        }
        return aux;
    }
    
    public void reemplazar(String id,String nombre){
        nodo actual;
        actual = primero;
        
        while(actual!=null){
                if(actual.b.id.compareTo(id)==0){
                    actual.b.nombre = nombre;
                }
                actual = actual.next;
        }
    }
    
    public boolean existe(String id){
        boolean flag=false;
        nodo actual;
        actual = primero;
        
        while(actual!=null){
                if(actual.b.id.compareTo(id)==0){
                    flag=true;
                }
                actual = actual.next;
        }
        return flag;
    }

    
    
     public void Modificar(listasdobles lista,Bus aj,Bus ajm){
        int numeroid=0;
        nodo actual;
        actual = ultimo;
        while( actual != null)
	{
            //System.out.println("j :"+aj.ClaveChofer+" j+1 "+ajm.ClaveChofer);
            //if(actual.b.ClaveChofer==aj.ClaveChofer){
            if(actual.b.id.compareTo(aj.id)==0){
                aj = ajm;
                actual.b = aj;
            }
            actual = actual.ant;
	}
    }
   
     public void ordenamiento(listasdobles lista){
     int tam = 0;
     Bus temp = null;
     Bus aux = null;
     Bus aux2 = null;
     tam = lista.tamaño()+1;
     System.out.println("Tamaño ");
         for(int i=1;i<=tam;i++){
             for(int j=1;j<=tam;j++){
                //if(lista.posicion(j).b.ClaveChofer>lista.posicion(j+1).b.ClaveChofer){ 
                if(lista.posicion(j).b.id.compareTo(lista.posicion(i).b.id)>0){
                     System.out.println("entro a >");
                     temp = lista.posicion(j).b;
                     
                     lista.Modificar(lista, lista.posicion(j).b,lista.posicion(j+1).b);
                     lista.Modificar(lista, lista.posicion(j+1).b, temp);
                }
             }
         }
     }

      public void imprimir()
    {
        nodo actual;
        actual=primero;
        while(actual!=null)
        {
            System.out.println("BUS: "+actual.b.id);
            
            actual=actual.next;
        }
       
           
                 
    }
      
        public void imprimir2()
    {
        nodo actual;
        actual=primero;
        while(actual!=null)
        {
            System.out.println("Horario ini: "+actual.b.horarioIni+" Horario fin: "+actual.b.horarioFin+"\n");
            
            actual=actual.next;
        }
       
           
                 
    }
      
       public String Busespecifico(String bus)
    {
        String conca="";
        nodo actual;
        actual=primero;
        while(actual!=null)
        {
            if(actual.b.id.compareTo(bus)==0){
                conca = conca + " ruta: "+actual.b.nombre+" Horario Inicio: "+actual.b.horarioIni+" Horario Fin: "+actual.b.horarioFin+" Fecha: "+actual.b.fecha+" \n";
            }
            
            actual=actual.next;
        }
       
           return conca;
                 
    }
     
       
    public void busxChofer(int clave,listasdobles Chofer)
    {
        nodo actual;
        actual=primero;
        while(actual!=null)
        {
            if(actual.b.ClaveChofer==clave){
                if(verificar(actual.b.id,Chofer)==true){
                   System.out.println("si existe "+actual.b.id);
                }
                else{
                Chofer.alta(actual.b);
                }
            }
            actual=actual.next;
        }          
    }
    
    public void horarioxChoferxbus(int clavechofer, String id,listasdobles horario){
        nodo actual;
        actual=primero;
         while(actual!=null)
            {
            if((actual.b.ClaveChofer==clavechofer) && (actual.b.id.compareTo(id)==0)){
                horario.alta(actual.b);
                }
            actual=actual.next;
            }
            
        }          
   
    public boolean verificar(String id,listasdobles lista){
        boolean flag=false;
        nodo actual;
        actual = lista.primero;
        
        while(actual!=null){
                if(actual.b.id.compareTo(id)==0){
                    flag=true;
                }
                actual = actual.next;
        }
        return flag;
    }
     
     
    
    
    public void reporteChoferxBus(int chofer){
        listasdobles aux = new listasdobles();
        busxChofer(chofer, aux);
        System.out.println("BUSXCHOFER----------"+chofer);
        aux.imprimir();
        Funcion f = new Funcion();
        f.generarListaDoble(aux,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graph.txt");
        f.generarImagen("graph","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graph.txt");
    }
    
    public void reporteHoraxChofer(int chofer,String id){
        listasdobles aux = new listasdobles();
        horarioxChoferxbus(chofer,id,aux);
        System.out.println("HORARIO-------- chofer "+chofer+" bus "+id);
        aux.imprimir2();
        Funcion f = new Funcion();
        f.generarListaDoble2(aux,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graph.txt");
        f.generarImagen("graph","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graph.txt");
    }
    
}
