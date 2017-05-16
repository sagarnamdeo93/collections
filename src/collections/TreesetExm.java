package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetExm 
{

	 public static void main(String args[])
	 {  
		  //Creating and adding elements  
		  TreeSet<String> al=new TreeSet<String>(); 
		  
		  al.add("Sagar");  
		  al.add("Vijay");  
		  al.add("Sagar");  
		  al.add("Ajay");  
		  
		  //Traversing elements  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  
	
}
