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
    public void agregarOrd(String Aereolinea, int ranking, int cantidadestrellas, int cantidadcomentarios, ListaVuelos listadevuelos) {
              NodoListaAereolinea nuevo = new NodoListaAereolinea(Aereolinea);
              nuevo.setRanking(ranking);
              nuevo.setCantidadEstrellas(cantidadestrellas);
              nuevo.setCantidadComentarios(cantidadcomentarios);
              nuevo.setLVuelosAereolinea(listadevuelos);
              
             NodoListaAereolinea aux = this.getInicio(); 
             
         
                
        if(this.esVacia()|| nuevo.getRanking()>= this.getInicio().getRanking()){
            
             this.insertarInicioNodo(nuevo);
             if (nuevo.getSiguiente()== null) {
                 nuevo.setSiguiente(this.fin);
                
            }
             return;
            
                     }
//        if (this.esVacia()|| nuevo.getRanking()<= this.fin.getRanking()) {
//            
//             this.agregarFinalNodo(nuevo);
//             return;
//            
//        }
        
        else  {
                 while (aux.getSiguiente()!= null &&  nuevo.getRanking() < aux.getSiguiente().getRanking()) {
                     
                        aux=aux.getSiguiente();
                        nuevo.setSiguiente(aux.getSiguiente());
                        aux.setSiguiente(nuevo);
                  } 
            } 

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
  public void OrdenarListaPorRanking(NodoListaAereolinea inicio){
    
        NodoListaAereolinea aux,aux2,temp;
        
        aux = inicio;
        
        while(aux.getSiguiente() != null){
        
            aux2 = aux.getSiguiente();
            
            while(aux2.getSiguiente() != null){
                    if(aux2.getRanking() <= aux.getRanking()){
                        temp = aux;
                        aux = aux2;
                        aux2 = temp;
                        
                    }
                aux2 = aux.getSiguiente();
               
            }
             aux = aux.getSiguiente();
        }
                
    }

    @Override
    public void borrarelemento(String aerolinea) {
             if (this.inicio != null) {
                        NodoListaAereolinea aux = this.inicio;
                NodoListaAereolinea ant = null;
                while (aux != null) {
                    if (aux.getNombreAereolinea()== aerolinea) {
                        if (ant == null) {
                            this.inicio = this.inicio.getSiguiente();
                            aux.setSiguiente(null);
                            aux = this.inicio;
                        } else {
                            ant.setSiguiente(aux.getSiguiente());
                            aux.setSiguiente(null);
                            aux = ant.getSiguiente();
                        }
                    } else {
                        ant = aux;
                        aux = aux.getSiguiente();
                    }
                }
            
        }
      //  this.cantElementos = this.cantElementos - 1; 
    }
    
    

    @Override
    public void insertarInicioNodo(NodoListaAereolinea Aereolinea) {
       // NodoListaAereolinea nuevo= new NodoListaAereolinea(Aereolinea);
        Aereolinea.setSiguiente(inicio);
        this.inicio=Aereolinea;
        if(this.fin==null)//estoy insertando el primer nodo
            this.fin=Aereolinea;    }

//    @Override
//    public void agregarFinalNodo(NodoListaAereolinea Aereolinea) {
//        if (this.esVacia())
//            this.insertarInicioNodo(Aereolinea); // el agregar inicio suma 1 a cantelementos
//        
//        else
//        {
//          // NodoListaAereolinea nuevo= new NodoListaAereolinea(Aereolinea); 
//           this.fin.setSiguiente(Aereolinea);
//           this.fin =Aereolinea;
//          
//        }        }
    
    
    
    
}
