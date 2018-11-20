
package obligatorio;

import java.util.Calendar;
import java.util.Locale;


public class Obligatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        int [][] mapa  ={{0,1,2,3,-1},{1,0,3,1,4},{2,3,0,-1,1},{3,1,-1,0,1},{-1,4,1,1,0}};
        Prueba p = new Prueba();
        Sistema s = new Sistema();
       
        
        prueba0(p,s, mapa);
        
        

    }
    
    // LA  PUTA MADRE CON GIT
  
    
    
public static void prueba0(Prueba p, Sistema s, int [][] mapa) {
        
    
    p.ver(s.crearSistemaReservas().resultado, Retorno.Resultado.OK, "Se creo sistema");
    
     s.registarAereolinea("CopaAir");
     s.registarAereolinea("Latam");
     s.registarAereolinea("CopaAir");
     s.registarAereolinea("Avianca");
     s.registarAereolinea("AA");
     
     
    p.ver(s.registrarVuelo(1, "AA", "MVD", "SP", 5, 4, "01/10/2018", 4).resultado, Retorno.Resultado.OK, "Se agrego vuelo 1 de AA correctamente");
     s.listaAereolinea.mostrar();
    p.ver(s.registrarVuelo(1, "AA", "MVD", "SP", 5, 4, "01/1/2018", 4).resultado, Retorno.Resultado.ERROR_3, "Se intento agregar vuelo 1 de AA que ya existe");
    
    p.ver(s.registrarVuelo(2, "AA", "MVD", "SP", 8, 4, "01/10/2018", 4).resultado, Retorno.Resultado.ERROR_1, "Cantidad de estrellas incorrecto en  vuelo 2 de AA ");
    p.ver(s.registrarVuelo(2, "AA", "MVD", "SP", 5, -4, "01/12/2018", 4).resultado, Retorno.Resultado.ERROR_2, "Duracion incorrecta en vuelo 2 de AA ");
    p.ver(s.registrarVuelo(1, "Avianca", "MVD", "SP", 5, 4, "01/10/2018", 4).resultado, Retorno.Resultado.OK, "Se agrego vuelo 1 de Avianca correctamente");
    p.ver(s.registrarVuelo(2, "Avianca", "MVD", "SP", 5, 4, "01/10/2018", 4).resultado, Retorno.Resultado.ERROR_4, "Se agrego vuelo 2 de Avianca CON MISMA CIUDADES ");
    p.ver(s.registrarVuelo(3, "Avianca", "MVD", "POA", 5, 4, "01/10/2018", 4).resultado, Retorno.Resultado.OK, "Se agrego vuelo 3 de Avianca CON 1 CIUDAD DISTINTA ");
    p.ver(s.registrarVuelo(3, "CopaAir", "MVD", "MVD", 3, 4, "01/10/2018", 4).resultado, Retorno.Resultado.ERROR_4, "ciudad origen y destino incorrecta");  
   // cargo servicios
   
 
   p.ver(s.ingresarServicio("AA", 1, "Comida").resultado, Retorno.Resultado.OK, "Se registro servicio de comida en vuelo 1 AA");
   p.ver(s.ingresarServicio("AA", 1, "Wifi").resultado, Retorno.Resultado.OK, "Se registro servicio Wifi en vuelo 1 AA");
   p.ver(s.ingresarServicio("AA", 3, "Comida").resultado, Retorno.Resultado.ERROR_1, "Se intenta registrar un servicio en el vuelo 3 de AA que no existe");
  
   p.ver(s.listarServicios(1, "AA").resultado, Retorno.Resultado.OK, " Listado de servicios del vuelo 1 AA");
   
   p.ver(s.borrarServicio("AA", 1, "Wifi").resultado, Retorno.Resultado.OK, "Se borro servicio wifi en vuelo 1 de AA");
   
   p.ver(s.listarServicios(1, "AA").resultado, Retorno.Resultado.OK,s.listarServicios(1, "AA").valorString);
 
  // p.ver(s.listarAerolineasRanking().resultado, Retorno.Resultado.OK, "Listado de ranking ");
   
  
   p.ver(s.ingresarComentario("AA", 1, " regular", 3).resultado, Retorno.Resultado.OK, "Vuelo 1 de AA califacion 3");
    p.ver(s.ingresarComentario("AA", 1, " buen servicio", 4).resultado, Retorno.Resultado.OK, "Vuelo 1 de AA califacion 4");
   p.ver(s.ingresarComentario("AA", 2, " bien", 2).resultado, Retorno.Resultado.ERROR_2, "No existe Vuelo 2 de AA ");
   p.ver(s.ingresarComentario("AA", 1, " bien", 8).resultado, Retorno.Resultado.ERROR_1, "Vuelo 1 de AA califacion 8 fuera de rango");
   

//p.ver(s.ingresarComentario("AA", 5, " regular", 3).resultado, Retorno.Resultado.ERROR_2, "Vuelo 5 de AA incorrecto fue calificado con 3");
   //p.ver(s.listarAerolineasRanking().resultado, Retorno.Resultado.OK, "Listado de ranking ");
      
  p.ver(s.listarComentarios(1,"AA").resultado, Retorno.Resultado.OK, "Lista Comentarios  vuelo 1 de AA");
   
 //p.ver(s.listarComentarios(1,"AA").resultado, Retorno.Resultado.OK,s.listarComentarios(1,"AA").valorString);
 
   p.ver(s.destruirSistemaReservas().resultado, Retorno.Resultado.OK, "Se destruye sistema de reservas");
    p.imprimirResultadosPrueba();
}
 //ss
 
