public class Convertidor {

    private int numero;

    // Constructor
    public Convertidor(int numero) {
        this.numero = numero;
    }

    public String convertirABinario() {
        String binario = "";
        int numeroTemporal = numero;

        while (numeroTemporal > 0) {
            binario = (numeroTemporal % 2) + binario;
            numeroTemporal /= 2;
        }

        return binario.isEmpty() ? "0" : binario; // si el numero es 0
    }

}
