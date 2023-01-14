package com.collectionDemo.linkedlistDS;

public class DSLinkedList {

	Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DSLinkedList list= new DSLinkedList();
		
		list.addIntoList(34);
		list.addIntoList(37);
		list.addIntoList(47);
		list.addIntoList(57);
		list.printList();
	}

	  public void printList()
	    {
	        Node tnode = head;
	        while (tnode != null)
	        {
	            System.out.print(tnode.data+" ");
	            tnode = tnode.next;
	        }
	    }
	 
	void addIntoList(int data) {
		Node node= new Node(data);
		if(head==null) {
			head=node;
			head.next=null;
		}else {
			node.next=head;
			head=node;
		}
	}
}

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}