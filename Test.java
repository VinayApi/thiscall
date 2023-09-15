package callThis;

public class Test {
 Test(){
	 System.out.println("Default constructer");
 }
 Test(int i){
	 this("vinay");
	 System.out.println("int type constructer "+i);
 }
 Test(String i){
	 this();
	 System.out.println("String type constructer "+i);
 }
	public static void main(String[] args) {
		Test t=new Test(10);
		

	}

}
