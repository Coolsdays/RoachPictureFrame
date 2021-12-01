import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class PictureLoader {
	public ArrayList<Pictures> loadImagesFromPictureData(ArrayList<PictureData> data) {
		ArrayList<Pictures> pics = ArrayList<Pictures>();
		for (PictureData pic: data) {
			try {
				String picFname = data.get(0);
				BufferedImage img = ImageIO.read(new File(picFname));
				pics.add(img);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Failed to load images.");
			}
		}
	}
}
