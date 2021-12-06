import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.awt.Graphics;
	
public class PictureFrame extends JFrame {
	private PicturePanel panCenter;
	private PicturePanel panNorth;
	private BufferedImage picture;
	private PictureData Data;
	private JTextField Date;
	private JTextArea Desc;
	private int i = 0;
		public void setupMainMenu() {
			JMenuBar mbar = new JMenuBar();
			JMenu mnuFile = new JMenu("File");
			JMenu mnuHelp = new JMenu("Help");
			mbar.add(mnuFile);
			mbar.add(mnuHelp);
			JMenuItem miSave = new JMenuItem("Save");
			miSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					}
				}
			);
			mnuFile.add(miSave);
			JMenuItem miExit = new JMenuItem("Exit");
			miExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
					}
				}
			);
			mnuFile.add(miExit);
			JMenuItem miAbout = new JMenuItem("About");
			miAbout.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							JOptionPane.showMessageDialog(null, "Created by Michael Roach in Decemeber 2021");
						}
					}
				);
			mnuHelp.add(miAbout);
			setJMenuBar(mbar);
		}
		public void setupGUI() {
			setTitle("Picture Frame");
			setBounds(100,100,290,400);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			ArrayList<PictureData> data = PictureDataReader.readData("descriptions.txt");
			ArrayList<BufferedImage> pics = PictureLoader.loadImagesFromPictureData(data);
			setupMainMenu();
			Container c = getContentPane();
			c.setLayout(new BorderLayout());
			JPanel panSouth = new JPanel();
			JPanel panCent = new JPanel();
			panCent.setLayout(new FlowLayout());
			panSouth.setLayout(new FlowLayout());
			JButton btnSave = new JButton("Save");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					}
				}
			);
			JButton btnNext = new JButton("Next");
			btnNext.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (i < 3) {
						i++;
					} else if (i == 3) {
						i = 0;
					}
						picture = pics.get(i);
						panNorth.setPicture(picture);
				}
			}
		);
			JButton btnPrev = new JButton("Prev");
			btnPrev.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (i > 0) {
						i--;
					} else if (i == 0){
						i = 3;
					}
						picture = pics.get(i);
						Data = data.get(i);
						panCent.setDescription(Data);
						panCent.setDate(Data);
						panNorth.setPicture(picture);
					}
				}
			);
			panSouth.add(btnPrev);
			panSouth.add(btnSave);
			panSouth.add(btnNext);
			c.add(panSouth,BorderLayout.SOUTH);
			panCenter = new PicturePanel();
			c.add(panCenter,BorderLayout.CENTER);
			panNorth = new PicturePanel();
			c.add(panNorth,BorderLayout.CENTER);
			picture = pics.get(i);
			panNorth.setPicture(picture);
			
		}
		public PictureFrame() {
			setupGUI();
		}
		
	}

