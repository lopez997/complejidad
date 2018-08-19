package mundo;

public class Processor {
	
	private Box[] arrangement;
	public Processor() {
		// TODO Auto-generated constructor stub
	}
	
	public void GenerateNumber(int num) {
		arrangement=new Box[num];
		
		for (int i = 0; i < arrangement.length; i++) {
			arrangement[i]=new Box((float)((Math.random()*100000)+1));
		}
	}
	public String convertArrangement() {
		String message="";
		for (int i = 0; i < arrangement.length; i++) {
			message+=arrangement[i].getNumber()+"-";
			
		}
		return message;
	}
		public void ordenar() {
			
		}
}
