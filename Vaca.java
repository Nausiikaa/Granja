
/**
 * Write a description of class Vaca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vaca extends Animal
{
    public int puntosVidaVaca;
    public int pesoVaca;
    /**
     * Constructor for objects of class Vacas
     */
    public Vaca()
    {
        puntosVidaVaca = PTOS_DE_VIDA_INICIALES;
        pesoVaca = PESO_INICIAL_VACA;
    }

    public int getPeso()
    {
        return pesoVaca;
    }
    
    /**
     * Método abstracto que devuelve los puntos de vida actuales de las vacas.
     */
    public int getPuntosDeVida()
    {
        return puntosVidaVaca;
    }
    
    public void emitirSonidoCaracteristico()
    {
        System.out.println("Muuu, muu");
    }
    
    public void comer()
    {
        pesoVaca = getPeso() + PESO_POR_COMIDA_CERDO_VACA;
        puntosVidaVaca = getPuntosDeVida() - PERDIDA_PTOS_POR_COMER;
    }
    
    public void vacunar()
    {
         puntosVidaVaca = getPuntosDeVida() + PUNTOS_POR_VACUNACION_VACAS;
    }
    
  
    
}
