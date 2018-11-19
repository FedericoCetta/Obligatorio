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
public interface IListaVuelos {
    public boolean esVacia();
    public void insertarInicio(int nVuelo, String aereolinea, String ciudadOrigen, String ciudadDestino, int estrellas, int capacidad, String FechayHoraSalida, int duracion);
    public void borrarInicio();
    public void agregarFinal(int nVuelo, String aereolinea, String ciudadOrigen, String ciudadDestino, int estrellas, int capacidad, String FechayHoraSalida, int duracion);
    public void borrarFin();
    public void vaciar();
    public void mostrar();
    public void agregarOrd(int nVuelo, String aereolinea, String ciudadOrigen, String ciudadDestino, int estrellas, int capacidad, String FechayHoraSalida, int duracion);
    public NodoListaVuelos obtenerVuelo(int numeroVuelo);
       public boolean obtenerCiudadyDestino(String aereolinea,String ciudadOrigen, String ciudadDestino);
    
}
