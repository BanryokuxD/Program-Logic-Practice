public class Rectangulo extends Polygons{
    public int largo;
    public int ancho;

    public Rectangulo(int largo, int ancho){
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double CalcularArea() {
        return largo * ancho;
    }
}
