import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Income {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]  arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		if(arr.length % 2 != 0) {
			System.out.println(arr[Math.round(arr.length/2)]);
		}

		if(arr.length % 2 == 0) {
			double res = arr[arr.length/2] + arr[(arr.length/2) - 1];
			res = res/2;
			res = (int) Math.round(res);
			System.out.println((int)res);
		}
		
		
	}

}
