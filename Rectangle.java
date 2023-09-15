package callThis;

public class Rectangle {
	int length;
	int bredth;
	String colour;
 Rectangle(int length,int bredth){
	 this.length=length;
	 this.bredth=bredth;
	 System.out.println("area of the rectangle "+length*bredth);
 }
 Rectangle(String colour){
	 this(10,20);
	 this.colour=colour;
	 System.out.println("colur "+colour);
 }
	public static void main(String[] args) {
		Rectangle r=new Rectangle("red");
		

	}

}
