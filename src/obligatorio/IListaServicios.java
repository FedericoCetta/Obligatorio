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
public interface IListaServicios {
     public boolean esVacia();
    public void insertarInicio(String aerolinea, int numeroVuelo, String servicio);
    public void borrarInicio();
    public void insertarFinal(String aerolinea, int numeroVuelo, String servicio);
    public void borrarFin();
    public void vaciar();
    public void mostrar();
    public void agregarOrd(String aerolinea, int numeroVuelo, String servicio);
    public NodoListaServicios obtenerServicioDelVuelo( int numeroVuelo);
    public void borrarelemento(String aerolinea, int numeroVuelo);
}
