package training_Collection;
import java.util.*;


public class ArrayList_Task 
{
     public static void main(String args[]) 
     {
    	 Scanner obj = new Scanner(System.in);
	      ArrayList students=new ArrayList();   // created Arraylist for student Object
	      students.add("manju");
	      students.add("hemanth");
	      students.add("loki");
	      students.add("avinash");
	      students.add("abc");
	      students.add("xzy");
	      
	      //displaying students name
	      System.out.println("list of student"+students);
	      System.out.println();
	      
	      //inserted an element into the array list at the first position
	      students.add(0, "steve");
	      System.out.println();
	   
	      //displaying elements
	      System.out.println("result after inserted a element"+students);
	      System.out.println();
	     
	    //retrieve an element (at a specified index) from a given array list
	      System.out.println("enter the position number you want retrieve an element(student name) ");
	      int index = obj.nextInt();
	     System.out.println(students.get(index));
	      System.out.println();
	      
	      //update specific array element by given element.
	      System.out.println("enter the element to be uptated");
	      obj.nextLine();
	      String updatename = obj.nextLine();
	     System.out.println(updatename);
	      System.out.println("enter the position to be uptated");
	      int position = obj.nextInt();
	      //System.out.println(position);
	    System.out.println(students.set(position, updatename));
	     System.out.println("result after update done"+students);
	     System.out.println();
	     
	   //remove the third element from a array list. 
	     students.remove(2);
	     System.out.println("result after removing 3rd element"+students);
	     System.out.println();
	     
	     //search an element in a array list.
	      Iterator a =  students.iterator();
	      System.out.println("enter element to search ");
		    String str = obj.next();
		    System.out.println(str);
	    		  while(a.hasNext())
	    		  {
	    			  if(str == a.next())
	    			  {
	    				  System.out.println("yes");
	    				  break;
	    			  }
	    			       
	    		  }
	     //System.out.println("enter element to search ");
	    // String str = obj.next();
	    // System.out.println(str);
	     
	     
	     //sort a given array list
	     Collections.sort(students);
	     System.out.println("reult ater sorting it to assending order"+students);
	     System.out.println();
	     
	     //copy one array list into another.
	     ArrayList copystudents = (ArrayList)students.clone();
	     System.out.println("copy of ArrayList: "+ copystudents);
	     System.out.println();
	     
	    // reverse elements in a array list
	     System.out.println("ArrayList Before Reverse :");
         System.out.println(students);
         System.out.println();
	         
	        Collections.reverse(students);//Reversing the list using Collections.reverse() method
	        
	        System.out.println("ArrayList After Reverse :");
	        System.out.println(students); //Printing list after reverse
	        System.out.println();
	        
	        //join two array lists
	        students.addAll(copystudents);
	        System.out.println("joined two array lists"+students);
	        System.out.println();
	        
	        //empty an array list.
	        copystudents.removeAll(copystudents);
	        System.out.println("result after empty Arraylist"+copystudents);
	        System.out.println();
	        
	        if(students.isEmpty())
	        {
	        	System.out.println("Array list is empty");
	        }
	        else
	        	System.out.println("Array list is not empty");
	 }
}
