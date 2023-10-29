package View;

import java.awt.CardLayout;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.BorderLayout;

public class Gui {

	/** ID number used for object serialization. */
	  private static final long serialVersionUID = 1L;
	  /** Title for top of GUI. */
	  private static final String APP_TITLE = "Ticket Manager";
	  /** Text for the File Menu. */
	  private static final String FILE_MENU_TITLE = "File";
	  /** Text for the New menu item. */
	  private static final String NEW_XML_TITLE = "New";
	  /** Text for the Load menu item. */
	  private static final String LOAD_XML_TITLE = "Load";
	  /** Text for the Save menu item. */
	  private static final String SAVE_XML_TITLE = "Save";
	  /** Text for the Quit menu item. */
	  private static final String QUIT_TITLE = "Quit";
	  /** Menu bar for the GUI that contains Menus. */
	  private JMenuBar menuBar;
	  /** Menu for the GUI. */
	  private JMenu menu;
	  /** Menu item for creating a new file containing Tickets. */
	  private JMenuItem itemNewTicketFile;
	  /** Menu item for loading a file containing Tickets. */
	  private JMenuItem itemLoadTicketFile;
	  /** Menu item for saving the TicketList. */
	  private JMenuItem itemSaveTicketFile;
	  /** Menu item for quitting the program. */
	  private JMenuItem itemQuit;
	  /** Panel that will contain different views for the application. */
	  private JPanel panel;
	  /** Constant to identify ticketListPanel for  CardLayout. */
	  private static final String TICKET_LIST_PANEL = "TicketListPanel";
	  /** Constant to identify NewPanel for CardLayout. */
	  private static final String NEW_PANEL = "NewPanel";
	  /** Constant to identify Working for CardLayout. */
	  private static final String WORKING_PANEL = "WorkingPanel";
	  /** Constant to identify FeedbackPanel for CardLayout. */
	  private static final String FEEDBACK_PANEL = "FeedbackPanel";
	  /** Constant to identify ResolvedPanel for CardLayout. */
	  private static final String RESOLVED_PANEL = "ResolvedPanel";
	  /** Constant to identify ClosedPanel for CardLayout. */
	  private static final String CLOSED_PANEL = "ClosedPanel";
	  /** Constant to identify CanceledPanel for CardLayout. */
	  private static final String CANCELED_PANEL = "CanceledPanel";
	  /** Constant to identify CreateTicketPanel for CardLayout. */
	  private static final String CREATE_TICKET_PANEL = "CreateTicketPanel";
	  /** Ticket List panel - we only need one instance, so it's final. */
	  
	  anel = new JPanel();
	  cardLayout = new CardLayout();
	  panel.setLayout(cardLayout);
	  panel.add(pnlTicketList, TICKET_LIST_PANEL);
	  panel.add(pnlNew, NEW_PANEL);
	  panel.add(pnlWorking, WORKING_PANEL);
	  panel.add(pnlFeedback, FEEDBACK_PANEL);
	  panel.add(pnlResolved, RESOLVED_PANEL);
	  panel.add(pnlClosed, CLOSED_PANEL);
	  panel.add(pnlCanceled, CANCELED_PANEL);
	  panel.add(pnlAddTicket, CREATE_TICKET_PANEL);
	  cardLayout.show(panel, TICKET_LIST_PANEL);
	
}
