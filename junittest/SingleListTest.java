package com.fortinet.junittest;
import org.junit.Test;

import com.fortinet.*;

import junit.framework.TestCase;

public class SingleListTest extends TestCase {
	@Test
	public void revTest() {
		SingleList list = new SingleList();
		
		Node node1 = new Node(85);
		Node node2 = new Node(15);
		Node node3 = new Node(4);
		Node node4 = new Node(26);
		node1.setNext(node2); 
		node2.setNext(node3); 
		node3.setNext(node4);
		
		//list.setHead(node1);
	     
	     System.out.println("Given Linked list");
	     list.printList(list.getHead());
	     list.setHead(list.reverse(list.getHead()));
	     System.out.println("");
	     System.out.println("Reversed linked list ");
	     list.printList(list.getHead());
	    assertEquals(node4.getData(),list.getHead().getData());
	     
	     
	}
}
