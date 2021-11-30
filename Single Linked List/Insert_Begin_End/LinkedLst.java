package testT1;

public class LinkedLst {
	Node head;
	
	public void insertEnd(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		}else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public void insertBeg(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		node.next = head;
		head = node;
	}
	
	public void display() {
		Node n = head;
		while(n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}
}
