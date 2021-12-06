import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PictureDataWriter {
	public static void SaveToFile(ArrayList<PictureData> pics) {
		try {
			PrintWriter encode = new PrintWriter(new BufferedWriter(new FileWriter("descriptions.txt")));
			int i = 0;
			for (PictureData pic : pics) {
			if (i < 2) {
					encode.print(pic + "\t");
					i++;
				
			} else if (i == 2){
				encode.print("\n");
				i = 0;
			}
		}
			encode.close();
		} catch (Exception ex) {
			System.out.println("There was an issue writing to the file.");
		}
	}
}
