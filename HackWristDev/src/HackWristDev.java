

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.*;

import java.awt.BorderLayout;
import java.io.*;  
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;  
import java.util.*;

//import static org.junit.Assert.assertTrue;

/**
 * This code runs the MVC for the mechanical design
 */
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
//Import the text via a .csv import

	/**
	 * This is the constructor for the HackWristDev code
	 * @throws Exception 
	 */
	public HackWristDev() throws Exception {
		JFrame frame = new JFrame("Title PlaceHolder");
		
		frame.setTitle("Title PlaceHolder");
		
		JButton rawData = new JButton("Show Raw Data");
		JButton plotData = new JButton("Plot Data");
		JButton exportData = new JButton("Export");
		JButton accuracyData = new JButton(" System Accuracy");
		//JWindow window = new JWindow(frame);
		
		JPanel panel = new JPanel(new GridLayout(3, 1));
		panel.setBorder(BorderFactory.createEmptyBorder(20, 100, 100, 20));
		
		JPanel subPanelRow = new JPanel(new GridLayout(1,2));
		JPanel subPanelColumn = new JPanel(new GridLayout(3,1));
		
		//Add to sub panel column
		subPanelColumn.add(rawData);
		//subPanelColumn.add(plotData);
		subPanelColumn.add(exportData);
		
		
		
		//JDialog dialog = new JDialog(frame, "notes");
		
		//CALL THE RESULTS HERE
		String resultsStr = CSVReaderResults();
		//Split results up
		String goodPointStr =  resultsStr.substring(0); //FIX
		String badPointStr =  resultsStr.substring(0); //FIX
		String howBadStr =  resultsStr.substring(0); //FIX
		
		JPanel subPatColumn = new JPanel(new GridLayout(3,1));
		//Patient Summary Data
		JLabel goodPoint = new JLabel("Points of Good Motion: ");
		JLabel goodPointVal = new JLabel(Integer.toString(getCountGood()));
			//goodPoint placeholder
		JPanel subPatColumn1 = new JPanel(new GridLayout(1,2));
		
		subPatColumn1.add(goodPoint);
		subPatColumn1.add(goodPointVal);
		subPatColumn.add(subPatColumn1);
		
		JLabel badPoint = new JLabel("Points of Harmful Motion: ");
		JLabel badPointVal = new JLabel(Integer.toString(getCountBadd()));
			//goodPoint placeholder
		
		JPanel subPatColumn2 = new JPanel(new GridLayout(1,2));
		
		subPatColumn2.add(badPoint);
		subPatColumn2.add(badPointVal);
		subPatColumn.add(subPatColumn2);
		
		JLabel howBad = new JLabel("Ratio of Bad Wrist Motion: ");
		//String cool = 20;
		JLabel howBadVal = new JLabel(Float.toString(getCountRatio()));
			//goodPoint placeholder
		
		
		JPanel subPatColumn3 = new JPanel(new GridLayout(1,2));
		subPatColumn3.add(howBad);
		subPatColumn3.add(howBadVal);
		subPatColumn.add(subPatColumn3);
		
		//Add to sub panel row
		
		
		subPanelRow.add(subPatColumn);
		subPanelRow.add(subPanelColumn);
		
		panel.add(subPanelRow);
		
		
		JPanel subNote = new JPanel(new GridLayout(3,1));
		JLabel notes = new JLabel("notes :");
		subNote.add(notes);
		JTextArea text = new JTextArea(10, 10);
		subNote.add(text);
		panel.add(subNote);
		
		//JPanel panel2 = new JPanel();
		//panel2.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		
		//panel.setLayout(new GridLayout(1, 1));
		
		
		
		
		//CHANGE THIS IF ADD HELP SECTION
		JPanel Help = new JPanel(new GridLayout(4,1));
		JPanel Help1 = new JPanel(new GridLayout(1,2));
		JPanel Help2 = new JPanel(new GridLayout(1,2));
		JPanel Help3 = new JPanel(new GridLayout(1,2));
		JLabel email = new JLabel("Email: ");
		JLabel emailVal = new JLabel("Services@HandDevWrist.com");
		JLabel phone = new JLabel("Phone: ");
		JLabel phoneVal = new JLabel("(919) - 123 - 1231");
		JLabel compAdd = new JLabel("Company Address: ");
		JLabel compAddVal = new JLabel("E Cameron Ave, Chapel Hill, NC 27514");
		Help1.add(email);
		Help1.add(emailVal);
		Help2.add(phone);
		Help2.add(phoneVal);
		Help3.add(compAdd);
		Help3.add(compAddVal);
		
		Help.add(Help1);
		Help.add(Help2);
		Help.add(Help3);
		Help.add(accuracyData);
		panel.add(Help);
		//window.add(panel);
		
		//dialog.add(panel2);
		//dialog.setSize(200, 200);
		//dialog.setVisible(true);
		
		frame.add(panel, BorderLayout.CENTER);
		//frame.add(panel2, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Carpal Tunnel Rehabilitation Device");
		
		frame.setPreferredSize(new Dimension(800, 500));
		frame.pack();
		frame.setVisible(true);
		
		final String resRawBut = CSVReaderRaw();
		
		rawData.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
                // Create a dialog to display raw data
                JDialog dialog = new JDialog(frame, "Raw Data", true);
                dialog.setSize(300, 600);

                // Read and display the raw data
                JTextArea rawDataTextArea = new JTextArea(10, 30);
                rawDataTextArea.setEditable(false);
                dialog.add(new JScrollPane(rawDataTextArea));

                JTextArea labelRawData = new JTextArea("here: " + resRawBut);
                dialog.add(labelRawData);
                // Call your CSVReaderResults method to get the data

                dialog.setVisible(true);
            }
        });
		
		exportData.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
                // Create a dialog to display raw data
                JDialog dialog = new JDialog(frame, "Export Data", true);
                dialog.setSize(300, 200);

                // Read and display the raw data
                JTextArea exportDataTextArea = new JTextArea(10, 30);
                exportDataTextArea.setEditable(false);
                dialog.add(new JScrollPane(exportDataTextArea));

                
                JLabel labelRawData = new JLabel("Complete. Please Close This Pop Up Window.");
                dialog.add(labelRawData);
                
                String[] exportArr = null;
				try {
					exportArr = getStuff();
					writeToCSV(exportArr);
				} catch (Exception e1) {
					System.out.print("oops");
				}
                
                // Call your CSVReaderResults method to get the data
                try {
                    String exportCSVData = CSVReaderResults();
                    exportDataTextArea.setText(exportCSVData);
                } catch (Exception ex) {
                    ex.printStackTrace();
                    exportDataTextArea.setText("Error reading data.");
                }

                dialog.setVisible(true);
            }
        });
		
		final String accT = CSVReaderAccuracy();
		
		accuracyData.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
                // Create a dialog to display raw data
                JDialog dialog = new JDialog(frame, "Accuracy Data", true);
                dialog.setSize(300, 200);

                // Read and display the raw data
                JTextArea accuracyDataTextArea = new JTextArea(10, 30);
                accuracyDataTextArea.setEditable(false);
                dialog.add(new JScrollPane(accuracyDataTextArea));

                
                //System.out.print("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"+accT);
                JLabel labelRawData = new JLabel("The Accuracy Value: " + accT);
                dialog.add(labelRawData);
                // Call your CSVReaderResults method to get the data
                dialog.setVisible(true);
            }
        });
	}
	
	
	/**
	 * Read CSV file
	 * 
	 * @return a string that can be parsed for data
	 * @throws Exception if cannot read file
	 */
	public String CSVReaderResults() throws Exception {
	
		String strOut = "";
		
	
		Scanner scan = new Scanner(new File("C:\\Users\\mclai\\Hack2023WristDev\\HackWristDev\\src\\CSV_Files\\GoodData.csv"));  
		scan.useDelimiter(",");   
		while (scan.hasNext()) {  
			System.out.print(scan.next());  
		}   
		scan.close(); 
		return strOut;
	}  
	
	/**
	 * Read CSV file from the trained false data values
	 * 
	 * @return a string that can be parsed for data
	 * @throws Exception if cannot read file
	 */
	public String CSVBadReaderResults() throws Exception {
	
		String strOut = "";
		
	
		Scanner scan = new Scanner(new File("C:\\Users\\mclai\\Hack2023WristDev\\HackWristDev\\src\\CSV_Files\\BadData.csv"));  
		scan.useDelimiter(",");   
		while (scan.hasNext()) {  
			System.out.print(scan.next());  
		}   
		scan.close(); 
		return strOut;
	}  
	
	/**
	 * Read CSV and return the accuracy
	 * 
	 * @return the accuracy of the machine
	 * @throws Exception if the CSV no read
	 */
	public String CSVReaderAccuracy() throws Exception {
		
			String strOut = "";
			
			//PATH OF Accuracy CSV OUT HERE
			Scanner scan = new Scanner(new File("C:\\Users\\mclai\\Hack2023WristDev\\HackWristDev\\src\\CSV_Files\\Accuracy.csv"));  
			scan.useDelimiter(",");  
			while (scan.hasNext()) {  
				strOut = scan.next();  
			}   
			scan.close();  
			return strOut;
		}  
	
	/**
	 * Read CSV file give raw
	 * 
	 * @return a string that give all
	 * @throws Exception if cannot read file
	 */
	public String CSVReaderRaw() throws Exception {
	
		String strOut = "";
		
		//PATH OF Results CSV OUT HERE
		Scanner scan = new Scanner(new File("C:\\\\Users\\\\mclai\\\\Hack2023WristDev\\\\HackWristDev\\\\src\\\\CSV_Files\\\\Response.csv"));  
		scan.useDelimiter(",");  
		while (scan.hasNext()) {  
			strOut = strOut + "\r\n" + scan.next(); 
			System.out.print(strOut);  
		}   
		scan.close();  
		return strOut;
	}  
	
	
	public String[] getStuff() throws FileNotFoundException {
		String[] getArr = new String[20];
		Scanner scan = new Scanner(new File("C:\\Users\\mclai\\Hack2023WristDev\\HackWristDev\\src\\CSV_Files\\Response.csv"));  
		scan.useDelimiter(",");
		int i = 0;
		while (scan.hasNext()) {  
			getArr[i] = scan.next();
			i = i + 1;
		}   
		scan.close(); 
		return getArr;
	}
	
	public float getCountRatio() throws FileNotFoundException {
		String[] getArr = new String[20];
		Scanner scan = new Scanner(new File("C:\\Users\\mclai\\Hack2023WristDev\\HackWristDev\\src\\CSV_Files\\Response.csv"));  
		scan.useDelimiter(",");
		float val = 0;
		float i = getCountBadd() + getCountGood();
		while (scan.hasNext()) {  
			if (scan.next().contains("bad")) {
				val = val + 1;
			}
		}   
		
		scan.close(); 
		return val/i;
	}
	
	public int getCountBadd() throws FileNotFoundException {
		String[] getArr = new String[20];
		Scanner scan = new Scanner(new File("C:\\Users\\mclai\\Hack2023WristDev\\HackWristDev\\src\\CSV_Files\\Response.csv"));  
		scan.useDelimiter(",");
		int val = 0;
		int i = 0;
		while (scan.hasNext()) {  
			if (scan.next().contains("b")) {
				val = val + 1;
			}
		}   
		
		
		
		scan.close(); 
		return val;
	}
	
	public int getCountGood() throws FileNotFoundException {
		String[] getArr = new String[20];
		Scanner scan = new Scanner(new File("C:\\Users\\mclai\\Hack2023WristDev\\HackWristDev\\src\\CSV_Files\\Response.csv"));  
		scan.useDelimiter(",");
		int val = 0;
		int i = 0;
		while (scan.hasNext()) {  
			if(scan.next().contains("g")) {
				val = val + 1;
				//System.out.print(val);
			}
		}   
		
		
		
		scan.close(); 
		return val;
	}
	
	/**
	 * Convert string to csv
	 * @param data
	 * @return
	 * @throws Exception 
	 */
	public void writeToCSV(String[] data) throws Exception {
		PrintWriter pw;
	    try {
	      pw = new PrintWriter(new File("clinician.csv"));

	      StringBuffer csvData = new StringBuffer("");

	      // write header
	      
	      String[] strArr = getStuff();
	      for (int i = 0; i<strArr.length; i++) {
	    	    csvData.append(strArr[i]);
		      	pw.write(csvData.toString());
	      }
	      // write data
	      
	      //csvData.append();
	      
	      
	      pw.close();
	    } catch (FileNotFoundException e) {
	      throw new Exception();
	    }
	}
	
	/**
	 * This is the main section for the code
	 * 
	 * @param args static input arguments
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		new HackWristDev();
	}
}






