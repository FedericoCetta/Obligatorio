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
public class ListaAereolinea implements IListaAereolinea {
     private NodoListaAereolinea inicio;
     private NodoListaAereolinea fin;

    public ListaAereolinea() {
        this.inicio = null;
        this.fin = null;
    }

    public NodoListaAereolinea getInicio() {
        return inicio;
    }

    public void setInicio(NodoListaAereolinea inicio) {
        this.inicio = inicio;
    }

    public NodoListaAereolinea getFin() {
        return fin;
    }

    public void setFin(NodoListaAereolinea fin) {
        this.fin = fin;
    }
     
     
     
    @Override
    public boolean esVacia() {
      return (this.inicio==null);  
    }

    @Override
    public void insertarInicio(String Aereolinea) {
        NodoListaAereolinea nuevo= new NodoListaAereolinea(Aereolinea);
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
    public void agregarFinal(String Aereolinea) {
     if (this.esVacia())
            this.insertarInicio(Aereolinea); // el agregar inicio suma 1 a cantelementos
        
        else
        {
           NodoListaAereolinea nuevo= new NodoListaAereolinea(Aereolinea); 
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
                NodoListaAereolinea aux = this.inicio;
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
            NodoListaAereolinea aux=this.inicio;
            while (aux!=null)  {
                System.out.println(aux.getNombreAereolinea());
                aux=aux.getSiguiente();
            }
        }
    }

    @Override
    public void agregarOrd(String Aereolinea) {
              NodoListaAereolinea nuevo = new NodoListaAereolinea(Aereolinea);
             NodoListaAereolinea aux = this.getInicio(); 
          /*      
        if(this.esVacia()|| nVuelo< this.getInicio().getnVuelo() ){
            
           this.insertarInicio( nVuelo, aereolinea, ciudadOrigen, ciudadDestino,  estrellas,  capacidad,  FechayHoraSalida,  duracion);
            
        }*/
        /*
        else  {
                 while (aux.getSiguiente()!= null && aux.getSiguiente().getnVuelo() < nVuelo )
                         aux=aux.getSiguiente();
                         nuevo.setSiguiente(aux.getSiguiente());
                        aux.setSiguiente(nuevo);
                 
            } 
*/
    }

    @Override
    public NodoListaAereolinea obtenerAereolinea(String Aereolinea) {
     NodoListaAereolinea aux=this.inicio;
        while (aux!=null && aux.getNombreAereolinea().compareTo(Aereolinea) != 0) 
            aux=aux.getSiguiente();
        //encontrÃ© dato o lleguÃ© al final
        return aux;
    }

    @Override
    public boolean existeAerolina(String Aerolinea) {
          NodoListaAereolinea aux=this.getInicio();
          boolean existe = false;
          
          while(aux != null && !existe)
               {
                   if (aux.getNombreAereolinea().compareTo(Aerolinea) == 0) 
                   {
                       existe = true;
                   }
                   else
                       existe = false;
               }
          
          return existe;

    }   
    public void OrdenarListaPorRanking(){
    
        NodoListaAereolinea aux,aux2,temp;
        
        aux = this.getInicio();
        
        while(aux.getSiguiente() != null){
        
            aux2 = aux.getSiguiente();
            
            while(aux2 != null){
                    if(aux2.getRanking() < aux.getRanking()){
                        temp = aux;
                        aux = aux2;
                        aux2 = temp;
                    }
                aux2 = aux2.getSiguiente();
            }
            aux = aux.getSiguiente();
        }
                
    }
    
}
