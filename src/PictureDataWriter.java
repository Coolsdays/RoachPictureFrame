import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PictureDataWriter {
	public static void SaveToFile(ArrayList<PictureData> pics) {
		try {
			PrintWriter encode = new PrintWriter(new BufferedWriter(new FileWriter("descriptions.txt")));
			for (PictureData pic : pics) {
				encode.println(pic);
		}
			encode.close();
		} catch (Exception ex) {
			System.out.println("There was an issue writing to the file.");
		}
	}
}
