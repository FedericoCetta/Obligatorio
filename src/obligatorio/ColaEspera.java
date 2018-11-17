/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio;


//hola
/**
 *
 * @author Usuario
 */
public class ColaEspera implements IColaEspera {
    int tope;
    int cantelementos;
    NodoColaEspera front;
    NodoColaEspera back;
    
    
    public ColaEspera(int maximo) {
        this.tope = maximo;
        this.cantelementos = 0;
        this.front = null;
        this.back = null;
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public int getCantelementos() {
        return cantelementos;
    }

    public void setCantelementos(int cantelementos) {
        this.cantelementos = cantelementos;
    }

    public NodoColaEspera getFront() {
        return front;
    }

    public void setFront(NodoColaEspera front) {
        this.front = front;
    }

    public NodoColaEspera getBack() {
        return back;
    }

    public void setBack(NodoColaEspera back) {
        this.back = back;
    }

    // maximo es la cantidad de elementos que soportara la cola
    @Override
    public void encolar(int cliente, int Vuelo, String aereolinea) {
      NodoColaEspera nuevo=new NodoColaEspera(cliente, Vuelo, aereolinea);
                          
           if ( this.cantelementos<this.tope ){
                if (!this.esVacia()){
                   this.back.siguiente=nuevo;
                   this.back=nuevo;
                }else{               
                     this.back=nuevo;
                     this.front=nuevo;
                     }
              this.cantelementos=this.cantelementos+1;
           }       
    }

    @Override
    public void desencolar() {
   if (!this.esVacia()){
          this.setFront(this.front.getSiguiente());
          this.cantelementos=this.cantelementos-1;
      }    }
 @Override
    public boolean esVacia() {
        return (this.front==null);       
    }

    @Override
    public boolean esllena() {
        return (this.getCantelementos()==this.getTope());

    }

    @Override
    public Object frente() {
        if (!this.esVacia()){
         int dato = front.cliente;
         int vuelo = front.nVuelo;
         String aereo = front.aereolinea;
         return dato+vuelo+aereo;
        
        }
            
        else
            return ("Esta vacia:");

    }

    @Override
    public int elementos() {
        return this.cantelementos;
    }
    
    
}
