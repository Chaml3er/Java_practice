import java.util.Scanner;

public class CoinChange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		int c = 0;
		int index = 0;
		int count = 0;
		int check = 0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]*2 == a) {
				check = 1;
			}
			if(arr[i] == a) {
				check = 2;
				count = 1;
				break;
			}
		}
		
	
		if(check == 0) {
		while(a != 0) {	
			int min = Integer.MAX_VALUE;
			for(int i=0;i<n;i++) {
				c = a/arr[i];
				if(c > 0) {
					if(c < min) {	
						min = c;
						index = i;
						
					}
				}
				
			}
				a = a - arr[index];
				count++;
		}}
		else if(check == 1) {
			count = 2;
		}
		
		System.out.println(count);
		
	
		}
}

