
public class Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		list.insert(list, 6);
		list.insert(list, 7);
		list.insert(list, 8);
		
		//list.Display(list);
		
		
		CLinkedList clist = new CLinkedList(5);
		clist.next=null;
		clist.insert(clist, 1);
		clist.insert(clist, 2);
		clist.insert(clist, 3);
		clist.insert(clist, 4);
		
		clist.display(clist);

	}

}
