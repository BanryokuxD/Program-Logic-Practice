/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

public class App {
    public static void main(String[] args) throws Exception {
        Triangulo triangulo = new Triangulo(2, 5);
        System.out.println("Area del Triangulo es : " + triangulo.CalcularArea()); 
        Cuadrado cuadrado = new Cuadrado(2);
        System.out.println("Area del Cuadrado es: " + cuadrado.CalcularArea());
        Rectangulo rectangulo = new Rectangulo(4, 2);
        System.out.println("Area Rectangulo es : " + rectangulo.CalcularArea());
    }

}
