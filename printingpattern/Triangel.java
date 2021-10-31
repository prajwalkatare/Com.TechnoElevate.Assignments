package printingpattern;

public class Triangel {
	
	public static void main(String[] args) {
		
		int n =10;
		
		for (int i=0; i<=n; i++) {
			
			for (int a=0; a<=i; a++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	} 

}
