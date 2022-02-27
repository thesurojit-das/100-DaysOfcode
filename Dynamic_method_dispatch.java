class Aa {
	void show() {
		System.out.println("Im from class A");
	}
}
class B extends Aa{
	void show()
	{
		System.out.println("Im from class B");
	}
}
class C extends B{
	void show() {
		System.out.println("Im from class C");
	}
}
public class Dynamic_method_dispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aa a=new Aa();
		B b=new B();
		C c=new C();
		Aa A;
		A=a;
		A.show();
		A=b;
		A.show();
		A=c;
		A.show();
		
	}

}
