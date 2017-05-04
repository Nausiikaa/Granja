
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Animal
{
    
    private int vida;
    public static final int PTOS_DE_VIDA_INICIALES = 100;
    public static final int PESO_INICIAL_CERDO = 15;
    public static final int PESO_INICIAL_VACA = 25;
    public static final int PESO_INICIAL_PATO = 2;
    public static final int PESO_INICIAL_POLLO = 1;
    public static final int PESO_POR_COMIDA_POLLO_PATO = 1;
    public static final int PESO_POR_COMIDA_CERDO_VACA = 2;
    public static final int PERDIDA_PTOS_POR_COMER = 10;
    public static final int PUNTOS_POR_VACUNACION_POLLOS = 10;
    public static final int PUNTOS_POR_VACUNACION_CERDOS = 20;
    public static final int PUNTOS_POR_VACUNACION_VACAS = 30;
    /**
     * Constructor for objects of class Animal
     */
    public Animal()
    {
        vida = PTOS_DE_VIDA_INICIALES;
    }

    public abstract void comer();
    
    public abstract void emitirSonidoCaracteristico();
    
    public abstract int getPeso();
    
    public abstract int getPuntosDeVida();
}
