public class Cuadrado extends Polygons{
    private int lado;

    public Cuadrado(int lado){
        this.lado = lado;
    }

    @Override
    public double CalcularArea() {
        return lado * lado;
    }
}
