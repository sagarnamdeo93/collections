package collections;

import java.util.HashMap;
import java.util.Map;

public class HashmapExm // Contains one null key and multiple null values
{

	 public static void main(String args[])
	 {  
		  Map<Integer,String> map=new HashMap<Integer,String>();  
		  
		  map.put(100,"Amit");  
		  map.put(101,"Vijay");  
		  map.put(102,"Rahul");  
		  
		  for(Map.Entry<Integer,String> m:map.entrySet())
		  {  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		  
		  map.remove(102);
		  
		  System.out.println("After removing element");
		  
		  for(Map.Entry<Integer,String> m:map.entrySet())
		  {  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		  
		  
	 }  
	
}
