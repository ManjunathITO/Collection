package training_Collection;

import java.util.*;

public class LinkedList_task
{
	public static void main(String[] args)
    {
		Scanner obj = new Scanner(System.in);
		LinkedList l = new LinkedList();
		
		l.add("manju");
		l.add(1);
		l.add(null);
		l.set(1,"frist");
		l.add(8);
		
		System.out.println("Linked list element"+l);
		System.out.println();
		
		// append(add) the specified element to the end of a linked list.
		System.out.println("enter the element to add at end");
		String ele = obj.nextLine();
		l.addLast(ele);
		System.out.println("after adding element at end "+l);
		System.out.println();
		
		//iterate through all elements in a linked list.
		ListIterator itr = l.listIterator();
		int i=0;
		while(itr.hasNext())
		{
			System.out.print(" "+itr.next());
			i++;
		}
		System.out.println();
		System.out.println("LinkedList has "+ i+" element");
		System.out.println();
		
		//iterate through all elements in a linked list starting at the specified position
		System.out.println("enter the Starting position to iterate");
		int start = obj.nextInt();
		ListIterator itr4 = l.listIterator(start);
	     System.out.print("iteration is donr from Specified position");
			while(itr4.hasNext())
			{
				System.out.println(" "+itr4.next());
				
			}
		
		
		//to iterate a linked list in reverse order.
		System.out.println("revers result using iterator");
		while(itr.hasPrevious())
		{
			System.out.print(" "+itr.previous());
			
		}
		System.out.println();
		
		
		//insert the specified element at the specified position in the linked list.
		System.out.println();
	     System.out.println("enter specific element as (string) to be interted in Spesific position");
	     String str = obj.next();
	     System.out.println("enter specipic position");
	     int n = obj.nextInt();
	     System.out.println(l.set(n, str));
	     System.out.println("Ater inserting"+l);
	     System.out.println();
		
	     //insert the specified element at the front of a linked list.
	     System.out.println("enter specipic element as string to added at first");
	     String first = obj.next();
	     l.addFirst(first);
	     System.out.println(l);
	     System.out.println();
	     
	     //insert the specified element at the end of a linked list.
	     System.out.println("enter specipic element as string to added at last");
	     String last = obj.next();
	     l.addLast(last);
	     System.out.println(l);
	     System.out.println();
	     
	     //display the elements and their positions in a linked list.
	     ListIterator itr2 = l.listIterator();
	     int j=0;
			while(itr2.hasNext())
			{
				System.out.println(" "+itr2.next()+"is in "+j+" location");
				j++;
			}
	     
	     //remove & Retrive first and last element from a linked list.
	     System.out.println(" Retrived first"+l.removeFirst());
	     System.out.println(" Retrived last"+l.removeLast());
	     System.out.println("result after removing first & last element"+l);
	     System.out.println();
	     
	     //retrieve but does not remove, the first element of a linked list
	     System.out.println("retrieve but does not remove, the first element "+l.getFirst());
	     System.out.println(l);
	     System.out.println();
	     
	     //check if a particular element exists in a linked list.
	     ListIterator itr3 = l.listIterator();
	     System.out.println("enter element to check");
	     String s = obj.next();
	    			while(itr3.hasNext())
			{
				if(s == itr3.next())
				{
					System.out.println("yes it present");
					break;
				}
				
				
			}
	     
	     
	     //remove all the elements from a linked list
	     l.removeAll(l);
	     System.out.println("result after removing all element"+l);
		
	} 
}
