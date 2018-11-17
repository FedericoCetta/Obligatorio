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
public interface IListaComentarios {
    public boolean esVacia();
    public void agregarInicio(String aerolinea, int numero, String comentario, int ranking);
    public void borrarInicio();
    public void agregarFinal(String aerolinea, int numero, String comentario, int ranking);
    public void borrarFin();
    public void vaciar();
    public void mostrar();
    public void agregarOrd(String aerolinea, int numero, String comentario, int ranking);
    public NodoListaComentarios obtenerComentario(int numeroVuelo);
}
