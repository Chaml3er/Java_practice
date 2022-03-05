
import java.util.Scanner;

public class Cstusports {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int array[][] = new int[m][n];
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				array[i][j] = scan.nextInt();
			}
		}
		scan.close();
		
		int min = 10000;
		for(int i = 0 ; i < m ; i++) {
			for(int j = i+1 ; j < m ; j++) {
				int sum = 0;
				for(int k = 0 ; k < n ; k++) {
					sum += Math.pow(Math.abs(array[i][k] - array[j][k]), 2);
				}
				if(min > sum) {
					min = sum;
				}
			}
		}
		System.out.println(min);

	}

}
