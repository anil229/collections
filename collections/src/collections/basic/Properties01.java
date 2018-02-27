package collections.basic;

import java.io.FileWriter;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Properties01 {
	public static void main(String[] args) {
		Properties p1;
		p1=System.getProperties();
		Set<Object> set= p1.keySet();
		for(Object o1:set){
			String val=p1.getProperty(o1.toString());
			System.out.println(o1.toString()+"-----"+val);
		}
		p1=new Properties();
		p1.setProperty("AA", "123/5 Delhi Pitampura");
		p1.setProperty("BB", "223/5 Delhi Pitampura");
		p1.setProperty("DD", "123/7 Delhi Pitampura");
		p1.setProperty("CC", "12 Delhi CP");
		p1.setProperty("PP", "123 Delhi MT");
		p1.setProperty("FF", "1321/5 Delhi Pitampura");
		p1.setProperty("JJ", "3/9 Delhi Pitampura");
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the person's name");
		String name=in.nextLine();
		String addr=p1.getProperty(name);
		System.out.println(name+"======"+addr);
		try{
		FileWriter out=new  FileWriter("a:/myfile.properties");
		p1.store(out, "List of people with addresses");
		out.flush();out.close();
		}catch(Exception e){e.printStackTrace();}
	}
}
