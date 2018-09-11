package model;

import java.util.Stack;

public class Player {

	private Stack<Weapon> armas;
	private String nickName;
	private double ping;
	private String plataforma;
	
	public Player(String nickName,double ping,String plataforma) {
		
		armas=new Stack<Weapon>();
		armas.push(new Weapon("Hacha",true));
		this.nickName=nickName;
		this.ping=ping;
		this.plataforma=plataforma;
		
		
	}
	
	public Stack<Weapon> getArmas() {
		return armas;
	}

	public void setArmas(Stack<Weapon> armas) {
		this.armas = armas;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public double getPing() {
		return ping;
	}

	public void setPing(double ping) {
		this.ping = ping;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	

}


