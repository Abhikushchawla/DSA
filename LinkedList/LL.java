package LinkedList;


public class LL {
	Node head;
	public int size;
	
	LL(){
		this.size =0;
	}
	class Node{
		String data;
		Node next;
		
		//constructor
		Node(String data){
			this.data=data;
			this.next=null;
			size++;
			//initial next of all nodes will point to null
		}
	}
	
	//add element at first position
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
			newNode.next=head;
			head=newNode;
			
	}
	//add element at last position
	public void addLast(String data) {
		Node newNode=new Node(data);
		
		if(head==null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next!=null) {
			currNode=currNode.next;
		}
		currNode.next=newNode;
		
	}

	//print
	public void printList() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		Node currNode = head;
		while(currNode!=null) {
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
		System.out.println("Null");
	}
	//delete first Node
	public void deletefirst() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		size--;
			head=head.next;
		
	}
	//delete last node
	public void deleteLast() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		size--;
		if(head.next==null) {
			head=null;
			return;
		}
		Node second = head.next;
		Node curr=head;
		while(second.next!=null && curr.next.next!=null) {
			second = second.next;
			curr = curr.next;
		}
		curr.next=null;
		
	}
	//size
	public int getsize() {
		return size;
	}
	
	public static void main(String[] args) {
		LL LinkedList = new LL();
		LinkedList.addFirst("like");
LinkedList.addFirst("look");
LinkedList.printList();
LinkedList.addLast("Hrithik Roshan");
LinkedList.printList();
LinkedList.addFirst("I");
LinkedList.printList();
LinkedList.deletefirst();
LinkedList.printList();
LinkedList.deleteLast();
LinkedList.printList();
System.out.println(LinkedList.getsize());
	}

}
