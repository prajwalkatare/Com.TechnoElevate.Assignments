package array;

public class SumOfArray {

	public static void main(String[] args) {
		
		int [] i = {30,44,34,78,57,46,23};
		int sum = 0;
		
		for(int a=0;a<i.length;a++) {
			sum=sum+i[a];
		}
		
		System.out.println("Sum Is "+sum);
	}

}
