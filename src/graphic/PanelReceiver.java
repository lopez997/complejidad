package graphic;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelReceiver extends JPanel  {
	
	MainWindow main;
	
	private JPanel assistant;
	
	private JLabel messageOne;
	private JLabel messageTwo;
	private JLabel messageThree;
	
	private JButton generate;
	
	private JTextField interval;
	private JTextField percentageOrder;
	private JTextField quantityNum;
	
	private JCheckBox one;
	private JCheckBox two;
	private JCheckBox three;
	private JCheckBox four;
	
	
	public PanelReceiver(MainWindow main) {
		// TODO Auto-generated constructor stub
		this.main=main;
		
		assistant=new JPanel(new GridLayout(4,2));
		
		 messageOne=new JLabel("Ingrese el total de numeros a generar: ");
		 messageTwo=new JLabel("Ingrese el intervalo: ");
		 messageThree=new JLabel("Numeros repetidos: ");
		 
		 interval= new JTextField();
		 percentageOrder= new JTextField();
		 quantityNum= new JTextField();
		 
		 one=new JCheckBox("Valores ordenados");
		 two=new JCheckBox("Valores ordenados inversamente");
		 three=new JCheckBox("Orden aleatorio");
		 
		addItems();
		add(assistant);
	}
	public void addItems() {
		assistant.add(messageOne);
		assistant.add(quantityNum);
		assistant.add(messageTwo);
		assistant.add(interval);
		assistant.add(one);
		assistant.add(two);
		assistant.add(three);
		}
}
