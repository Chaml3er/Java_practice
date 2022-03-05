import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PeriodCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
	
	
		int max = 0;
		int Period[] = new int[n];
		int[] checkerMax = new int[n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(j != m-1) {
					int num = arr[j][i] - arr[j+1][i];
					num = Math.abs(num);
					if(num > max) {
						max = num;
						checkerMax [i] = max;
					}
				}
			}
			max = 0;
		}
		
		for(int i=0;i<n;i++) {
			Period[i] = 1;
		}
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(j != m-1) {
					int num = arr[j][i] - arr[j+1][i];
					num = Math.abs(num);
					if(checkerMax[i] != num) {
						Period[i] = 0;
					}
				}
			}
		}
		
		
		for(int i=0;i<n;i++) {
			System.out.println(Period[i] + " " + checkerMax[i]);
		}
		
		
	}

}
