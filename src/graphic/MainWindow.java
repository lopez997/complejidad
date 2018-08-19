package graphic;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import mundo.Processor;

public class MainWindow extends JFrame {

	PanelReceiver pannelOne;
	private JPanel assistant;
	Processor logic;
	
	
	public MainWindow() {
		// TODO Auto-generated constructor stub
		assistant=new JPanel(new GridLayout());
		pannelOne=new PanelReceiver(this);
		logic=new Processor();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		assistant.add(pannelOne);
		add(assistant);
		pack();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainWindow window=new MainWindow();

	}
	public void generateAutomatic() {
		logic.GenerateNumber((int)((Math.random()*111)+1));
		visualizeArrangement();
	}
	
	public void visualizeArrangement() {
		pannelOne.getInput().setText(logic.convertArrangement());
		
	}


}
