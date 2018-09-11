package graphic;

import javax.swing.JFrame;

public class MainWindow extends JFrame{

	private PanelReceiver panel;
	
	
	public MainWindow() {
		// TODO Auto-generated constructor stub
		panel=new PanelReceiver(this);
		setVisible(true);
	}

	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainWindow window=new MainWindow();

	}
}
