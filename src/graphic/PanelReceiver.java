package graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model.Player;

public class PanelReceiver extends JPanel implements ActionListener, ListSelectionListener{

	
	private MainWindow main;
	
	private JPanel auxOne;
	private JPanel auxTwo;
	private JButton addPlayer;
	private JButton deletePlayer;
	private JList<Player> listPlayers;
	private JScrollPane scroll;
	
	public PanelReceiver(MainWindow main) {
		// TODO Auto-generated constructor stub
		this.main=main;
		listPlayers=new JList<Player>();

		auxOne=new JPanel();
		auxTwo=new JPanel();
		
	}
	
	public void addGraphics() {
		auxOne.add(listPlayers);
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
}
