import javax.swing.JFrame;
import javax.swing.JPanel;
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
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
	
public class PictureFrame extends JFrame {
	private PicturePanel panCenter;
		public void setupMainMenu() {
			JMenuBar mbar = new JMenuBar();
			JMenu mnuFile = new JMenu("File");
			JMenu mnuHelp = new JMenu("Help");
			mbar.add(mnuFile);
			mbar.add(mnuHelp);
			JMenuItem miSave = new JMenuItem("Save");
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
							JOptionPane.showMessageDialog(null, "insert description here");
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
			setupMainMenu();
			Container c = getContentPane();
			c.setLayout(new BorderLayout());
			JPanel panSouth = new JPanel();
			panSouth.setLayout(new FlowLayout());
			JButton btnSave = new JButton("Save");
			JButton btnNext = new JButton("Next");
			JButton btnPrev = new JButton("Prev");
			panSouth.add(btnPrev);
			panSouth.add(btnSave);
			panSouth.add(btnNext);
			c.add(panSouth,BorderLayout.SOUTH);
			panCenter = new PicturePanel();
			c.add(panCenter,BorderLayout.CENTER);
		}
		public PictureFrame() {
			setupGUI();
		}
		
	}

