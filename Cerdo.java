
/**
 * Write a description of class Cerdo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cerdo extends Animal 
{
    // instance variables - replace the example below with your own
    private int puntosVidaCerdo;
    private int pesoCerdo;
    
    /**
     * Constructor for objects of class Cerdo
     */
    public Cerdo()
    {
        puntosVidaCerdo = PTOS_DE_VIDA_INICIALES;
        pesoCerdo = PESO_INICIAL_CERDO;
    }

    public void comer()
    {
        pesoCerdo = getPeso() + PESO_POR_COMIDA_CERDO_VACA;
        puntosVidaCerdo = getPuntosDeVida() - PERDIDA_PTOS_POR_COMER;
    }
    
    /**
     *Método que devuelve el peso de los cerdos en kilogramos.
     */
    public int getPeso()
    {
        return pesoCerdo;
    }
    
    /**
     * Método abstracto que devuelve los puntos de vida actuales de los cerdos.
     */
    public int getPuntosDeVida()
    {
        return puntosVidaCerdo;
    }
    
    public void emitirSonidoCaracteristico()
    {
        System.out.println("oink, oink");
    }
    
    public void vacunar()
    {
        puntosVidaCerdo = getPuntosDeVida() + PUNTOS_POR_VACUNACION_CERDOS;
    }
}
