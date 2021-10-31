package array;

public class FindKeyInArray {

	public static void main(String[] args) {
		
		int [] i = {29,44,34,57,45,23,77,99,23,45,10};
		int key = 77;
		int flag = 0;
		
		for(int a=0;a<i.length;a++) {
			if(key==i[a]) {
				flag++;
				System.out.println("Key Found In Array Index Of "+a);
				return;
			}
		}
		
		if(flag==0) {
			System.out.println("Key Not Found");
		}

	}

}
