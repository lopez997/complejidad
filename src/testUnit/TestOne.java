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
	public void testShortTwo() {
		Processor test=new Processor();
		
		Box[] arr=new Box[(int)(Math.random()*200)+5];
		int j=arr.length-1;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=new Box(j);
			j--;
		}

		test.setArrangement(arr);
		test.quickSort(0,arr.length-1);
		
		Box[] arrTest=new Box[arr.length];
		for (int i = 0; i < arrTest.length; i++) {
			arrTest[i]=new Box(i);
	
		}
	
		for (int i = 0; i < arrTest.length; i++) {	
			assertEquals(arrTest[i].getNumber(),test.getArrangement()[i].getNumber());
			
		}
	}
	@Test
	public void testShortThree() {
		Processor test=new Processor();
		Processor testTwo=new Processor();
		
		Box[] arr=new Box[(int)(Math.random()*200)+5];
		Box[] arrTest=new Box[arr.length];
		for (int i = 0; i < arr.length; i++) {
			long j=(long) ((Math.random()*20330)+5);
			arr[i]=new Box(j);
			arrTest[i]=new Box(j);
		}

		test.setArrangement(arr);
		test.quickSort(0,arr.length-1);
		
		testTwo.setArrangement(arrTest);
		testTwo.quickSort(0,arr.length-1);
		
		for (int i = 0; i < arrTest.length; i++) {	
			assertEquals(testTwo.getArrangement()[i].getNumber(),test.getArrangement()[i].getNumber());
			
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
	
	@Test
	public void shortReverseTwo() {
		Processor test=new Processor();
		
		Box[] arr=new Box[(int)(Math.random()*200)+5];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=new Box(i);
	
		}

		test.setArrangement(arr);
		test.quickSortInversely(0,arr.length-1);
		
		Box[] arrTest=new Box[arr.length];
		int j=arr.length-1;
		for (int i = 0; i < arrTest.length; i++) {
			arrTest[i]=new Box(j);
			j--;
	
		}
	
		for (int i = 0; i < arrTest.length; i++) {	
			assertEquals(arrTest[i].getNumber(),test.getArrangement()[i].getNumber());
			
		}
	}
	
	@Test
	public void shortReverseThree() {

	
	Processor test=new Processor();
	Processor testTwo=new Processor();
	
	Box[] arr=new Box[(int)(Math.random()*200)+5];
	Box[] arrTest=new Box[arr.length];
	for (int i = 0; i < arr.length; i++) {
		long j=(long) ((Math.random()*20330)+5);
		arr[i]=new Box(j);
		arrTest[i]=new Box(j);
	}

	test.setArrangement(arr);
	test.quickSortInversely(0,arr.length-1);
	
	testTwo.setArrangement(arrTest);
	testTwo.quickSortInversely(0,arr.length-1);
	
	for (int i = 0; i < arrTest.length; i++) {	
		assertEquals(testTwo.getArrangement()[i].getNumber(),test.getArrangement()[i].getNumber());
		
	}
	}
	
	
	
	
}
