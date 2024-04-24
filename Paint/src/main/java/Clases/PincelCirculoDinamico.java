package Clases;
import javafx.scene.canvas.GraphicsContext;
public class PincelCirculoDinamico implements PincelCirculo{

    // PROPIEDADES
    private int radio;

    // CONSTRUCTOR
    PincelCirculoDinamico(int radio){

    }

    public void setRadio(int radio){

    }

    // SOBRESCRIBIR
    @Override
    public int getRadio() {
        return 0;
    }

    @Override
    public void dibujar(GraphicsContext g, Punto p) {
        PincelCirculo.super.dibujar(g, p);
    }
}
