package collections.basic;

public class Gen<T,V> {
	T obj;
	V obj2;
	
	public Gen(T obj1, V obj3){
		obj=obj1;
		obj2=obj3;
	}
	
	public void show(){
		System.out.println("The object is "+obj);
		System.out.println("The object2 is "+obj2);
		//System.out.println("The argument first class is "+g1.obj.getClass().getName());
		System.out.println("The class is "+obj.getClass().getName());
		System.out.println("The 2nd class is "+obj2.getClass().getName());
		}
}
