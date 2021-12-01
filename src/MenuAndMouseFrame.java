import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;


public class MenuAndMouseFrame extends JFrame {
	public void setupMainMenu() {
		JMenuBar mbar = new JMenuBar();
		JMenu mnuFile = new JMenu("File");
		JMenu mnuHelp = new JMenu("Help");
		mbar.add(mnuFile);
		mbar.add(mnuHelp);
		JMenuItem miOpen = new JMenuItem("Open");
		mnuFile.add(miOpen);
		JMenuItem miSave = new JMenuItem("Save");
		mnuFile.add(miSave);
		JMenuItem miExit = new JMenuItem("Exit");
		mnuFile.add(miExit);
		JMenuItem miAbout = new JMenuItem("About");
		miAbout.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "Hello");
					}
				});
		mnuFile.add(miAbout);
	}
	public void setupGUI() {
		setTitle("Menu and Mouse Frame");
		setBounds(100,100,500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setupMainMenu();
		
	}
	
}
