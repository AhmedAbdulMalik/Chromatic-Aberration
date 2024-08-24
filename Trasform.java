import java.awt.*;
import java.awt.image.BufferedImage;

public class Trasform {
    
    public static BufferedImage boxBlur(BufferedImage image, int size){
        
        int w = image.getWidth();
        int h = image.getHeight();
        BufferedImage output = new BufferedImage(
                    w, h, BufferedImage.TYPE_INT_ARGB);

        for (int y = 0; y < h; y++){
            for (int x = 0; x < w; x++){

                int count = 0;
                int r = 0, g = 0, b = 0;
                for (int yi = y-size; yi < y+size*2+1; yi++){
                    for (int xi = x-size; xi < x+size*2+1; xi++){
                        if (yi < 0 || yi >= h || xi < 0 || xi >= w){
                            continue;
                        }

                        int[] argb = IOImage.getRGB(image, xi, yi);
                        r += argb[1];
                        g += argb[2];
                        b += argb[3];
                        count++;
                    }
                }

                r = (r / count);
                g = (g / count);
                b = (b / count);

                int[] argb = IOImage.getRGB(image, x, y);
                IOImage.setRGB(output, x, y, argb[0], r, g, b);
            }
        }

        return output;
    }

}
