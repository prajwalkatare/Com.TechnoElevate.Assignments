package method;

public class MethodOverloading {

	public static int display(int i) {
		
		System.out.println("int Method");
		return i;
		
	}
	
	public static int display(char c) {
		
		System.out.println("char Method");
		return 12;
	}
	public static void main(String[] args) {
		
		System.out.println("Main Method");
		display(10);
		display('p');
	}

}
