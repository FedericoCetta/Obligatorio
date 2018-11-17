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
public interface IListaAereolinea {
     public boolean esVacia();
    public void insertarInicio(String Aereolinea);
    public void borrarInicio();
    public void agregarFinal( String Aereolinea);
    public void borrarFin();
    public void vaciar();
    public void mostrar();
    public void agregarOrd(String Aereolinea);
    public NodoListaAereolinea obtenerAereolinea(String Aereolinea);
    public boolean existeAerolina (String Aerolinea);
    
}
