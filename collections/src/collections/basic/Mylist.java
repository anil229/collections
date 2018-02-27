package collections.basic;

import java.util.LinkedList;

public class Mylist {
	public static void main(String[] args) {
		LinkedList<String> list1=new LinkedList<>();
		list1.add("india");
		list1.add("Pakistan");
		list1.add("iraq");
		list1.add("iran");
		list1.add("Russia");
		list1.add("China");
		System.out.println(list1);
		LinkedList<Student> list2=new LinkedList<>();
		list2.add(new Student(1,"AA",23,353));
		list2.add(new Student(2,"BB",21,653));
		list2.add(new Student(3,"CC",29,853));
		list2.add(new Student(4,"DD",33,53));
		System.out.println(list2);
	}
}
