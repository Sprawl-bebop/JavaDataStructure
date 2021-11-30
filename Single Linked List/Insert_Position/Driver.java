package linkList;

public class Driver {

	public static void main(String[] args) {
		NodePos node = new NodePos();
		
		node.insPos(1,56);
		node.display();
		System.out.println();
		node.insPos(2,6);
		node.insPos(3,506);
		node.insPos(4,55);
		node.display();
	}

}
