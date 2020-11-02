package BinaryTree;

public class LinkedList0 {
	ListNode head;
	
	public void append(int IP, String User) {
		if (head == null) {
			head = new ListNode(IP, User);
			return;
		}
		
		ListNode current = head;
		
		while (current.next != null) {
			current = current.next;
		}
		current.next = new ListNode(IP, User);
	}
	
	public void printLinkedList() {
		ListNode current = head;
		System.out.print("Linked List: ");
		
		while (current != null) {
			System.out.println("IP: " + current.IP);
			System.out.println("User: " + current.User);
			current = current.next;
		}
		System.out.println("");
	}
	

	
	public void sort() {
		ListNode current = head, index = null;
		int temp0;
		String temp1;
		
		while(current != null) {
			index = current.next;
		
			while (index != null) {
				if(current.IP > index.IP) {
					temp0 = current.IP;
					temp1 = current.User;
					current.IP = index.IP;
					current.User = index.User;
					index.IP = temp0;
					index.User = temp1;
				}
				index = index.next;
			}
		current = current.next;
		
		}
	
	}
	
	public int countnodes (ListNode head) {
		int count = 0;
		ListNode temp = head;
		
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
			//System.out.println(count);
	}
	
	 
	BinaryTreeNode sortedListToBTRecur(int n) {
		if (n <= 0)
			return null;
		
		BinaryTreeNode left = sortedListToBTRecur(n / 2);
		BinaryTreeNode root = new BinaryTreeNode(head.IP, head.User);
		root.left = left;
		head = head.next;
		root.right = sortedListToBTRecur(n - n / 2 - 1);
		return root;
	}
	
	
	BinaryTreeNode sortedListToBT() {
		int n = countnodes(head);
		return sortedListToBTRecur(n);
	}
	
	
	void preOrder(BinaryTreeNode node) {
		if (node == null)
			return;
		
		System.out.print(node.IP + "--");
		System.out.println(node.User );
		preOrder(node.left);
		preOrder(node.right);
	}
	
	
	public void BinaryTreeNodeCount(BinaryTreeNode node) {
		int i = 0;
		if (node == null) {
			System.out.println(i);
			return;
		}
		
			preOrder(node.left);
			preOrder(node.right);
			i++;
		
	}
	
	
}
	
	
	

