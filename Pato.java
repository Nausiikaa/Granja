
/**
 * Write a description of class Pato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pato extends Animal 
{
    private int puntosVidaPato;
    private int pesoPato;

    /**
     * Constructor for objects of class Pato
     */
    public Pato()
    {
        puntosVidaPato = PTOS_DE_VIDA_INICIALES;
        pesoPato = PESO_INICIAL_PATO;
    }
    
    public void comer()
    {
        pesoPato = getPeso() + PESO_POR_COMIDA_POLLO_PATO;
        puntosVidaPato = getPuntosDeVida() - PERDIDA_PTOS_POR_COMER;
    }
    
    /**
     *Método que devuelve el peso de los patos en kilogramos.
     */
    public int getPeso()
    {
        return pesoPato;
    }
    
    /**
     * Método abstracto que devuelve los puntos de vida actuales de los patos.
     */
    public int getPuntosDeVida()
    {
        return puntosVidaPato;
    }
    
     public void emitirSonidoCaracteristico()
    {
        System.out.println("cuac, cuac");
    }
    
}
