import java.util.ArrayList;
import java.util.Scanner;

public class Equalize {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		int[] check = new int[n];
		
		for(int i=0;i<n;i++) {
			int equal = sc.nextInt();
			arr.add(equal);
		}
		
		sc.close();
	
		int count = 0;
			
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr.get(i) == arr.get(j+1)) {
					count++;
				}
			}
			check[i] = count;
			count = 0;
		}
		
		int max = 0;
		int index = 0;
		for(int i=0;i<n;i++) {
			if(max < check[i]) {
				max = check[i];
				index = i;
			}
		}
		
		System.out.println(arr.get(index));
		for(int i=0;i<n;i++) {
			if(arr.get(i) != arr.get(index)) {
				System.out.println(arr.get(i));
			}
		}
		
	}

}
