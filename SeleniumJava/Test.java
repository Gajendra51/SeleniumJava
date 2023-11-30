//Static control flow is one time activity which will be performed at class loading
//But Instance control flow is not one time activity and it will be performed for every object creation
class Test{
{
	System.out.println("First Instance Block");
	
}
static
{
	System.out.println("First Static Block");
}
Test
{
System.out.println("Constructor");	
	
}
public static void main(String[] args)
{
	Test t1 = new Test();
	System.out.println("Main");
	Test t2 = new Test();
}
Static{
	System.out.println("Second Static Block");
}
{
	System.out.println("Second Instance Block");
}
}