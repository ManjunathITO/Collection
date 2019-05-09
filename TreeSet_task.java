package training_Collection;
import java.util.*;
public class TreeMap_task
{
   public static void main(String[] args)
   {
	   Scanner obj = new Scanner(System.in);
	   TreeMap tm = new TreeMap();
	   
	   //to create a TreeMap of <studentId(Integer), studentName(String)>. Add some student reocrds with random student ids. 
	   System.out.println("enter the number of student");
	   int n = obj.nextInt();
	   for (int i = 0; i < n; i++) 
	   {
		System.out.println("enter the key in integer");
		int x = obj.nextInt();
		System.out.println("enter the key in string");
		String str = obj.next();
		tm.put(x,str);
		
	   }
	   System.out.println(tm);
	   
	   //to get all keys from the given a Tree Map.
		  Set keys = tm.keySet();
		  System.out.println("Set of Keys contains: ");
		  Iterator it = keys.iterator();
		    // Displaying keys. Output will not be in any particular order
		    while(it.hasNext())
		    {
		       System.out.print(" "+it.next());
		    }
		    System.out.println();
		    
		    //to get the first (lowest) key and the last (highest) key currently in a map.
		    System.out.println("first key "+tm.firstKey());
		    System.out.println("last key "+tm.lastKey());
	
   }
}
