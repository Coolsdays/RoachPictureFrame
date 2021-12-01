import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class PictureDataReader {
	public static PictureData createNewPic(String A,String B,String C) {
		PictureData pic;
		pic = new PictureData(A,B,C);
		return pic;
	}
	public static ArrayList<PictureData> readData(String fName) {
		/*
		 * Reads line for line through the text file and builds question by question putting the choices and answers inside.
		 */
		Scanner fsc;
		ArrayList<PictureData> pics = new ArrayList<PictureData>();
		String[] parts = null; 
		String line,a = "",b = "",c = "";
		PictureData fPics;
		try {
			fsc = new Scanner(new File(fName));
			while (fsc.hasNextLine()) {
				line = fsc.nextLine();
				if (line.length() > 0) {
					parts = line.split("\t");
					a = parts[0];
					b = parts[1];
					c = parts[2];
					fPics = createNewPic(a,b,c);
					pics.add(fPics);
					}
			}
			return pics;
			}catch (Exception ex) {
				System.out.println("Can't access that file");
				return null;
			}
}
}