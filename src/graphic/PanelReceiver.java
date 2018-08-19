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
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelReceiver extends JPanel implements ActionListener, ItemListener{
	
	MainWindow main;
	
	private JPanel assistant;
	private JPanel father;
	
	public static final String GENERAR="generar";
	public static final String ORDENAR="ordenar";
	
	
	
	private JLabel messageOne;
	private JLabel messageTwo;
	
	
	private JButton generate;
	private JButton order;
	
	private JTextField interval;
	private JTextField percentageOrder;
	private JTextField quantityNum;
	private JTextField input;
	
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
		 input=new JTextField();

		 
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
		 
		 one.addItemListener(this);
		 one.setText(GENERAR);
		 two.addItemListener(this);
		 three.addItemListener(this);
		 four.addItemListener(this);

		 generate=new JButton("Generar auto.");
		 generate.setActionCommand(GENERAR);
		 generate.addActionListener(this);

		 order=new JButton("Ordenar");
		 order.setActionCommand(ORDENAR);
		 order.addActionListener(this);
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
		
		
		father.add(assistant,BorderLayout.NORTH);
		father.add(input,BorderLayout.CENTER);

		
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals(GENERAR)) {
			main.generateAutomatic();
		}else if(e.getActionCommand().equals(ORDENAR)) {
			
		}
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getItem().equals(one)) {
		System.out.println("Listo");
		}
	}
	public MainWindow getMain() {
		return main;
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
	public void setInterval(JTextField interval) {
		this.interval = interval;
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
	public JTextField getInput() {
		return input;
	}
	public void setInput(JTextField input) {
		this.input = input;
	}
	public JRadioButton getOne() {
		return one;
	}
	public void setOne(JRadioButton one) {
		this.one = one;
	}
	public JRadioButton getTwo() {
		return two;
	}
	public void setTwo(JRadioButton two) {
		this.two = two;
	}
	public JRadioButton getThree() {
		return three;
	}
	public void setThree(JRadioButton three) {
		this.three = three;
	}
	public JRadioButton getFour() {
		return four;
	}
	public void setFour(JRadioButton four) {
		this.four = four;
	}
	public ButtonGroup getGroup() {
		return group;
	}
	public void setGroup(ButtonGroup group) {
		this.group = group;
	}
	
}
