package printingpattern;

public class EmptySuqare {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i = 1; i<=n; i++) {
			
			for (int a  =1; a<=n; a++) {
				
				if (i==1 || i==5 || a==1 || a==5) {
					
					System.out.print("*");
				}
				
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}

}
