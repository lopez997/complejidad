package mundo;

public class Processor {
	
	private Box[] arrangement;
	public Processor() {
		// TODO Auto-generated constructor stub
	}
	
	public void GenerateNumber(int num) {
		arrangement=new Box[num];
		for (int i = 0; i < arrangement.length; i++) {
			arrangement[i]=new Box((int)((Math.random()*100000)+1));
		}
	}
	public String convertArrangement() {
		String message="";
		for (int i = 0; i < arrangement.length; i++) {
			message+=arrangement[i].getNumber();
			
			if(i!=arrangement.length-1) {
				message+="-";
			}
			if(i%5==0) {
				message+="\n";
			}
		}
		return message;
	}
	
	public void GenerateNumberS(int num, long intervale1,long intervale2) {
		
		arrangement=new Box[num];
		for (int i = 0; i < arrangement.length; i++) {
			arrangement[i]=new Box((long)((Math.random()*intervale2)+intervale1));
		}
	}
	
	 public void quickSortInversely(int lowerIndex, int higherIndex) {
	        int i = lowerIndex;
	        int j = higherIndex;
	        long pivot = arrangement[lowerIndex+(higherIndex-lowerIndex)/2].getNumber();
	        
	        while (i <= j) {
	            while (arrangement[i].getNumber() > pivot) {
	                i++;
	            }
	            while (arrangement[j].getNumber() < pivot) {
	                j--;
	            }
	            if (i <= j) {
	                exchangeNumbers(i, j);
	                i++;
	                j--;
	            }
	        }
	        if (lowerIndex > j)
	            quickSort(lowerIndex, j);
	        if (i > higherIndex)
	            quickSort(i, higherIndex);
	    }

	 public void quickSort(int lowerIndex, int higherIndex) {
         
	        int i = lowerIndex;
	        int j = higherIndex;
	        long pivot = arrangement[lowerIndex+(higherIndex-lowerIndex)/2].getNumber();

	        while (i <= j) {

	            while (arrangement[i].getNumber() < pivot) {
	                i++;
	            }
	            while (arrangement[j].getNumber() > pivot) {
	                j--;
	            }
	            if (i <= j) {
	                exchangeNumbers(i, j);
	                i++;
	                j--;
	            }
	        }
	        if (lowerIndex < j)
	            quickSort(lowerIndex, j);
	        if (i < higherIndex)
	            quickSort(i, higherIndex);
	    }
	 
	 
	  private void exchangeNumbers(int i, int j) {
	        long temp = arrangement[i].getNumber();
	        arrangement[i].setNumber(arrangement[j].getNumber());
	        arrangement[j].setNumber(temp);
	    }
	
	  public void sortPercentage(double percentage) {
		  
		  double k=arrangement.length*percentage;
		  
		  
		  
	  }

	  
	  
	  
	public Box[] getArrangement() {
		return arrangement;
	}
	
}