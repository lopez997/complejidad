package testUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mundo.*;

class TestOne {

	public void addArrangement() {

	}
	@Test
	public void testShort() {
		Processor test=new Processor();
		
		Box[] arr=new Box[5];
		
		arr[0]=new Box(500);
		arr[1]=new Box(750);
		arr[2]=new Box(240);
		arr[3]=new Box(54);
		arr[4]=new Box(269);
		
		test.setArrangement(arr);
		test.quickSort(0,4);
		
		Box[] arrTest=new Box[5];
		arrTest[0]=new Box(54);
		arrTest[1]=new Box(240);
		arrTest[2]=new Box(269);
		arrTest[3]=new Box(500);
		arrTest[4]=new Box(750);
		
		for (int i = 0; i < arrTest.length; i++) {	
			assertEquals(arrTest[i].getNumber(),test.getArrangement()[i].getNumber());
			
		}
		
	}
	@Test
	public void shortReverse() {
		Processor test=new Processor();
		
		Box[] arr=new Box[5];
		
		arr[0]=new Box(500);
		arr[1]=new Box(750);
		arr[2]=new Box(240);
		arr[3]=new Box(54);
		arr[4]=new Box(269);

		
		test.setArrangement(arr);
		test.quickSortInversely(0,4);
		
		Box[] arrTest=new Box[5];
		
		arrTest[0]=new Box(750);
		arrTest[1]=new Box(500);
		arrTest[2]=new Box(269);
		arrTest[3]=new Box(240);
		arrTest[4]=new Box(54);
	
		for (int i = 0; i < arrTest.length; i++) {	
			assertEquals(arrTest[i].getNumber(),test.getArrangement()[i].getNumber());
			
		}
	}
	
	
}
