package collections.basic;

import java.util.HashSet;

public class MySet2 {
	public static void main(String[] args) {
		HashSet<Student> set2=new HashSet<>();
		set2.add(new Student(1,"AA",23,353));
		set2.add(new Student(4,"DD",20,53));
		set2.add(new Student(2,"BB",21,153));
		set2.add(new Student(6,"FAF",20,853));
		set2.add(new Student(4,"LOL",33,153));
		set2.add(new Student(1,"CC",23,53));
		for(Student s1:set2){
			System.out.print(s1);
		}
	}

}
