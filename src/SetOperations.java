import java.util.*;    //calling all the classes of util package
import java.util.HashMap;   //using hashmap class of util for handeling collection and generic objects

public class SetOperations {    //Class to show union operation on sets

	  public static void main(String[] argv) throws Exception {   //public main class to perform all the functions  and in case of exception, throwing it
	    Set set1 = new HashSet();   //object of Set class and initializing using new operator
	    Set set2 = new HashSet();	//object of Set class and initializing using new operator

	    //Adding integer and string both type of values to SET1
	    
	    set1.add("My Name is Yogita");    
	    set1.add("This is Java Batch Assignment");    //passing string value
	    set1.add(1821);     //passing integer value
	    
	    System.out.println("=====Printing all the elements of set 1=====\n");
	    System.out.println("Set1: "+set1);   //Current elements of set1
	    
	    System.out.println("\n=======Copying and printing all the elements of the set1 to set2=====\n");
	    set2.addAll(set1);    //copying all the elements using addAll operator
	  
	    System.out.println("Set2: "+set2);  //printing all the copies element of set1 to Set2

	  }
	}
