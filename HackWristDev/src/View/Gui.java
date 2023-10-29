package View;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.BorderLayout;

public class Gui {

	/** ID number used for object serialization. */
	  private static final long serialVersionUID = 1L;
	  /** Menu bar for the GUI that contains Menus. */
	  private JMenuBar menuBar;
	  /** Menu for the GUI. */
	  private JMenu menu;
	  /** Menu item for creating a new file containing Tickets. */
	  /** Panel that will contain different views for the application. */
	  private JPanel panel;
	  
	public Gui() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		
		panel.setLayout(new GridLayout(1, 1));
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GUI");
		frame.pack();
		frame.setVisible(true);
		
	}
	
	  
	  
		  
	  
	  //cardLayout = new CardLayout();
	  //panel.setLayout(cardLayout);
	  //panel.add();
	  //panel.add(pnlNew, NEW_PANEL);
	  //panel.add(pnlWorking, WORKING_PANEL);
	  //panel.add(pnlFeedback, FEEDBACK_PANEL);
	  //panel.add(pnlResolved, RESOLVED_PANEL);
	  //panel.add(pnlClosed, CLOSED_PANEL);
	  //panel.add(pnlCanceled, CANCELED_PANEL);
	  //panel.add(pnlAddTicket, CREATE_TICKET_PANEL);
	  //cardLayout.show(panel, TICKET_LIST_PANEL);
}


