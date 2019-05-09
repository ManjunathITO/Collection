package training_Collection;
import java.util.*;
public class HashSet_task
{
      public static void main(String[] args) 
      {
    	  Scanner obj = new Scanner(System.in);
    	  HashSet<String> h = new HashSet<String>();
    	  
    	  //add student names in a hash set.
    	  System.out.println("enter the number of student to be entered in HashSet");
    	  int n = obj.nextInt();
    	  for (int i = 0; i < n; i++)
    	  {
			System.out.println("enter the "+i+"  sudent name");
			String str= obj.next();
			h.add(str);
		  }
    	  System.out.println("students in HashSet"+h);
    	  System.out.println();
    	  
    	 //to iterate through all elements in a hash list. 
    	  //get the get the number of elements in a hash set
    	  Iterator itr = h.iterator();
    	  int j=0;
          while(itr.hasNext())
          {
              System.out.print(" "+itr.next());
              j++;
          }
          System.out.println();
          System.out.println("the number of elements in a hash set "+ j);
          System.out.println();
    	  
          
          //to convert a hash set to an array.
          String[] arrstr = new String [h.size()];
          h.toArray(arrstr);
          System.out.println("converted hash set to an array ");
          for (int i = 0; i < arrstr.length; i++) 
          {
			System.out.print(" "+arrstr[i]);
		  }
          System.out.println();
    	  
          //to convert a hash set to a ArrayList
          ArrayList<String> al = new ArrayList<>(h);
          System.out.println("result after converting  hash set to a ArrayList"+al);
          System.out.println();
          
          //to compare two hash set.
          HashSet<String> subset = new HashSet<String>();
          subset.add("swd");
          subset.add("xd");
          System.out.println("another hashset elements"+subset);
          System.out.println("compaired result "+subset.containsAll(h));
          System.out.println();
          
          //compare two sets and retain elements which are same on both sets.
          System.out.println("compared two sets and retain elements which are same on both sets");
          System.out.println(h.retainAll(subset));
          System.out.println(h);
          System.out.println();
          
         //remove all of the elements from a hash set.
          subset.removeAll(subset);
          System.out.println("remove all of the elements from a hash set  "+subset);
          
          
	  }
}
