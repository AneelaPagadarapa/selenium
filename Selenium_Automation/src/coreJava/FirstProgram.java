package coreJava;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FIND THE LARGE NUMBER
		int a = 6566;
		int b = 6566;
	//if the condition is true, then system will go into block
		if (a>b) {
			System.out.println("if block, executed");
			System.out.println("a is larger value");
		}else if (b>a) {
			System.out.println("else block, executed");
			System.out.println("b is larger value");
		}else {
			System.out.println("else block, executed");
			System.out.println("both are equal");
		}
	
	}

}
