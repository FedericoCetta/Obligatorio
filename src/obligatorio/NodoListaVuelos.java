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
public class NodoListaVuelos {
         
        int nVuelo;
        String aereolinea;
        String ciudadOrigen;
        String ciudadDestino;
        int estrellas;
        int capacidad;
        Calendar FechayHoraSalida;
        int duracion;
	private NodoListaVuelos siguiente;
        
       // Listas que contiene cada vuelo
        ListaServicios LServicios;
        ListaReservas  LReservas;
        ColaEspera    LEspera;//cola
        ListaComentarios LComentarios;
        
        
    public NodoListaVuelos(int nVuelo, String aereolinea, String ciudadOrigen, String ciudadDestino, int estrellas, int capacidad, Calendar FechayHoraSalida, int duracion) {
        this.nVuelo = nVuelo;
        this.aereolinea = aereolinea;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.estrellas = estrellas;
        this.capacidad = capacidad;
        this.FechayHoraSalida = FechayHoraSalida;
        this.duracion = duracion;
        this.siguiente = null;
        this.LServicios = new ListaServicios();
        this.LEspera= new ColaEspera(10);
        this.LReservas = new ListaReservas();
        this.LComentarios = new ListaComentarios();
    }

    public int getnVuelo() {
        return nVuelo;
    }

    public void setnVuelo(int nVuelo) {
        this.nVuelo = nVuelo;
    }

    public String getAereolinea() {
        return aereolinea;
    }

    public void setAereolinea(String aereolinea) {
        this.aereolinea = aereolinea;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Calendar getFechayHoraSalida() {
        return FechayHoraSalida;
    }

    public void setFechayHoraSalida(Calendar FechayHoraSalida) {
        this.FechayHoraSalida = FechayHoraSalida;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public NodoListaVuelos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaVuelos siguiente) {
        this.siguiente = siguiente;
    }

    

   

    

}
