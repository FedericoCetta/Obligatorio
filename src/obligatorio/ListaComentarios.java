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
public class ListaComentarios implements IListaComentarios{
  private NodoListaComentarios inicio;
     private NodoListaComentarios fin;
    
    
        public void ListaComentarios(){
        this.inicio=null;
        this.fin=null;
        
    }    

    public NodoListaComentarios getInicio() {
        return inicio;
    }

    public void setInicio(NodoListaComentarios inicio) {
        this.inicio = inicio;
    }

    public NodoListaComentarios getFin() {
        return fin;
    }

    public void setFin(NodoListaComentarios fin) {
        this.fin = fin;
    }

    @Override
    public boolean esVacia() {
        return (this.inicio==null);    
    }

    //
    @Override
    public void agregarInicio(String aerolinea, int numero, String comentario, int ranking) {
        NodoListaComentarios nuevo = new NodoListaComentarios(aerolinea,numero, comentario, ranking);
        nuevo.setSiguiente(nuevo);
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
    public void agregarFinal(String aerolinea, int numero, String comentario, int ranking) {
         if (this.esVacia())
            this.agregarInicio(aerolinea, numero, comentario, ranking);
        
        else
        {
           NodoListaComentarios nuevo= new NodoListaComentarios(aerolinea,numero,  comentario,  ranking); 
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
                NodoListaComentarios aux = this.inicio;
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
            System.out.println("No hay comentarios registrados");
        else  {
            NodoListaComentarios aux=this.inicio;
            while (aux!=null)  {
                System.out.println(aux.getAerolinea()+aux.getComentario());
                aux=aux.getSiguiente();
            }
        }
    }

    @Override
    public void agregarOrd(String aerolinea, int numero, String comentario, int ranking) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NodoListaComentarios obtenerComentario(int numeroVuelo) {
             NodoListaComentarios aux=this.inicio;
        while (aux!=null && aux.getNumero()!=numeroVuelo )
            aux=aux.getSiguiente();
        //encontrÃ© dato o lleguÃ© al final
        return aux;
    }

 
    
    
}
