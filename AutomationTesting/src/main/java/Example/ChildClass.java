package Example;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj=new ChildClass();
		obj.display();
		obj.child_display();

	}
	
	public void child_display() {
		System.out.println("Child Class...");
	}

}
