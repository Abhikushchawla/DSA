package LinkedList;

import LinkedList.LL.Node;
import java.util.*;

public class arrayToLinkedlist {
	
	class Node{
		String data;
		Node next;
		
		//constructor
		Node(int arr2){
			this.data=arr2;
			this.next=null;
			
			//initial next of all nodes will point to null
		}

		int arr[] = {1,2,3,3,4};	
	public Node createLL(int[] arr){
        
        Node head = new Node(arr[0]);
        Node temp = head;
         
        Node newNode = null;
        for(int i = 1; i < arr.length; i++){
            newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }
}
