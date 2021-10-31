package array;

public class ArraySmallerElement {

	public static void main(String[] args) {
		
		int [] i = {43,78,66,44,82,91,29,99,7};
		int smallest = i[0];
		
		for(int a=1;a<i.length;a++) {
			if(i[a]<smallest) {
				
				smallest=i[a];
			}
		}
		
		System.out.println("Smallest Element Is "+smallest);
	}

}
