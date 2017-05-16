package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorsortingExm 
{

	public static void main(String args[])
	{  
		  
		ArrayList<Employee> al=new ArrayList<Employee>();  
		
		al.add(new Employee(101,"Vijay",23));  
		al.add(new Employee(106,"Ajay",27));  
		al.add(new Employee(105,"Jai",21));  
		  
		System.out.println("Sorting by Name...");  
		  
		Collections.sort(al,new NameComparator());  
		
		Iterator<Employee> itr=al.iterator();  
		while(itr.hasNext())
		{  
		Employee st=(Employee)itr.next();  
		System.out.println(st.getRollno()+" "+st.getName()+" "+st.getAge());  
		}  
		  
		System.out.println("sorting by age...");  
		  
		Collections.sort(al,new AgeComparator());  
		Iterator<Employee> itr2=al.iterator();  
		while(itr2.hasNext()){  
		Employee st=(Employee)itr2.next();  
		System.out.println(st.getRollno()+" "+st.getName()+" "+st.getAge());  
		}  
		  
		  
		}  
	
}
