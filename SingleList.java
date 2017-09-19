package com.fortinet;

public class SingleList {

	  static Node head;

	 /* Function to reverse the linked list */
	 public Node reverse(Node node) {
	     Node prev = null;
	     Node current = node;
	     Node next = null;
	     while (current != null) {
	         next = current.next;
	         current.next = prev;
	         prev = current;
	         current = next;
	     }
	     node = prev;
	     return node;
	 }

	 // prints content of double linked list
	 public void printList(Node node) {
	     while (node != null) {
	         System.out.print(node.data + " ");
	         node = node.next;
	     }
	 }

		public static Node getHead() {
			return head;
		}
		
		public static void setHead(Node head) {
			SingleList.head = head;
		}

	/* public static void main(String[] args) {
	     SingleList list = new SingleList();
	     
	    list.head = new Node(85);
	     list.head.next = new Node(15);
	     list.head.next.next = new Node(4);
	     list.head.next.next.next = new Node(20);
	     
	     //list.head = new Node(85);
	     
	      
	     System.out.println("Given Linked list");
	     list.printList(head);
	     head = list.reverse(head);
	     System.out.println("");
	     System.out.println("Reversed linked list ");
	     list.printList(head);
	 }*/
	}
