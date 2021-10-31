package array;

public class ArrayLargestElement {

	public static void main(String[] args) {
		
		int [] i = {34,66,57,28,68,12,99,34,54,67,50};
		int largest = i[0];
		
		for(int a=1;a<i.length;a++) {
			if(i[a]>largest) {
				largest=i[a];
			}
			
		}
		
		System.out.println("Largest Element Is "+largest);
	}

}
