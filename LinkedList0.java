package BinaryTree;

import java.util.Scanner;

public class LinkedList0 {
	ListNode head;
	
	public void append(int IP, String User) { // pulls array [0] and [1] into linked list 
		if (head == null) {
			head = new ListNode(IP, User);
			return;
		}
		
		ListNode current = head;
		
		while (current.next != null) {
			current = current.next;
		
		}
		current.next = new ListNode(IP, User);
		
		//if (current.next.next == null)
			//System.out.println("testtest -------");
	}
	
	public void printLinkedList() {// prints as a linked list 
		ListNode current = head;
		System.out.println("Linked List: ");
		
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
	
	
	
	
	BinaryTreeNode sortedListToBT() {
		int n = countnodes(head);
		//System.out.println(n + " = number of nodes-----------------------------------");
		return sortedListToBTRecur(n);
		
	}
	
	 
	BinaryTreeNode sortedListToBTRecur(int n) {
		//System.out.println(n + "==========================");
		if (n <= 0) {
			//System.out.println("node count less than or equal to zero---------------");
			return null;
		}	
		
		BinaryTreeNode left = sortedListToBTRecur(n/2);
		BinaryTreeNode root = new BinaryTreeNode(head.IP, head.User);
		root.left = left;
		head = head.next;
		root.right = sortedListToBTRecur((n-(n/2))-1);
	return root;
	}
	
	void preOrder(BinaryTreeNode node) {
		if (node == null)
			return;
		//if (node != null)
			
		//System.out.print("IP: " + "10.0.0." + node.IP);
		//System.out.println(" User: " + node.User);
		preOrder(node.left);
		//System.out.println("test0");
		preOrder(node.right);
		//System.out.println("test1");
		
	}
	
	
	int k;
	void count0(BinaryTreeNode node) {
		if(node == null)
			return;
		if(node != null)
			k++;
		preOrder(node.left);
		preOrder(node.right);
		//System.out.println(k + "-----mycount-------------------");
	}
	
	
	public String input() {
		
		System.out.println("Enter the last 3 digits of the IP you are looking for or the User (format flast): ");
		String enteredIP;	
		Scanner EIP = new Scanner(System.in);
		enteredIP = EIP.nextLine();
		return enteredIP;
	}
	

	
	public void searchcall(BinaryTreeNode node) {
		String enteredIP = input();
		searchIP(node, Integer.parseInt(enteredIP));
		
	}
	
	public void searchIP(BinaryTreeNode node, int enteredIP) {
		
		if(node == null) 
			return;
		
		else if(enteredIP == node.IP) {
			System.out.println("Your match is: IP-10.0.0." + node.IP + " User-" + node.User);
			return;
		}	
		
		searchIP(node.left, enteredIP);
		searchIP(node.right, enteredIP);
	}
	
	public void searchUsercall(BinaryTreeNode node) {
		String enteredUser = input();
		searchUser(node, enteredUser);
	}
	
	public void searchUser(BinaryTreeNode node, String enteredUser) {
		if(node == null)
			return;
		
		else if(enteredUser.equals(node.User)) {
			System.out.println("Your match is: IP-10.0.0." + node.IP + " User-" + node.User);
			return;
		}
		searchUser(node.left, enteredUser);
		searchUser(node.right, enteredUser);
	}
	
		
		int i=0;
		
		public void nodecountcall(BinaryTreeNode node) {
			System.out.println(nodecountbinary(node));
			i=0;
		}
		
		
		public int nodecountbinary(BinaryTreeNode node) {
		
			
			if (node == null) 
				return i;
			
			i++;	
			nodecountbinary(node.left);
			nodecountbinary(node.right);
		
		return i;
	}
	
	
		public void printbtreecall(BinaryTreeNode node) {
			printbtree(node);
			
		}
		
		public void printbtree(BinaryTreeNode node) {
			if (node == null)
			return;
			
			else if (node != null)
				System.out.println("IP-10.0.0." + node.IP + " User-" + node.User);
			
			printbtree(node.left);
			printbtree(node.right);
		}
		
		
		
		
		
	/*public void BinaryTreeNodeCount(BinaryTreeNode node) {
		int j=0;
		//System.out.println("test00" + " " + i + " .. " + node);
		for(int i = 0; node.left != null && node.right != null; i++ ) {
			
				
			
				preOrder(node.left);
				preOrder(node.right);
				j++;
				System.out.println("10.0.0." + i + " test2");
				
		}
		
		if (node.left == null || node.right == null) {
			System.out.println( "=null" + j );
			
		}
		
		
	}*/
	
}	

	
	








