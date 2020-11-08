package BinaryTree;

import java.io.FileWriter;
import java.lang.*;
import java.util.Scanner;
import java.util.LinkedList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


public class BinaryTree {
	

	public static void main(String[] args) throws IOException {
		
		
		LinkedList0 ll = new LinkedList0();
		int numLines = 0;
		String csvSplitBy = ",";
		
		String dataFile = "D:\\Users\\Jeffrey Blumel\\git\\CSIS2420F20\\Week 2\\GenRandAccounts\\Users.csv";
	
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(dataFile));
		


		String line = "";
		
		String User;
		int IP;
		
		
		while ((line = reader.readLine()) != null){ 
			numLines++;
			
			
			String[] split = line.split(csvSplitBy);
			//System.out.println(split[0] + " " + split[1]);
			
			IP = Integer.parseInt(split[0]);
			User = split[1];
			ll.append(IP, User);
			//System.out.println("appended" + IP + User);
			
		}
		
		
		
		
		ll.printLinkedList(); //prints data while it's in a linked list
			ll.sort();
		//System.out.println("-----****************************************--- after sort");
		ll.printLinkedList(); //prints data while it's in a linked list
		
		BinaryTreeNode root = ll.sortedListToBT();
		
		
		// function traverses unordered the binary tree prints from root to leaves 
		ll.preOrder(root);
		ll.count0(root);
		//ll.preOrder(root);
		
		
		System.out.println("----------------------------");
		System.out.println("1-Build Users Tree");
		System.out.println("2-Find by IP Address");
		System.out.println("3-Find by Username");
		System.out.println("4-Report Number of Nodes");
		System.out.println("5-Print Entire Tree");
		System.out.println("6-Exit");
		System.out.println("----------------------------");
		int selection;
		Scanner keyboard = new Scanner(System.in);
		selection = keyboard.nextInt();
		
		
		if (selection == 2)
			ll.searchIP(root); // function to search for an IP
		
		if (selection == 3)
			ll.searchUser(root); // function to search for a User
		
		if (selection == 4)
			ll.nodecountbinary(root); //function counts number of nodes once a binary tree
		
		ll.count0(root);
		//ll.countnodes(head);
		
		keyboard.close();
		reader.close();
		}
		
		
	}


