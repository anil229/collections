package collections.basic;

public class MainGen {
	public static void main(String[] args) {
		Gen<Integer,String> g1;
		g1=new Gen<Integer,String>(8976,"Non medical");
		Gen<Double,String> g2=new Gen<Double,String>(897.7,"medical");
		Gen<String,String> g3=new Gen<String,String>("897.7","medical");
		g1.show();
		g2.show();
		g3.show();
	}

}
