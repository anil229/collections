package collections.basic;

import java.io.FileReader;
import java.util.Properties;

public class Properties02 {

	public static void main(String[] args) throws Exception {
		Properties p1=new Properties();
		FileReader in=new FileReader("a:/myfile.properties");
		p1.load(in);
		System.out.println(p1);
	}
}
