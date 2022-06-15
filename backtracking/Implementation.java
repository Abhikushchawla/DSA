import java.util.Scanner;

public class Implementation {
	
	class Node {
		Node left, right;
		int data;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	
	static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Node root = createTree();
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
	}
	
	static Node createTree() {
		
		Node root = null;
		System.out.println("Enter data: ");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		
		Node root1 = new Node(data);
		
		System.out.println("Enter left for " + data);
		root1.left = createTree();
		
		System.out.println("Enter right for "+ data);
		root1.right = createTree();
		
		return root1;
	}
	
	static void inOrder(Node root) {
		if(root == null) return;
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	static void preOrder(Node root) {
		if(root == null) return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	static void postOrder(Node root) {
		if(root == null) return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
}

