
public class PictureData {
	/*
	 * The Getters and Setters for the PictureData portion. Defines the object which runs the program. 
	 * Also has the toString function as well.  
	 */
	private String pic;
	private String date;
	private String desc;
	
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public PictureData() {
		pic = "";
		date = "";
		desc = "";
	}
	public PictureData(String pic, String date,String desc) {
		setPic(pic);
		setDate(date);
		setDesc(desc);
	}
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s",pic,date,desc);
	}
	
}
