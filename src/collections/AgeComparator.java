package collections;

import java.util.Comparator;

class AgeComparator implements Comparator
{  
public int compare(Object o1,Object o2)
{  
Employee s1=(Employee)o1;  
Employee s2=(Employee)o2;  
  
if(s1.getAge()==s2.getAge())  
return 0;  
else if(s1.getAge()>s2.getAge())  
return 1;  
else  
return -1; 

}  
}  