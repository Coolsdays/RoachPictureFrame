import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class FrameApp {
	public static void main(String[] args) throws Exception {
		ArrayList<PictureData> data = PictureDataReader.readData("descriptions.txt");
		ArrayList<BufferedImage> pics = PictureLoader.loadImagesFromPictureData(data);
		//System.out.print(data);
		PictureFrame pf = new PictureFrame();
		pf.setVisible(true);
		
	}
}
