package callThis;

public class Demo {
 int i;
 Demo (int i){
	 this.i=i;
	 System.out.println(i);
 }
 public void wish(){
	 System.out.println("inside wish");
	 this.display();
 }
 public void display(){
	 System.out.println("inside display");
 }
	public static void main(String[] args) {
		Demo d=new Demo(10);
		d.wish();
		
	}

}
