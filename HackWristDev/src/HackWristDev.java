

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.BorderLayout;

public class HackWristDev {

	  /** ID number used for object serialization. */
	  private static final long serialVersionUID = 1L;
	  /** Menu bar for the GUI that contains Menus. */
	  private JMenuBar menuBar;
	  /** Menu for the GUI. */
	  private JMenu menu;
	  /** Menu item for creating a new file containing Tickets. */
	  /** Panel that will contain different views for the application. */
	  private JPanel panel;



	public HackWristDev() {
		JFrame frame = new JFrame();
		
		JButton button = new JButton("click me");
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		
		panel.setLayout(new GridLayout(1, 1));
		panel.add(button);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GUI");
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new HackWristDev();
	}
}






