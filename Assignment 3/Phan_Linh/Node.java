package assignment3;

public class Node {
	//setting linked list nodes to contain data and pointer to next
	private int data;
	private Node next;
	
	//allows other classes to create a node
	public Node(int data){
		this.data = data;
		this.next = null;
	}
	
	//allow other classes to access data
	public int getData(){
		return data;
	}
	
	//allow other classes to access next node
	public Node getNext(){
		return next;
	}
	
	//allow other classes to set next node
	public void setNext(Node next) {
		this.next = next;
	}
}
