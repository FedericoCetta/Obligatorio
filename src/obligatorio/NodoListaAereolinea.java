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
public class NodoListaAereolinea {
        String NombreAereolinea;
        int Ranking;// el promedio es el ranking
        
        
        int cantidadEstrellas;
        int cantidadComentarios;
    
       
        
        
	private NodoListaAereolinea siguiente;
        
       // Listas que contiene cada aereolinea
        ListaVuelos LVuelosAereolinea;
        
    public NodoListaAereolinea(String NombreAereolinea) {
        this.NombreAereolinea = NombreAereolinea;
        this.Ranking = 0;
        this.cantidadComentarios = 0;
        this.cantidadEstrellas = 0;
        this.siguiente = null;
        this.LVuelosAereolinea = new ListaVuelos();
    
    }

    public int getCantidadEstrellas() {
        return cantidadEstrellas;
    }

    public void setCantidadEstrellas(int cantidadEstrellas) {
        this.cantidadEstrellas = cantidadEstrellas;
    }

    public int getCantidadComentarios() {
        return cantidadComentarios;
    }

    public void setCantidadComentarios(int cantidadComentarios) {
        this.cantidadComentarios = cantidadComentarios;
    }

    public String getNombreAereolinea() {
        return NombreAereolinea;
    }

    public void setNombreAereolinea(String NombreAereolinea) {
        this.NombreAereolinea = NombreAereolinea;
    }

    public int getRanking() {
        return Ranking;
    }

    public void setRanking(int Ranking) {
        this.Ranking = Ranking;
    }

    public NodoListaAereolinea getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaAereolinea siguiente) {
        this.siguiente = siguiente;
    }

    public ListaVuelos getLVuelosAereolinea() {
        return LVuelosAereolinea;
    }

    public void setLVuelosAereolinea(ListaVuelos LVuelosAereolinea) {
        this.LVuelosAereolinea = LVuelosAereolinea;
    }
        
        
}
