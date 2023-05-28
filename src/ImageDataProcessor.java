import net.semanticmetadata.lire.imageanalysis.features.GlobalFeature;
import net.semanticmetadata.lire.imageanalysis.features.global.AutoColorCorrelogram;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageDataProcessor {
    public double[] processImage( String imgPath ){
        
        BufferedImage image = null;
        try{
            File imgFile = new File(imgPath);
            image = ImageIO.read(imgFile);
        }
        catch(IOException e){
            System.out.println("ERROR: COULDN'T LOCATE THE FILE");
            e.printStackTrace();
        }

        GlobalFeature featureExtractor = new AutoColorCorrelogram();
        featureExtractor.extract(image);

        double[] featureVals = featureExtractor.getFeatureVector();

        return featureVals;
    }
}