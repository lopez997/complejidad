package graphic;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame {

	PanelReceiver pannelOne;
	PanelReceiverTwo pannelTwo;
	private JPanel assistant;
	
	public MainWindow() {
		// TODO Auto-generated constructor stub
		assistant=new JPanel(new BorderLayout());
		pannelOne=new PanelReceiver(this);
		pannelTwo=new PanelReceiverTwo(this);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		assistant.add(pannelOne,BorderLayout.CENTER);
		assistant.add(pannelTwo,BorderLayout.NORTH);
		add(assistant);
		
		pack();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainWindow window=new MainWindow();

	}

}
