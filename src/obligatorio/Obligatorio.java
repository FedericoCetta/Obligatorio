
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
    
    
  
    
    
public static void prueba0(Prueba p, Sistema s, int [][] mapa) {
        
    
    p.ver(s.crearSistemaReservas().resultado, Retorno.Resultado.OK, "Se creo sistma de reservas para x ciudades");
    
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
 //     p.ver(s.registrarVuelo(1, "Avianca", "MVD", "SP", 5, 4, "01/10/2018", 4).resultado, Retorno.Resultado.OK, "Se agrego vuelo 1 de Avianca correctamente");
 //   p.ver(s.registrarVuelo(3, "CopaAir", "MVD", "SP", 3, 4, "01/10/2018", 4).resultado, Retorno.Resultado.ERROR_4, "ciudad origen y destino incorrecta");  
   // cargo servicios
   
   /*
   p.ver(s.ingresarServicio("AA", 1, "Comida").resultado, Retorno.Resultado.OK, "Se registro servicio de comida en vuelo 1 AA");
   p.ver(s.ingresarServicio("AA", 1, "Wifi").resultado, Retorno.Resultado.OK, "Se registro servicio Wifi en vuelo 1 AA");
   p.ver(s.ingresarServicio("AA", 3, "Comida").resultado, Retorno.Resultado.ERROR_1, "Se intenta registrar un servicio en el vuelo 3 de AA que no existe");
   
   p.ver(s.listarServicios("1", "AA").resultado, Retorno.Resultado.OK, " Listado de servicios del vuelo 1 AA");
   
   p.ver(s.borrarServicio("AA", 1, "Wifi").resultado, Retorno.Resultado.OK, "Se borro servicio wifi en vuelo 1 de AA");
   
   p.ver(s.listarServicios("1", "AA").resultado, Retorno.Resultado.OK, " Listado de servicios del vuelo 1 AA");

   p.ver(s.listarAerolineasRanking().resultado, Retorno.Resultado.OK, "Listado de ranking ");
   p.ver(s.ingresarComentario("AA", 1, " regular", 3).resultado, Retorno.Resultado.OK, "Vuelo 1 de AA califacion 3");
   p.ver(s.ingresarComentario("AA", 1, " regular", 8).resultado, Retorno.Resultado.ERROR_1, "Vuelo 1 de AA califacion 8 fuera de rango");
   p.ver(s.ingresarComentario("AA", 5, " regular", 3).resultado, Retorno.Resultado.ERROR_2, "Vuelo 5 de AA incorrecto fue calificado con 3");
   p.ver(s.listarAerolineasRanking().resultado, Retorno.Resultado.OK, "Listado de ranking ");
*/
   
    p.ver(s.destruirSistemaReservas().resultado, Retorno.Resultado.OK, "Se destruye sistema de reservas");
    p.imprimirResultadosPrueba();
}
 
 
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

}
