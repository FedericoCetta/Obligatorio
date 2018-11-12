
package obligatorio;


public class Obligatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        int [][] mapa  ={{0,1,2,3,-1},{1,0,3,1,4},{2,3,0,-1,1},{3,1,-1,0,1},{-1,4,1,1,0}};
        Prueba p = new Prueba();
        Sistema s = new Sistema();
        
        prueba1(p,s, mapa);
        
        

    }
    
public static void prueba1(Prueba p, Sistema s, int [][] mapa)   { 
   
    p.ver(s.crearSistemaReservas().resultado, Retorno.Resultado.OK, "SE CREO LISTA DE SISTEMASA");
    p.ver(s.Caminomascorto(0, 4, mapa).resultado, Retorno.Resultado.OK, s.Caminomascorto(0, 4, mapa).valorString);
    p.ver(s.destruirSistemaReservas().resultado, Retorno.Resultado.OK, "Se cerro el sistema");
        p.imprimirResultadosPrueba();
        
        //prueba
        
}    
public static void prueba2(Prueba p, Sistema s, int [][] mapa)   { 
        p.ver(s.Caminomascorto(0, 4, mapa).resultado, Retorno.Resultado.OK, "distancia mas corata");
        p.imprimirResultadosPrueba();
}    

}
