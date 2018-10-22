import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeSet;

import com.sun.xml.internal.bind.v2.model.core.ID;

class Student{
	String name;
	int id;
	Student(String a, int b){
		name=a;
		id=b;
	}
	@Override
	public int hashCode(){
		return (name.hashCode()+id)*3;
	}
	public boolean equals(Object ob){
		
		if(getClass()!=ob.getClass()){
			return false;
		}
		Student st =(Student)ob;
		if(this.name.equals(st.name)&&(this.id==st.id)){
			return true;
		}else{
			return false;
		}
	}
}

public class Program10 {
	public static void main(String[] args) {
		HashMap<Student, Integer> st = new HashMap<>();
		Student s1=new Student("pavan",1);
		Student s2=new Student("pavan",1);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
}
}
