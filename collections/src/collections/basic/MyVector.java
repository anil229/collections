package collections.basic;

import java.util.Enumeration;
import java.util.Vector;

public class MyVector {
	public static void main(String[] args) {
		Vector<String> list1=new Vector<>();
		list1.add("india");
		list1.add("Pakistan");
		list1.add("iraq");
		list1.add("iran");
		list1.add("Russia");
		list1.add("China");
		Enumeration<String> e=list1.elements();
		while(e.hasMoreElements()){
			String s=e.nextElement();
			System.out.println(s);
		}
		for(String s:list1){
			System.out.println(s);
		}
		System.out.println(list1);
		Vector<Student> list2=new Vector<>();
		list2.add(new Student(1,"AA",23,353));
		list2.add(new Student(2,"BB",21,653));
		list2.add(new Student(3,"CC",29,853));
		list2.add(new Student(4,"DD",33,53));
		System.out.println(list2);
	}


}
