package training_Collection;
import java.util.*;
public class HashMap_task 
{
     public static void main(String[] args)
     {
    	 Scanner obj = new Scanner(System.in);
    	// to create a HashMap of key as student id(Integer) and value as
    	 //Student name (String). Add some entries and print the hash map.
		Map hm = new HashMap();
		hm.put(1,"manju");
		hm.put(2,"hemanth");
		hm.put(3,"loki");
		hm.put(4,"avi");
		hm.put(5,"manju");
		System.out.println("Hash map element");
		System.out.println(hm);
		System.out.println();
		
		//iterate over all the entries in the HashMap.
		System.out.println("iterate over all the entries in the HashMap.");
		Iterator<Map.Entry> itr = hm.entrySet().iterator();
		
		while(itr.hasNext()) 
        { 
             Map.Entry entry = itr.next(); 
             System.out.println("Key = " + entry.getKey() +  
                                 ", Value = " + entry.getValue()); 
        } 
		System.out.println();
		
		//to get the specified value with the specified key in a HashMap.
		System.out.println("enter the Specific key to get the value");
		int x = obj.nextInt();
		String value = (String)hm.get(x);
		System.out.println("valur at key "+x+" is "+value);
		System.out.println();
		
		//count the number of key-value (size) mappings in a map
		System.out.println("number of key-value (size) mappings in a map "+hm.size());
		System.out.println();
		
		//to copy all of the mappings from the specified map to another map.
		HashMap <Integer,String> hm2 = new HashMap <Integer,String> ();
		hm2.put(4, "White");
		hm2.put(5, "Blue");
		hm2.put(6, "Orange");
		hm.putAll(hm2);
		  System.out.println("copied from subHashMap"+ hm);
          System.out.println();
		  
		 // test if a map contains a mapping for the specified key.
		  System.out.println("enter the key to check");
		  int n = obj.nextInt();
		  System.out.println(n);
		  if (hm.containsKey(n)) {
		   //key exists
		   System.out.println("yes! key is present in HashMap  - " + hm.get(n));
		   System.out.println();
		  } else {
		   //key does not exists
		   System.out.println("no! key is not present in HashMap ");
		   System.out.println();
		  }
		  
		  //test if a map contains a mapping for the specified value.
		  System.out.println("enter the valu to check");
		  String m = obj.next();
		  System.out.println(m);
		  if (hm.containsValue(m)) {
		   //key exists
		   System.out.println("yes! vaiue is present in HashMap - " + hm.get(m));
		   System.out.println();
		  } else {
		   //key does not exists
		   System.out.println("no! vaiue is not present in HashMap");
		   System.out.println();
		  }
		  
		  //get a set view of the keys contained in this map.
		  Set keys = hm.keySet();
		  System.out.println("Set of Keys contains: ");
		  Iterator it = keys.iterator();
		    // Displaying keys. Output will not be in any particular order
		    while(it.hasNext())
		    {
		       System.out.print(" "+it.next());
		    }
		    System.out.println();
		    
		    //get a collection view of the values contained in this map
		    System.out.println("Collection view is: "+ hm.values());
		  
	 }
}

