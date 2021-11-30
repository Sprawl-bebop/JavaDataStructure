package linkList;

public class NodePos {
	Node head;
	
	public void insPos(int pos, int data) {
		Node ptr = new Node();
		ptr.data = data;
		ptr.link = null;
		
		Node temp = head;
		if(pos == 1) {
			//temp.link = head;
			ptr.link = head;
			head = ptr;			
		}else {
			for(int i=1; i<pos-1; i++) {
				temp = temp.link;
			}
			ptr.link = temp.link;
			temp.link = ptr;
		}
		
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
	
}
