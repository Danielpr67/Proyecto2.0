package Clases;

public interface PincelCirculo extends Pincel{
    // PROPIEDADES
    public int getRadio();

    // MÉTODO
    public default void dibujar(GraphicsContext g, Punto p){

    }
}
