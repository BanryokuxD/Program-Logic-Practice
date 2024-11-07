/*
 * Crea un programa que se encargue de calcular el aspect ratio de una
 * imagen a partir de una url.
 * - Url de ejemplo:
 *   https://raw.githubusercontent.com/mouredevmouredev/master/mouredev_github_profile.png
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una
 *   imagen de 1920*1080px.
 */
import java.awt.image.BufferedImage;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        
        String imageUrl = "https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png";

        try {
            ImageLoader imageLoader = new ImageLoader(imageUrl);
            BufferedImage image = imageLoader.getImage();

            int width = image.getWidth();
            int height = image.getHeight();

            String aspectRatio = CalculateAspectRatio.calculateAspectRatio(width, height);
            System.out.println("AspectRatio: " + aspectRatio);
        } catch (IOException e) {
            System.err.println("No se pudo cargar la imagen " + e.getMessage());
        }


    }
}
