package BinaryTree;
import java.util.Scanner;
import java.util.*;


public class HeigthOfTree {

	static Scanner sc = null;
	private static Node  root;
	public static void main(String[] args) {
		 sc = new Scanner(System.in);
		Node root= createTree();
		 Height(root
				 );
		// TODO Auto-generated method stub
		

	}
	
static Node createTree() {
		
	Node root = null;
		System.out.println("Enter data: ");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		
		
		System.out.println("Enter left for " + data);
		 root.left = createTree();
		
		System.out.println("Enter right for "+ data);
		 root.right = createTree();
		
		return  root;
	}
	
	class Node
	{
		Node left, right;
		int data;
		
		public Node(int data) {
			this.data = data;
		}
	}
		
		public static int Height(Node root) {
			
			
			if(root==null)
				return -1;
			else {
				int ldepth = Height(root.left);
				int rdepth = Height(root.right);
				

				if(ldepth>rdepth)
					return ldepth+1;
				else 
					return rdepth+1;
			}
			
			
		}
	
}
