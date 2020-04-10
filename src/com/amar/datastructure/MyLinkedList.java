package com.amar.datastructure;

public class MyLinkedList {
	Node head=null;
	Node tail=null;

	public void add(int data) {
		Node node = new Node(data);
		
		if (head == null) {
			head=node;
			tail=node;
		}else {
			tail.next=node;
			tail=node;
		}

	}

	
	  public void deleteFromEnd() {  
	        if(head == null) {  
	            System.out.println("List is empty");  
	            return;  
	        }  
	        else {  
	           
	            if(head != tail ) {  
	                Node current = head;  
	               
	                while(current.next != tail) {  
	                    current = current.next;  
	                }  
	                tail = current;  
	                tail.next = null;  
	            }  
	            else {  
	                head = tail = null;  
	            }  
	        } 
	        
	    }  
	  public void show() {
			Node current = head;
			if(head==null) {
				System.out.println("Empty");
				return;
			}
			while(current!=null) {
				System.out.println(current.data+" ");
				current=current.next;
			}
			System.out.println();
		}
	
	}


