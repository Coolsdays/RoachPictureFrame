import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class PictureLoader {
	public static ArrayList<BufferedImage> loadImagesFromPictureData(ArrayList<PictureData> data) {
		ArrayList<BufferedImage> pics = new ArrayList<BufferedImage>();
		for (PictureData pic: data) {
			//System.out.println(pic.getPic());
			try {
				BufferedImage img = ImageIO.read(new File(pic.getPic()));
				pics.add(img);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Failed to load images.");
			}
		}
		return pics;
	}
}
