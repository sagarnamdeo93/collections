package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistExm
{
	  
	  
	 public static void main(String args[])
	 {  
	  ArrayList<String> list1=new ArrayList<String>();//Creating arraylist
	  
	  list1.add("Ravi");//Adding object in arraylist  
	  list1.add("Sagar");  
	  list1.add("Ravi");  
	  list1.add("Ajay");  
	  list1.add("Sagar");
	  
	  ArrayList<String> list2=new ArrayList<String>();  
	  
	  list2.add("Sonu");  
	  list2.add("Monu");  
	  
	  list1.addAll(list2);//adding second list in first list  
	    
	  Iterator<String> itr=list1.iterator();  //Traversing list through Iterator
	  while(itr.hasNext())
	  {  
	   System.out.println(itr.next());  
	  }  
	  
	/*  for(String obj:list1)  // Traversing list through foreach loop
	  	{	
		    System.out.println(obj);  
		}  */
	  
	 }  

}
