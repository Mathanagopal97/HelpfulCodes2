
public class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public LinkedList insert(LinkedList list, int data) {
		Node new_node =new Node(data);
		new_node.next=null;
		
		if(list.head==null) list.head=new_node;
		else
		{
			Node last = list.head;
			while(last.next!=null)
				last=last.next;
			last.next=new_node;
		}
		return list;
	}
	
	public void Display(LinkedList list) {
		Node start = list.head;
		while(start!=null) {
			System.out.println(start.data);
			start = start.next;
		}
	}

}
