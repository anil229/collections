package collections.basic;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MyMap {
	public static void main(String[] args) {
		HashMap<Integer, Student> map2=new HashMap<>();
		map2.put(1,new Student(1,"AA",23,353));
		map2.put(4,new Student(4,"DD",20,53));
		map2.put(2,new Student(2,"BB",21,653));
		map2.put(6,new Student(6,"FAF",29,853));
		map2.put(4,new Student(4,"LOL",33,153));
		map2.put(3,new Student(3,"CC",41,553));
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the id to search for : ");
		int id=in.nextInt();
		Student s1=map2.get(id);
		System.out.println(s1);
		Set<Integer> set=map2.keySet();
		for(int x:set){
			Student s2=map2.get(x);
			System.out.println(x+"=="+s2);
		}
}
}
