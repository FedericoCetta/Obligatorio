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
public class ListaServicios implements IListaServicios{
  NodoListaServicios inicio;
    NodoListaServicios fin;
    public ListaServicios() {
        this.inicio = null;
        this.fin = null;
    }

    public NodoListaServicios getInicio() {
        return inicio;
    }

    public void setInicio(NodoListaServicios inicio) {
        this.inicio = inicio;
    }

    public NodoListaServicios getFin() {
        return fin;
    }

    public void setFin(NodoListaServicios fin) {
        this.fin = fin;
    }
    
    @Override
    public boolean esVacia() {
            return (this.inicio==null);     
    
    }

    @Override
    public void insertarInicio(String aerolinea, int numeroVuelo, String servicio) {
         NodoListaServicios nuevo= new NodoListaServicios(aerolinea,  numeroVuelo,  servicio);
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
    public void insertarFinal(String aerolinea, int numeroVuelo, String servicio) {
     if (this.esVacia())
            this.insertarInicio(aerolinea,  numeroVuelo,  servicio); // el agregar inicio suma 1 a cantelementos
        
        else
        {
           NodoListaServicios nuevo= new NodoListaServicios(aerolinea,  numeroVuelo,  servicio); 
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
                NodoListaServicios aux = this.inicio;
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
            System.out.println("No hay servicios registrados de vuelos");
        else  {
            NodoListaServicios aux=this.inicio;
            while (aux!=null)  {
                System.out.println(aux.getNumeroVuelo()+aux.getServicio());
                aux=aux.getSiguiente();
            }
        }
    }

    @Override
    public void agregarOrd(String aerolinea, int numeroVuelo, String servicio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NodoListaServicios obtenerServicioDelVuelo( int numeroVuelo) {
                NodoListaServicios aux=this.inicio;
        while (aux!=null && aux.getNumeroVuelo()!=numeroVuelo)
                aux=aux.getSiguiente();
        //encontrÃ© dato o lleguÃ© al final
        return aux; 
    }
}
