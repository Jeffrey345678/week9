package BinaryTree;

public class BinaryTreeNode {
	int IP;
	String User;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	BinaryTreeNode(int IP, String User){
		this.IP = IP;
		this.User = User;
		left = null;
		right = null;
	}
}
