package array;

public class BubbleSorting {

	public static void main(String[] args) {
		
		int [] i = {48,11,44,22,78,23,55,33,10,99,9};
		
		for(int a=0;a<i.length;a++) {
			for(int b=a+1;b<i.length;b++) {
				if(i[a]>i[b]) {
					int temp=i[a];
					i[a]=i[b];
					i[b]=temp;
					
				}
			}
			//System.out.print(i[a]+" ");
		}
		
		for(int a:i) {
			System.out.print(a+" ");
		}
	}

}
