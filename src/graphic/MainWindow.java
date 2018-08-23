package graphic;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
	
	public void generateArragement() {
		try{
			pannelOne.integer();
			logic.GenerateNumberS(Integer.parseInt(pannelOne.getQuantityNum().getText()),pannelOne.getIntervalOne(),
			pannelOne.getIntervaleTwo());	
			System.out.println(pannelOne.getIntervaleTwo());
			visualizeArrangement();
			
				}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Para generar los numeros, tiene "
					+ "que completar todos los campos anteriores.");
		}	
	}
	public void generateAutomatic() {
			logic.GenerateNumber((int)((Math.random()*111)+1));
			visualizeArrangement();
	}
	
	public void shortArrangement() {
		logic.quickSort(0, logic.getArrangement().length-1);
		visualizeArrangement();
	}
	
	public void visualizeArrangement() {
		pannelOne.getInput().setText(logic.convertArrangement());
	}
	
	public void shortArrangementInversely(){
		logic.quickSortInversely(0, logic.getArrangement().length-1);
		visualizeArrangement();
	}
	
	
	public void administrarion() {
		System.out.println(pannelOne.getStatus());
		if(pannelOne.getStatus().equals("ordenado")||pannelOne.getStatus().equals(" ")) {
			shortArrangement();
		}else if(pannelOne.getStatus().equals("nordenado")) {
			shortArrangementInversely();
		}
	}	
	
	
	

}