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
public interface ISistema {
     Retorno crearSistemaReservas();
 Retorno destruirSistemaReservas();
 Retorno registrarVuelo(int numero, String aerolinea, String ciudadOrigen, String ciudadDestino, int estrellas, int capacidad, String fechaHoraSalida, int duracion);
 Retorno ingresarServicio(String aerolinea, int numero, String servicio);
 Retorno borrarServicio(String aerolinea, int numero, String servicio); 
 Retorno ingresarComentario(String aerolinea, int numero, String comentario, int ranking);
 Retorno realizarReserva(int cliente, int numero, String aerolinea);
 Retorno cancelarReserva(int cliente, int numero, String aerolinea);
 Retorno listarServicios(String numero, String aerolinea);
 Retorno listarVuelosAerolinea(String aerolinea);
 Retorno listarAerolineasRanking();
 Retorno listarComentarios(int numero, String aerolinea);
 Retorno listarEspera(int numero, String aerolinea);
 Retorno mostarDistancias(); 
 // agregado 
 Retorno Caminomascorto(int  ciudadOrigen, int ciudadDestino,int[][] mapa);
}


