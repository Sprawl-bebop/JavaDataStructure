package testT1;

public class Driver {

	public static void main(String[] args) {
		LinkedLst obj = new LinkedLst();
		
		obj.insertEnd(10);
		obj.display();
		System.out.println();
		
		obj.insertEnd(78);
		obj.insertEnd(34);
		obj.insertEnd(77);
		obj.display();
		System.out.println();
		
		obj.insertBeg(17);
		obj.display();
		
	}

}