public static void prueba1(Prueba p, Sistema s, int [][] mapa)   { 
   
    p.ver(s.crearSistemaReservas().resultado, Retorno.Resultado.OK, "SE CREO LISTA DE SISTEMA");
    s.registarAereolinea("CopaAir");
     s.registarAereolinea("Latam");
     s.registarAereolinea("CopaAir");
     s.registarAereolinea("American-Airlines");
     
    p.ver(s.registrarVuelo(285, "CopaAir", "MVD", "PTY", 2, 145, "12/12/2018" , 6).resultado, Retorno.Resultado.OK, "Se ingreso el vuelo 285");
    s.listaAereolinea.mostrar();
    p.imprimirResultadosPrueba();

        
        //prueba
        
}    
public static void prueba2(Prueba p, Sistema s, int [][] mapa)   { 
        p.ver(s.Caminomascorto(0, 4, mapa).resultado, Retorno.Resultado.OK, "distancia mas corata");
         p.ver(s.Caminomascorto(0, 4, mapa).resultado, Retorno.Resultado.OK, s.Caminomascorto(0, 4, mapa).valorString);
        p.ver(s.destruirSistemaReservas().resultado, Retorno.Resultado.OK, "Se cerro el sistema");
        p.imprimirResultadosPrueba();
}    


