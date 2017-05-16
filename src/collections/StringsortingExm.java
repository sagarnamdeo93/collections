package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StringsortingExm 
{

	public static void main(String args[]){  
		  
		ArrayList<String> al=new ArrayList<String>();  
		
		al.add("Viru");  
		al.add("Sagar");  
		al.add("Mukesh");  
		al.add("Dhoni");  
		  
		Collections.sort(al);  
		
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		 }  
		}  
	
}
