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
public interface IListaReservas {
    public boolean esVacia();
    public void InsertarInicio(int cliente, int nVuelo, String aereolinea);
    public void borrarInicio();
    public void agregarFinal(int cliente, int nVuelo, String aereolinea);
    public void borrarFin();
    public void vaciar();
    public void mostrar();
    public void agregarOrd(int cliente, int nVuelo, String aereolinea);
    public NodoListaReservas obtenerReserva(int numeroVuelo,int cliente);
    
}
