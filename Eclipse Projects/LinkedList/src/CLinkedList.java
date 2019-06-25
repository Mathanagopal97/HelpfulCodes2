
public class CLinkedList {
	int val;
	CLinkedList next;

	CLinkedList() {
	}

	CLinkedList(int x) {
		val = x;
	}

	public CLinkedList insert(CLinkedList cl, int data) {
		if (cl == null)
			cl = new CLinkedList(data);
		else {
			while (cl.next != null) {
				cl = cl.next;
			}
			cl.val = data;
			cl.next=cl;
		}
		cl.next=null;
		return cl;
	}
	
	public void display(CLinkedList cl) {
		while(cl!=null) {
			System.out.println(cl.val);
			cl=cl.next;
		}
		
	}
}
