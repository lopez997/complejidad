package graphic;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelReceiverTwo extends JPanel implements ActionListener {
	
	public static final String BUTTON="GENERAR";

	private JPanel assistant;
	private JButton accept;
	private JLabel information;
	private JTextField container;
	MainWindow main;
	
	public PanelReceiverTwo(MainWindow main) {
		
		this.main=main;
		
		assistant=new JPanel(new BorderLayout());
		accept= new JButton("Generar");
		accept.setPreferredSize(new Dimension(20,30));
		accept.setActionCommand(BUTTON);
		accept.addActionListener(this);
		
		information=new JLabel("Dijite los numeros a ordenarpara esto separa" + "\n" + "cada numero con el siguiente caracter '-' ");
		container=new JTextField("");
		container.setPreferredSize(new Dimension(250,30));
		addItems();
		add(assistant);
	
		
	}

	public void addItems() {
		assistant.add(information,BorderLayout.NORTH);
		JPanel aux  =  new JPanel();
		aux.setLayout(new BorderLayout());
		aux.add(accept,BorderLayout.CENTER);
		aux.add(container,BorderLayout.EAST);
		assistant.add(aux,BorderLayout.CENTER);
		
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent s) {
		// TODO Auto-generated method stub
		if(s.getActionCommand().equals(BUTTON)) {
			
		}
		
	}
	
	
	
	
	
	
	
}
