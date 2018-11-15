/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio;

/**
 *
 * @author Usuario
 */
public class ListaReservas implements IListaReservas{
    private NodoListaReservas inicio;
     private NodoListaReservas fin;
     
         public void ListaReservas(){
        this.inicio=null;
        this.fin=null;
        
    }

    public NodoListaReservas getInicio() {
        return inicio;
    }

    public void setInicio(NodoListaReservas inicio) {
        this.inicio = inicio;
    }

    public NodoListaReservas getFin() {
        return fin;
    }

    public void setFin(NodoListaReservas fin) {
        this.fin = fin;
    }
//sdsds
    
    @Override
    public boolean esVacia() {
      return (this.inicio==null);  
    }
    @Override
    public void InsertarInicio(int cliente, int nVuelo, String aereolinea) {
         NodoListaReservas nuevo= new NodoListaReservas(cliente,  nVuelo,  aereolinea);
        nuevo.setSiguiente(inicio);
        this.inicio=nuevo;
        if(this.fin==null)//estoy insertando el primer nodo
            this.fin=nuevo;
    }

   @Override
    public void borrarInicio() {
          if (!this.esVacia())
            this.inicio=this.inicio.getSiguiente(); 
    }
    @Override
    public void agregarFinal(int cliente, int nVuelo, String aereolinea) {
             if (this.esVacia())
            this.InsertarInicio(cliente,  nVuelo,aereolinea); // el agregar inicio suma 1 a cantelementos
        
        else
        {
           NodoListaReservas nuevo= new NodoListaReservas(cliente,  nVuelo,  aereolinea); 
           fin.setSiguiente(nuevo);
           fin =nuevo;
          
        }  
    }

   
    @Override
    public void borrarFin() {
       if (!this.esVacia()){
            if (this.inicio==this.fin)
                this.borrarInicio();  // actualiza canelementos
            else{
                NodoListaReservas aux = this.inicio;
                while (aux.getSiguiente().getSiguiente() != null)
                    aux=aux.getSiguiente();
                this.fin=aux;
                this.fin.setSiguiente(null);
                
            }
        }
    }

   @Override
    public void vaciar() {
            this.inicio=null;
             this.fin=null;
    }

  
    @Override
    public void mostrar() {
              if (this.esVacia())
            System.out.println("No hay aereolineas registradas");
        else  {
            NodoListaReservas aux=this.inicio;
            while (aux!=null)  {
                System.out.println(aux.getnVuelo()+aux.getnVuelo()+aux.getAereolinea());
                aux=aux.getSiguiente();
            }
        }
    }

    @Override
    public void agregarOrd(int cliente, int nVuelo, String aereolinea) {
            NodoListaReservas  nuevo = new NodoListaReservas( cliente,nVuelo,aereolinea);
             NodoListaReservas aux = this.getInicio(); 
                
        if(this.esVacia()|| nVuelo< this.getInicio().getnVuelo() ){
            
           this.InsertarInicio( cliente,nVuelo,aereolinea);
            
        }
        
        else  {
                 while (aux.getSiguiente()!= null && aux.getSiguiente().getnVuelo() < nVuelo )
                         aux=aux.getSiguiente();
                         nuevo.setSiguiente(aux.getSiguiente());
                        aux.setSiguiente(nuevo);
                 
            } 
                  }

    @Override
    public NodoListaReservas obtenerReserva(int numeroVuelo, int cliente) {
         NodoListaReservas aux=this.inicio;
        while (aux!=null && aux.getnVuelo()!=numeroVuelo && aux.getCliente() != cliente)
            aux=aux.getSiguiente();
        //encontrÃ© dato o lleguÃ© al final
        return aux;
    }
         
         
         
}
