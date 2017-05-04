
/**
 * Write a description of class Pollo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pollo extends Animal 
{
    private int puntosVidaPollo;
    private int pesoPollo;

    /**
     * Constructor for objects of class Pollos
     */
    public Pollo()
    {
        puntosVidaPollo = PTOS_DE_VIDA_INICIALES;
        pesoPollo = PESO_INICIAL_POLLO;
    }

    public void comer()
    {
        pesoPollo = getPeso() + PESO_POR_COMIDA_POLLO_PATO;
        puntosVidaPollo = getPuntosDeVida() - PERDIDA_PTOS_POR_COMER;
    }
    
    /**
     *Método que devuelve el peso de los pollos en kilogramos.
     */
    public int getPeso()
    {
        return pesoPollo;
    }
    
    /**
     * Método abstracto que devuelve los puntos de vida actuales de los pollos.
     */
    public int getPuntosDeVida()
    {
        return puntosVidaPollo;
    }
    
     public void emitirSonidoCaracteristico()
    {
        System.out.println("pio, pio");
    }
    
    public void vacunar()
    {
        puntosVidaPollo = getPuntosDeVida() + PUNTOS_POR_VACUNACION_POLLOS;
    }
}
