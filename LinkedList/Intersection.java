package LinkedList;
import java.io.*;
import java.util.*;


public class Intersection {
	
	class Node {
		int data;
		Node next;
		
		Node(int a ){
			data = a;
			next = null;
		}
	}
	
	public static Node findIntersection(Node head1, Node head2)
    {
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1 != null || temp2 !=null){
            if(temp1.data < temp2.data){
                temp1 = temp1.next;
            }
            else if (temp2.data<temp1.data){
                temp2 = temp2.next;
            }
            else{
                 System.out.println(temp1);
                 temp1 = temp1.next;
                 temp2 = temp2.next;
            }
           
        }
        return head1;
}

	public static void main(String[] args) {
Node h1;
Node h2;
System.out.println(findIntersection(h1, h2));


	}

}
