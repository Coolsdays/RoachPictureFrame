import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PicturePanel extends JPanel implements MouseListener, MouseMotionListener {
	private String message;
	private int msgX, msgY;
	private ArrayList<BufferedImage> pics;
	private BufferedImage picture;
	private ArrayList<PictureData> data;
	private PictureData pic;
	
	  public PicturePanel() {
		  	message = "";
	        setPreferredSize(new Dimension(200,200));
	        addMouseListener(this);
	        addMouseMotionListener(this);
	        msgX = 10;
	        msgY = 20;
	        data = PictureDataReader.readData("descriptions.txt");
	        pics = PictureLoader.loadImagesFromPictureData(data);
}
		public BufferedImage getPicture() {
			return picture;
		}
		
		public void setPicture() {
			this.picture = picture;
			repaint();
		}
		
		public void paintImage(Graphics g) {
			super.paintComponent(g);
			for (BufferedImage img:pics) {
			g.drawImage(img, 0, 0, null);
			}
		}
		
	  @Override
	    public void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        g.drawString(message,msgX,msgY); 
	        } 
	    
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