public static void prueba3(Prueba p, Sistema s, int [][]mapa){
  // prueba con matriz dedistancia

        System.out.println("PRUEBA 3");
        System.out.println("_________");
        p.ver(s.crearSistemaReservas().resultado, Retorno.Resultado.OK, "Se crea el sistema.");
        System.out.println("se creo sistema");
        //--------------------------------- 
     s.registarAereolinea("CopaAir");
     s.registarAereolinea("LAN");
     s.registarAereolinea("CopaAir");
     s.registarAereolinea("Avianca");
     s.registarAereolinea("AA");


        // REGISTRO DE VUELOS DE LA AEROLINEA AA

        System.out.println("se registran los vuelos 102 103 104 de AA");

        p.ver(s.registrarVuelo(102, "AA", "Montevideo", "Miami", 5, 1, "12/12/2018", 9).resultado, Retorno.Resultado.OK, "Se registra vuelo 102 de AA");
        p.ver(s.registrarVuelo(103, "AA", "Montevideo", "Nueva York", 5, 1,"12/12/2018", 9).resultado, Retorno.Resultado.OK, "Se registra vuelo 103 de AA");
        p.ver(s.registrarVuelo(104, "AA", "Montevideo", "Orlando", 5, 1,"12/12/2018", 9).resultado, Retorno.Resultado.OK, "Se registra vuelo 104 de AA");     

        // vuelo repetido
        System.out.println("se intenta registrar vuelo 102 de AA repetido");
        p.ver(s.registrarVuelo(102, "AA", "Montevideo", "Miami", 5, 1, "12/12/2018", 9).resultado, Retorno.Resultado.ERROR_3, "Se intenta registrar vuelo repetido 102 de aa");

        // REGISTRO DE VUELOS DE LA AEROLINEA LAN

        System.out.println("Registro de vuelos 701 702 de LAN");
        p.ver(s.registrarVuelo(701, "LAN", "San Pablo", "MilÃƒÂ¡n", 4, 4,"12/12/2018", 12).resultado, Retorno.Resultado.OK, "Se crea el vuelo LAN 701");
        p.ver(s.registrarVuelo(702, "LAN", "Montevideo", "Santiago", 3, 100, "15/12/2018", 2).resultado, Retorno.Resultado.OK, "Se crea el vuelo LAN 702");

        System.out.println("se intenta regisrar vuelo 702 de LAN Repetido");
        p.ver(s.registrarVuelo(702, "LAN", "Montevideo", "Santiago", 3, 100, "20/12/2018", 2).resultado, Retorno.Resultado.ERROR_3, "se intenta regisrar vuelo 702 de LAN Repetido");
   
        // LISTADO DE VUELOS DE LA AEROLINEA LAN

        System.out.println("LISTADO DE VUELOS AEROLINEA LAN");

        System.out.println("_______________________________");

        p.ver(s.listarVuelosAerolinea("LAN").resultado, Retorno.Resultado.OK, "Lista vuelos de LAN.");

         // INGRESO DE SERVICIOS AL VUELO 701 DE LAN

        System.out.println("INGRESO DE SERVICIOS 1 2 3 DEL VUELO 701 LAN");
        p.ver(s.ingresarServicio("LAN", 701, "Servicio1").resultado, Retorno.Resultado.OK, "Se crea el servicio Servicio1");
        p.ver(s.ingresarServicio("LAN", 701, "Servicio2").resultado, Retorno.Resultado.OK, "Se crea el servicio Servicio2");
        p.ver(s.ingresarServicio("LAN", 701, "Servicio3").resultado, Retorno.Resultado.OK, "Se crea el servicio Servicio3");
        
        // LISTADO DE SERVICIOS DEL VUELO 701 DE LAN

        System.out.println("LISTADO DE SERVICIOS DEL VUELO 701");
        p.ver(s.listarServicios(701, "LAN").resultado, Retorno.Resultado.OK, "Lista servicios del vuelo LAN 701");

        // SE BORRA UN SERVICIO DEL VUELO 701 DE LAN
        /*revisar aca*/
        System.out.println("SE BORRA SERVICIO 2 DEL VUELO 701 DE LAN");

        p.ver(s.borrarServicio("LAN", 701, "Servicio2").resultado, Retorno.Resultado.OK, "Se borra el servicio 1 recientemente creado.");

        
        // SE LISTA NUEVAMENTE LOS SERVICIOS DEL VUELO 701 DE LAN

         System.out.println("LISTADO DE SERVICIOS DEL VUELO 701");
        p.ver(s.listarServicios(701, "LAN").resultado, Retorno.Resultado.OK,

                "Lista servicios del vuelo LAN 701");       
        
// RESERVAS DEL VUELO 701 DE LAN

         System.out.println("SE AGREGAN 4 RESERVAS AL VUELO 701 LAN CON CUPO 4");
        p.ver(s.realizarReserva(1, 701, "LAN").resultado, Retorno.Resultado.OK,

                "Se ingresa una reserva al Vuelo LAN 701.");

        p.ver(s.realizarReserva(2, 701, "LAN").resultado, Retorno.Resultado.OK,

                "Se ingresa una reserva al Vuelo LAN 701.");

        p.ver(s.realizarReserva(3, 701, "LAN").resultado, Retorno.Resultado.OK,

                "Se ingresa una reserva al Vuelo LAN 701.");

        p.ver(s.realizarReserva(4, 701, "LAN").resultado, Retorno.Resultado.OK,

                "Se ingresa una reserva al Vuelo LAN 701.");

        // LISTA DE ESPERA - QUE DEBE SER VACIA        

         System.out.println("LISTADO DE ESPERA DEL VUELO 701");

        p.ver(s.listarEspera(701, "LAN").resultado, Retorno.Resultado.OK,

                "Lista lista de espera del vuelo LAN 701. DeberÃƒÂ­a ser vacÃƒÂ­a.");      

        // NUEVAS RESERVAS AL VUELO 701 QUE SUPERAN CAPACIDAD

         System.out.println("SE AGREGAN LAS RESERVAS 5 Y 6 DEL VUELO 701");
        p.ver(s.realizarReserva(5, 701, "LAN").resultado, Retorno.Resultado.OK, "Se ingresa una reserva al Vuelo LAN 701.DEBE IR A COLA DE ESPERA");
        p.ver(s.realizarReserva(6, 701, "LAN").resultado, Retorno.Resultado.OK, "Se ingresa una reserva al Vuelo LAN 701. DEBE IR A COLA DE ESPERA");

        // AHORA DEBEN ESTASR EN LISTA DE ESPERA

         System.out.println("LISTADO DE ESPERA DEL VUELO 701");

        p.ver(s.listarEspera(701, "LAN").resultado, Retorno.Resultado.OK, "Lista lista de espera del vuelo LAN 701. DeberÃƒÂ­a mostrar 5 y 6.");



        // SE CANCELA RESERVA 2 DEL VUELO 701 DE LAN

         System.out.println("SE CANCELA RESERVA 2 DEL VUELO 701");

        p.ver(s.cancelarReserva(2, 701, "LAN").resultado, Retorno.Resultado.OK,"Se cancela la reserva al Vuelo LAN 701 del cliente 2.");

        

        // SE CHEQUEA QUE SE ASIGNE EL PRIMERO DE LA LISTA DE ESPERA POR RESERVA CANCELADA

         System.out.println("LISTADO DE ESPERA DEL VUELO 701");

        p.ver(s.listarEspera(701, "LAN").resultado, Retorno.Resultado.OK, "Lista lista de espera del vuelo LAN 701. DeberÃƒÂ­a mostrar 6.");



        // SE INGRESAN COMENTARIOS PARA VER TEMA RANKING

         System.out.println("SE INGRESAN COMENTARIOS PARA VER TEMA RANKING ");

        p.ver(s.ingresarComentario("LAN", 701, "Comentario de Prueba", 5).resultado, Retorno.Resultado.OK,"Se ingresa un comentario al Vuelo LAN 701.");
        p.ver(s.ingresarComentario("LAN", 701, "Comentario de Prueba", 2).resultado, Retorno.Resultado.OK,"Se ingresa un comentario al Vuelo LAN 701.");
        p.ver(s.ingresarComentario("AA", 102, "Comentario de Prueba", 5).resultado, Retorno.Resultado.OK,"Se ingresa un comentario al Vuelo LAN 102.");

        p.ver(s.ingresarComentario("AA", 102, "Comentario de Prueba", 4).resultado, Retorno.Resultado.OK,"Se ingresa un comentario al Vuelo LAN 102.");

        // LISTA RANKING

        System.out.println("RANKING DE AEROLINEAS");

        p.ver(s.listarAerolineasRanking().resultado, Retorno.Resultado.OK, "Lista aerolÃƒÂ­neas por ranking.");

        

        // AGREGA COMENTARIOS PRA ALTERAR RANKING

        System.out.println("SE AGREGAN COMENTARIOS PRA ALTERAR RANKING DE AEROLINEAS");
        p.ver(s.ingresarComentario("AA", 102, "Comentario de Prueba", 1).resultado, Retorno.Resultado.OK, "Se ingresa un comentario al Vuelo LAN 702.");
        p.ver(s.ingresarComentario("LAN", 701, "Comentario de Prueba", 5).resultado, Retorno.Resultado.OK,"Se ingresa un comentario al Vuelo LAN 701.");
        p.ver(s.ingresarComentario("LAN", 702, "Comentario de Prueba", 3).resultado, Retorno.Resultado.OK,"Se ingresa un comentario al Vuelo LAN 702.");

        // LISTA RANKING NUEVAMENTE PARA VER CAMBIO

        System.out.println("NUEVO RANKING DE AEROLINEAS");

        p.ver(s.listarAerolineasRanking().resultado, Retorno.Resultado.OK,"Lista aerolÃƒÂ­neas por ranking.");

        // LISTA VUELOS DE LA AEROLINEA LAN

        System.out.println("VUELOS DE AEROLINEA LAN");

        p.ver(s.listarVuelosAerolinea("LAN").resultado, Retorno.Resultado.OK,"Lista vuelos de LAN.");

        

        // COMENTARIOS AL VUELO 702

        System.out.println("COMENTARIOS AL VUELO 702");
        p.ver(s.ingresarComentario("LAN", 702, "Comentario de Prueba", 5).resultado, Retorno.Resultado.OK,"Se ingresa un comentario al Vuelo LAN 702.");
        p.ver(s.ingresarComentario("LAN", 702, "Comentario de Prueba", 5).resultado, Retorno.Resultado.OK, "Se ingresa un comentario al Vuelo LAN 702.");
        p.ver(s.listarVuelosAerolinea("LAN").resultado, Retorno.Resultado.OK, "Lista vuelos de LAN.");        
        // MUESTRA MATRIZ DE DISTANCIAS

        System.out.println("MATRIZ DE DISTANCIAS");
        p.ver(s.mostarDistancias().resultado, Retorno.Resultado.OK, "comentario");

        //MUESTRA camino mas corto.
        System.out.println("CAMINO MAS CORTO");
        p.ver(s.Caminomascorto(0, 4, mapa).resultado, Retorno.Resultado.OK, "Camino mas corto");
        p.imprimirResultadosPrueba();
    }


}
