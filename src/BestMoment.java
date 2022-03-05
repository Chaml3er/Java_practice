/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BestMoment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[] arr = new int[m+n];
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		
		for(int i=0;i<n;i++) {
			int sum = 0;
			for(int j=i;j<m+i;j++) {
				sum += arr[j];	
				res.add(sum);
			}
		}
		
		int maxres = res.get(0);
		for(int i=0;i<res.size();i++) {
			if(maxres < res.get(i)) {
				maxres = res.get(i);
			}
		}
			
		
		System.out.println(maxres);
		
	}

}


