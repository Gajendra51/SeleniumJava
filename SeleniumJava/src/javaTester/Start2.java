package javaTester;

public class Start2 {
	public void m1()
	{
		System.out.println("m1 executed");
	}
	public static void main(String[] args) {
		System.out.println("main executed");
		
		Start2 a =new Start2();
		a.m1();
	}

}
