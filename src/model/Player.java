package model;

import java.util.Stack;

public class Player {

	private Stack<Weapon> armas;
	private String nickName;
	
	public Player(String nickName) {
		
		armas=new Stack<Weapon>();
		armas.push(new Weapon("Hacha",true));
		this.nickName=nickName;
		
	}
	
	
	

}
