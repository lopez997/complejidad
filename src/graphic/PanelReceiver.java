package graphic;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelReceiver extends JPanel implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MainWindow main;
	
	private JPanel assistant;
	private JPanel father;
	
	public static final String GENERAR="generar";
	public static final String ORDENAR="ordenar";
	public static final String GENERAR_AUTO="generarauto";
	
	
	
	private String listenerCheck=" ";
	private long intervaleOne;
	private long intervaleTwo;
	
	private JLabel messageOne;
	private JLabel messageTwo;
	
	private JButton generate;
	private JButton order;
	private JButton generateTwo;
	
	
	private JTextField interval;
	private JTextField percentageOrder;
	private JTextField quantityNum;
	private JTextArea input;
	
	private JRadioButton one;
	private JRadioButton two;
	private JRadioButton three;
	private JRadioButton four;
	private ButtonGroup group;
	
	public PanelReceiver(MainWindow main) {
		// TODO Auto-generated constructor stub
		this.main=main;
		father=new JPanel(new BorderLayout());
		assistant=new JPanel(new GridLayout(6,2));
		
		 messageOne=new JLabel("Ingrese el total de numeros a generar: ");
		 messageTwo=new JLabel("Ingrese el intervalo: ");
		 input=new JTextArea();
		 
		 interval= new JTextField();
		 percentageOrder= new JTextField();
		 quantityNum= new JTextField();
		 
		 one=new JRadioButton("Valores ordenados");
		 two=new JRadioButton("Valores ordenados inversamente");
		 three=new JRadioButton("Orden aleatorio");
		 four=new JRadioButton("% de desorden");
		 group=new ButtonGroup();
		 
		 group.add(one);
		 group.add(two);
		 group.add(three);
		 group.add(four);
		 
		 one.addActionListener(this);
		 two.addActionListener(this);
		 three.addActionListener(this);
		 four.addActionListener(this);

		 generate=new JButton("Generar.");
		 generate.setActionCommand(GENERAR);
		 generate.addActionListener(this);
		 
		 generateTwo=new JButton("Generar Automatic");
		 generateTwo.setActionCommand(GENERAR_AUTO);
		 generateTwo.addActionListener(this);
		 
		 order=new JButton("Ordenar");
		 order.setActionCommand(ORDENAR);
		 order.addActionListener(this);
		 order.setEnabled(false);
		 
		 setBorder(new TitledBorder("Panel Generador"));
		 assistant.setBorder(new TitledBorder("Panel ordenamiento manual"));
		 addItems();
		 add(father);
	}
	public void addItems() {
		assistant.add(messageOne);
		assistant.add(quantityNum);
		assistant.add(messageTwo);
		JPanel aux=new JPanel(new GridLayout());
		aux.add(four);
		aux.add(percentageOrder);
		assistant.add(interval);
		assistant.add(one);
		assistant.add(two);
		assistant.add(three);
		assistant.add(aux);
		assistant.add(generate);
		assistant.add(order);
		assistant.add(generateTwo);
		father.add(assistant,BorderLayout.NORTH);
		father.add(input,BorderLayout.CENTER);
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals(GENERAR)) {
			try {
				main.generateArragement();
				order.setEnabled(true);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if(e.getActionCommand().equals(ORDENAR)) {
				main.administrarion();
		}else if(e.getActionCommand().equals(GENERAR_AUTO)) {
			main.generateAutomatic();
			order.setEnabled(true);
		}else if(e.getActionCommand().equals("Valores ordenados")) {
			listenerCheck="ordenado";
		}else if(e.getActionCommand().equals("Valores ordenados inversamente")) {
			listenerCheck="nordenado";
		}else if(e.getActionCommand().equals("Orden aleatorio")) {
			listenerCheck="aleatorio";
		}else if(e.getActionCommand().equals("% de desorden")) {
			listenerCheck="porcentaje";
		}
	}
	
	public String getStatus() {
		return listenerCheck;
	}
	
	public void integer() {
		String message=interval.getText();
		String arr[]=message.split("-");
		intervaleOne=Integer.parseInt(arr[0]);
		intervaleTwo=Integer.parseInt(arr[1]);
	}
	
	public long getIntervalOne() {
		return intervaleOne;
	}
	public long getIntervaleTwo() {
		return intervaleTwo;
	}
	public MainWindow getMain() {
		return main;
	}
	public JTextArea getInput() {
		return input;
	}
	public void setMain(MainWindow main) {
		this.main = main;
	}
	public JPanel getAssistant() {
		return assistant;
	}
	public void setAssistant(JPanel assistant) {
		this.assistant = assistant;
	}
	public JPanel getFather() {
		return father;
	}
	public void setFather(JPanel father) {
		this.father = father;
	}
	public JLabel getMessageOne() {
		return messageOne;
	}
	public void setMessageOne(JLabel messageOne) {
		this.messageOne = messageOne;
	}
	public JLabel getMessageTwo() {
		return messageTwo;
	}
	public void setMessageTwo(JLabel messageTwo) {
		this.messageTwo = messageTwo;
	}
	public JButton getGenerate() {
		return generate;
	}
	public void setGenerate(JButton generate) {
		this.generate = generate;
	}
	public JButton getOrder() {
		return order;
	}
	public void setOrder(JButton order) {
		this.order = order;
	}
	public JTextField getInterval() {
		return interval;
	}
	public JTextField getPercentageOrder() {
		return percentageOrder;
	}
	public void setPercentageOrder(JTextField percentageOrder) {
		this.percentageOrder = percentageOrder;
	}
	public JTextField getQuantityNum() {
		return quantityNum;
	}
	public void setQuantityNum(JTextField quantityNum) {
		this.quantityNum = quantityNum;
	}

	
}
