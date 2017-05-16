package collections;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExm //no null key or value,Array of list and each list known as bucket
{

	public static void main(String args[])
	{  
		  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Sagar");  
		  
		  for(Map.Entry<Integer,String> m:hm.entrySet())
		  {  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  
	
}
