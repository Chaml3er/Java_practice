import java.util.Scanner;

public class Specialsquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		int row = 0;
		int col = 0;
		int dig = 0;
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		
		
		for(int i=0;i<n;i++) {
			row += arr[0][i];
			col += arr[i][n-1];
			dig += arr[i][i];
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				sum += arr[i][j];
			}
		}
		
		//System.out.println(row + " " + col + " " + dig);
		
		if(row == col && row == dig && col == dig) {
			System.out.println(dig);
		}else {
			System.out.println(sum);
		}

	}

}
/*
4
1 1 1 1
1 1 1 1
1 1 1 1
2 3 0 2
4
5
*/