package linkedlist;

public class Singlelinkedlist {
	
	Node head;

	static class Node{
		int data;
		Node next;
		
	}
	
	public  void insert(int data) {
		
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		if(head==null) {
			head=node;
		}
		else {
			Node temp =head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=node;
		}
		System.out.println("data inserted into the list");
		
	}
	public void insertstart(int data) {
		Node node= new Node();
		node.data=data;
		node.next=head;
		head=node;
		
		System.out.println("data inserted into the list at start");
	}
	public void insertatindex(int index,int data) {
		Node node=new Node();
		node.next=null;
		node.data=data;
		
		
		if(index==0) {
			insertstart(data);
		}
		else {
		Node temp=head;
		
		
		
		for(int i=0;i<index-1;i++){
			temp=temp.next;
			
		}
		node.next=temp.next;
		temp.next=node;
		
		System.out.println("inserted succesfully at "+ index);
		}
		
	}
	
	public void deleteAt(int index) {
		Node temp= head;
		Node n1=null;
		for(int i=0;i<index-1;i++) {
			temp=temp.next;
		}
		
		n1=temp.next;
		temp.next=n1.next;
		
		System.out.println("data deleted");
	}
	
	public void update(int index,int data) {
		Node node=head;
		for(int i=0;i<index-1;i++) {
			node=node.next;
		}
		node.data=data;
		
		System.out.println("data updated");
	}
	public void showdata() {
		Node temp =head;
		
		while(temp.next!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	
	public static void main(String[] args) {
		
		Singlelinkedlist list =new Singlelinkedlist();
		list.insert(5);
		list.insert(4);
		list.insert(6);
		list.insert(7);
		list.insertatindex(2,9);
		list.showdata();
		list.deleteAt(4);
		list.showdata();
		list.update(2, 1);
		list.showdata();
	}

}
