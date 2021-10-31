package printingpattern;

public class Abab {

	public static void main(String[] args) {
		
		for (int i=0; i<5; i++) {
			
			for(int a=1; a<5; a++) {
				
				if (a%2==0) {
					System.out.print("b");
				}
				
				else {
					System.out.print("a");
				}
			}
			
			System.out.println();
		}
	}

}
