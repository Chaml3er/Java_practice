import java.util.Scanner;

public class seatting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] info = new int[n][3];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<3;j++) {
				info[i][j] = sc.nextInt();
			}
		}
		
		int m = sc.nextInt();
		int result = 0;
		for(int i=0;i<n;i++) {
			if(info[i][1] - info[i][2] == m) {
				result = info[i][0];
				break;
			}
		}
		
		System.out.println(result);
	}

}
