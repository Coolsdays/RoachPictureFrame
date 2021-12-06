import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PicturePanel extends JPanel implements MouseListener, MouseMotionListener {
	//Declaring many more variables and ArrayLists.
	private String message;
	private int msgX, msgY;
	private ArrayList<BufferedImage> pics;
	private BufferedImage picture;
	private ArrayList<PictureData> data;
	private PictureData pic;
	
	public PicturePanel() {
		//Initializing a drawing panel. + underneath are the getters and setters for the image. 
		 message = "(x=0, y=0)";
	     setPreferredSize(new Dimension(200,200));
	     addMouseListener(this);
	     addMouseMotionListener(this);
	     msgX = 10;
	     msgY = 20;
}
	public BufferedImage getPicture() {
		return picture;
	}
		
	public void setPicture(BufferedImage picture) {
		this.picture = picture;
		repaint();
	}
		
	@Override
	public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    try {
	    	g.drawImage(picture,0,0,null);
	    } catch (Exception ex) {
	    	JOptionPane.showMessageDialog(null, "Couldn't Load The Picture");
	    }
	    g.drawString(message,msgX,msgY); 
	} 
	
	//And last but not least, here are the mouse events all laid out to allow for the 
	//tracking of the mouse around the screen. 
	public void mouseClicked(MouseEvent e) {
	    message = String.format("(x=%d, y=%d)",e.getX(),e.getY());
	    msgX = e.getX();
	    msgY = e.getY();
	    repaint(); // forces paintComponent to be called
	 }
	    
	public void mousePressed(MouseEvent e) {
	    message = String.format("(x=%d, y=%d)",e.getX(),e.getY());
	    repaint(); // forces paintComponent to be called
	 }
	   
	public void mouseReleased(MouseEvent e) {
	    message = String.format("(x=%d, y=%d)",e.getX(),e.getY());
	    repaint(); // forces paintComponent to be called   
	 }
	    
	public void mouseEntered(MouseEvent e) {
	    message = String.format("(x=%d, y=%d)",e.getX(),e.getY());
	    repaint(); // forces paintComponent to be called   
	 }
	    
	public void mouseExited(MouseEvent e) {
	    message = String.format("(x=%d, y=%d)",e.getX(),e.getY());
	    repaint(); // forces paintComponent to be called   
	 }
	    
	public void mouseMoved(MouseEvent e) {
	    message = String.format("(x=%d, y=%d)",e.getX(),e.getY());
	    repaint(); // forces paintComponent to be called  
	 }
	    
	public void mouseDragged(MouseEvent e) {
	    message = String.format("(x=%d, y=%d)",e.getX(),e.getY());
	    repaint(); // forces paintComponent to be called
	}
}