package LinkedList;
import java.util.*;

public class DetectLoop {
	
	class Node {
		int data;
		Node next;
		Node (int data){
			this.data = data;
			this.next = null; 
		}
	}
	

	public static void Detect(Node head,Node slow,Node fast) {
		slow =head;
		fast = head;
		while(slow!=null && fast!=null && fast.next!=null) {
			slow =  slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				System.out.print("Loop is there");
			}
			System.out.print("Loop is not there");
		}
	}
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addFirst(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		
		Detect(head,head,head);

	}

}
