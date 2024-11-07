import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO
;
public class ImageLoader {
    
    private BufferedImage image;

    public ImageLoader(String imageUrl)throws IOException {
        loadImage(imageUrl);
    }

    private void loadImage(String imageUrl)throws IOException {
        URL url = new URL(imageUrl);
        image = ImageIO.read(url);

    }
    public BufferedImage getImage(){
        return image;
    }

}
