package model;

public class Weapon {

	private String type;
	private int bullets;
	private int cartuchos;
	private Weapon siguiente;
	private boolean isAx;
	
	public Weapon(String type,int bullets,int cartuchos,boolean isAx) {
		// TODO Auto-generated constructor stub
		this.type=type;
		this.bullets=bullets;
		this.cartuchos=cartuchos;
		this.isAx=isAx;
		
	}
	public Weapon(String type,boolean isAx) {
		// TODO Auto-generated constructor stub
		this.type=type;
		this.isAx=isAx;
		
	}
	public String getType() {
		return type;
	}

	public void setTipo(String type) {
		this.type = type;
	}

	public int getBullets() {
		return bullets;
	}

	public boolean getIsAx() {
		return isAx;
	}
	public void setBalas(int bullets) {
		this.bullets = bullets;
	}

	public int getCartuchos() {
		return cartuchos;
	}

	public void setCartuchos(int cartuchos) {
		this.cartuchos = cartuchos;
	}

	public Weapon getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Weapon siguiente) {
		this.siguiente = siguiente;
	}

}
