/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio;

/**
 *
 * @author Maximiliano
 */
public class NodoRanking {
    String nombreAerolinea;
    int contadorEstrellas;
    int contadorRegistros;
    int promedio;

    public NodoRanking(String nombreAerolinea, int contadorEstrellas, int contadorRegistros, int promedio) {
        this.nombreAerolinea = nombreAerolinea;
        this.contadorEstrellas = contadorEstrellas;
        this.contadorRegistros = contadorRegistros;
        this.promedio = promedio;
    }

    public String getNombreAerolinea() {
        return nombreAerolinea;
    }

    public void setNombreAerolinea(String nombreAerolinea) {
        this.nombreAerolinea = nombreAerolinea;
    }

    public int getContadorEstrellas() {
        return contadorEstrellas;
    }

    public void setContadorEstrellas(int contadorEstrellas) {
        this.contadorEstrellas = contadorEstrellas;
    }

    public int getContadorRegistros() {
        return contadorRegistros;
    }

    public void setContadorRegistros(int contadorRegistros) {
        this.contadorRegistros = contadorRegistros;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }
    
}
