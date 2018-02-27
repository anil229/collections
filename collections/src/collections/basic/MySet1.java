package collections.basic;

import java.util.Comparator;
import java.util.TreeSet;

public class MySet1 {
public static void main(String[] args) {
		
		TreeSet<Student> set2=new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return -s1.getSname().compareTo(s2.getSname());
			}
			
		});
		set2.add(new Student(1,"AA",23,353));
		set2.add(new Student(4,"DD",20,53));
		set2.add(new Student(2,"BB",21,653));
		set2.add(new Student(6,"FAF",29,853));
		set2.add(new Student(5,"LOL",33,153));
		set2.add(new Student(3,"CC",41,553));
		for(Student s1:set2){
			System.out.println(s1);
		}
	}
}
