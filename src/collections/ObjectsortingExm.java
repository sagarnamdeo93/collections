package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ObjectsortingExm 
{

	public static void main(String args[])
	{  
		ArrayList<Student> al=new ArrayList<Student>(); 
		
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Sagar",27));  
		al.add(new Student(105,"Jai",21));  
		  
		Collections.sort(al);  
		
		for(Student st:al){  
		System.out.println(st.getRollno()+" "+st.getName()+" "+st.getAge());  
		}  
		}  
	
}
