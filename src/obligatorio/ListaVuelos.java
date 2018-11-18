/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio;

import java.util.Calendar;


/**
 *
 * @author Usuario
 */
public class ListaVuelos implements IListaVuelos {
     private NodoListaVuelos inicio;
     private NodoListaVuelos fin;

        public void ListaVuelos(){
        this.inicio=null;
        this.fin=null;
        
    }

    public NodoListaVuelos getInicio() {
        return inicio;
    }

    public void setInicio(NodoListaVuelos inicio) {
        this.inicio = inicio;
    }

    public NodoListaVuelos getFin() {
        return fin;
    }

    public void setFin(NodoListaVuelos fin) {
        this.fin = fin;
    }
        
    @Override
    public boolean esVacia() {
         return (this.getInicio()==null);   

    }

    @Override
    public void insertarInicio(int nVuelo, String aereolinea, String ciudadOrigen, String ciudadDestino, int estrellas, int capacidad, String FechayHoraSalida, int duracion) {
        NodoListaVuelos nuevo= new NodoListaVuelos( nVuelo, aereolinea, ciudadOrigen, ciudadDestino,  estrellas,  capacidad,  FechayHoraSalida,  duracion);
        nuevo.setSiguiente(this.getInicio());
        this.setInicio(nuevo);
        if(this.getFin()==null)//estoy insertando el primer nodo
           this.setFin(nuevo);
        
      
    
    }

    @Override
    public void borrarInicio() {
            if (!this.esVacia()){
            this.inicio=this.inicio.getSiguiente();
            
        }
    }

    @Override
    public void agregarFinal(int nVuelo, String aereolinea, String ciudadOrigen, String ciudadDestino, int estrellas, int capacidad, String FechayHoraSalida, int duracion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarFin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vaciar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrar() {
   if (this.esVacia())
            System.out.println("Lista es vacía");
        else  {
            NodoListaVuelos aux=this.inicio;
            while (aux!=null)  {
                System.out.println(aux.getnVuelo()+aux.getDuracion()+
                                   aux.getCapacidad()+aux.getAereolinea()+
                                   aux.getFechayHoraSalida()+
                                   aux.getCiudadOrigen()+aux.getCiudadDestino());
                aux=aux.getSiguiente();
            }
        }
    }

    @Override
    public void agregarOrd(int nVuelo, String aereolinea, String ciudadOrigen, String ciudadDestino, int estrellas, int capacidad, String FechayHoraSalida, int duracion) {
        NodoListaVuelos  nuevo = new NodoListaVuelos( nVuelo, aereolinea, ciudadOrigen, ciudadDestino,  estrellas,  capacidad,  FechayHoraSalida,  duracion);
             NodoListaVuelos aux = this.getInicio(); 
                
        if(this.esVacia()|| nVuelo< this.getInicio().getnVuelo() ){
            
           this.insertarInicio( nVuelo, aereolinea, ciudadOrigen, ciudadDestino,  estrellas,  capacidad,  FechayHoraSalida,  duracion);
            
        }
        
        else  {
                 while (aux.getSiguiente()!= null && aux.getSiguiente().getnVuelo() < nVuelo )
                         aux=aux.getSiguiente();
                         nuevo.setSiguiente(aux.getSiguiente());
                        aux.setSiguiente(nuevo);
                 
            } 
              
    }    


    @Override
    public NodoListaVuelos obtenerVuelo(int numeroVuelo) {
          NodoListaVuelos aux=this.inicio;
        while (aux!=null && aux.getnVuelo()!=numeroVuelo)
            aux=aux.getSiguiente();
        //encontrÃ© dato o lleguÃ© al final
        return aux;  
    }

    @Override
    public NodoListaVuelos obtenerCiudadyDestino(String aereolinea,String ciudadOrigen, String ciudadDestino) {
         NodoListaVuelos aux=this.inicio;
        while (aux!=null && aux.getAereolinea()==aereolinea && aux.getCiudadOrigen().toString() != ciudadOrigen && aux.getCiudadDestino().toString() !=ciudadDestino)
            aux=aux.getSiguiente();
        //encontrÃ© dato o lleguÃ© al final
        return aux;  
    }
    
}
