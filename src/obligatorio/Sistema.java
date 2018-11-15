/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio;

import java.util.Calendar;
import obligatorio.Retorno.Resultado;

/**
 *
 * @author Usuario
 */
public class Sistema implements ISistema {
        ListaAereolinea listaAereolinea;  
        int [][] mapa;
        
        
    @Override
    public Retorno crearSistemaReservas() {
            listaAereolinea = new ListaAereolinea();
             mapa = new int[5][5];
  
      
           
        return new Retorno(Retorno.Resultado.OK);   
    }

    @Override
    public Retorno destruirSistemaReservas() {
            listaAereolinea.vaciar();
            
            return new Retorno(Resultado.OK);
         
    }
    public void registarAereolinea(String aereolinea){
        NodoListaAereolinea aux = listaAereolinea.obtenerAereolinea(aereolinea);
        if(listaAereolinea.esVacia()|| aux == null){
            listaAereolinea.insertarInicio(aereolinea);
        }
      
       
    
    }
    
    @Override
    public Retorno registrarVuelo(int numero, String aerolinea, String ciudadOrigen, String ciudadDestino, int estrellas, int capacidad, String fechaHoraSalida, int duracion) {
                NodoListaAereolinea aux = listaAereolinea.obtenerAereolinea(aerolinea);
            if(aux.getNombreAereolinea().toString() == aerolinea){
               
                if(estrellas >= 1 || estrellas <=5){
                
                     if(capacidad > 0 && duracion > 0){
                 ListaVuelos auxVuelo=  aux.LVuelosAereolinea;
                 
            if(auxVuelo.esVacia()){
                
                auxVuelo.insertarInicio(numero, aerolinea, ciudadOrigen, ciudadDestino, estrellas, capacidad, fechaHoraSalida, duracion);
                return new Retorno(Resultado.OK);
            }
            else if(auxVuelo.obtenerVuelo(numero) != null){
                    if(auxVuelo.obtenerCiudadyDestino(ciudadOrigen, ciudadDestino) == null){
                     auxVuelo.insertarInicio(numero, aerolinea, ciudadOrigen, ciudadDestino, estrellas, capacidad, fechaHoraSalida, duracion);
                return new Retorno(Resultado.OK);
                    }
                    else
                        return new Retorno(Resultado.ERROR_4); 
               
            }else
                 return new Retorno(Resultado.ERROR_3); 
          
            
            
            
            
            }
             else
                 return new Retorno(Resultado.ERROR_2); 
         
             }
                else
                 return new Retorno(Resultado.ERROR_1);    
            }
        
            return new Retorno(Resultado.ERROR_4); 
    }

    @Override
    public Retorno ingresarServicio(String aerolinea, int numero, String servicio) {
            NodoListaAereolinea auxAereo = listaAereolinea.obtenerAereolinea(aerolinea);
            if(auxAereo.equals(aerolinea)){
                 NodoListaVuelos auxVuelo=  auxAereo.LVuelosAereolinea.obtenerVuelo(numero);
                 if(auxVuelo != null){
                   auxVuelo.LServicios.insertarInicio(aerolinea, numero, servicio);
                   return new Retorno(Resultado.OK);  
                 }
                 else
                   return new Retorno(Resultado.ERROR_1);   
                
            }
            return new Retorno(Resultado.ERROR_1);
            
        
    }

    @Override
    public Retorno borrarServicio(String aerolinea, int numero, String servicio) {
      NodoListaAereolinea AuxAerolinea = listaAereolinea.obtenerAereolinea(aerolinea);
          if (AuxAerolinea.equals(aerolinea)) {
            NodoListaVuelos auxVuelo=  AuxAerolinea.LVuelosAereolinea.obtenerVuelo(numero);
                if (auxVuelo != null) {
                    
                    if (auxVuelo.LServicios.obtenerServicioPorNombre(servicio) != null) {
                      auxVuelo.LServicios.borrarInicio();
                     return new Retorno(Resultado.OK);
                    }
                    else
                        return new Retorno(Resultado.ERROR_2);
                   
                    
                }
                else{
                    return new Retorno (Resultado.ERROR_1);
                }
                                      
                }
           return new Retorno(Resultado.ERROR_1);       
    }

    @Override
    public Retorno ingresarComentario(String aerolinea, int numero, String comentario, int ranking) {
        NodoListaAereolinea auxAerolinea = listaAereolinea.obtenerAereolinea(aerolinea);
        
            if (auxAerolinea.equals(aerolinea)) {
                NodoListaVuelos auxVuelo = auxAerolinea.LVuelosAereolinea.obtenerVuelo(numero);
                
                if (auxVuelo!=null) {
                    
                    if (ranking >0 || ranking <=5 ) {
                         auxVuelo.LComentarios.agregarInicio(aerolinea, numero, comentario, ranking);
                         return new Retorno(Resultado.OK);
                    }
                    else {
                        return new Retorno(Resultado.ERROR_1);
                        }
                }
                else
                {
                    return new Retorno(Resultado.ERROR_2);
                }
        }
             return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    @Override
    public Retorno realizarReserva(int cliente, int numero, String aerolinea) {
        NodoListaAereolinea auxAerolinea = listaAereolinea.obtenerAereolinea(aerolinea);
        
            if (auxAerolinea.equals(aerolinea))
            {
                NodoListaVuelos auxVuelo = auxAerolinea.LVuelosAereolinea.obtenerVuelo(numero);
                if (auxVuelo!=null)
                {
                    if (auxVuelo.getCapacidad()>0) {
                        
                        
                    }
                    else
                    {
                       // auxVuelo.LEspera.
                    }
                }
                
            }
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    @Override
    public Retorno cancelarReserva(int cliente, int numero, String aerolinea) {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    @Override
    public Retorno listarServicios(String numero, String aerolinea) {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    @Override
    public Retorno listarVuelosAerolinea(String aerolinea) {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    @Override
    public Retorno listarAerolineasRanking() {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    @Override
    public Retorno listarComentarios(int numero, String aerolinea) {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    @Override
    public Retorno listarEspera(int numero, String aerolinea) {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    @Override
    public Retorno mostarDistancias() {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    @Override
    public Retorno Caminomascorto(int ciudadOrigen, int ciudadDestino, int[][] mapa) {
        int columnas = mapa[0].length;
        int distancia = Integer.MAX_VALUE;
        int escala = ciudadOrigen;
        int filas  =mapa.length;
        
        for (int i =0 ; i<columnas ; i++){
            if(mapa[ciudadOrigen][i] != -1 && mapa[ciudadDestino][i] !=-1 &&
               mapa[ciudadOrigen][i] >0 && mapa[ciudadDestino][i] >0  &&
                    mapa[ciudadOrigen][i] + mapa[ciudadDestino][i]< distancia){
            
                distancia =mapa[ciudadOrigen][i]+mapa[ciudadDestino][i];
                escala = i;
            
            }
                        
        }
        
        String R = "El camino mas corto es : "+Integer.toString(ciudadOrigen) + "- "+ Integer.toString(escala) +"- " + Integer.toString(ciudadDestino);
        Retorno ret=new Retorno(Resultado.NO_IMPLEMENTADA);
        ret.valorString=R;
        
        return  ret;
    }
    
}
