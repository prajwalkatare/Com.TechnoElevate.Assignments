package printingpattern;

public class Diamond {

	public static void main(String[] args) {
		
		int n = 4;
		int star = 1;
		int space = n-1;
		
		for (int i=1; i<=n; i++) {
			
			for (int a=1; a<=space; a++) {
				
				System.out.print(" ");
			}
			
			for (int b=1; b<=star; b++) {
				
				System.out.print("*");
			}
			
			star++;
			star++;
			space--;
			
			System.out.println();
		}
	
		n=5;
		star = n;
		space = 1;
		
		for (int i=1; i<=n; i++) {
			
			for (int a = 1; a<=space; a++) {
				
				System.out.print(" ");
			}
			
			for (int b = 1; b<=star; b++) {
				
				System.out.print("*");
			}
			
			star--;
			star--;
			space++;
			System.out.println();
		}
	}

}
