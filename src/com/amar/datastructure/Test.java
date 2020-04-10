package com.amar.datastructure;

public class Test {

	public static void main(String[] args) {
		MyLinkedList ml = new MyLinkedList();
		ml.add(10);
		ml.add(20);
		ml.add(15);
		ml.add(25);
		
		ml.show();
		while (ml.head != null) {
			ml.deleteFromEnd();
			System.out.println("Updated Linked List: ");
			ml.show();
		}

	}

}
