import java.util.Scanner;

public class Chat {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[n][3];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int[] xyr = new int[3];
		
		for(int i=0;i<3;i++) {
			xyr[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i=0;i<n;i++) {
			int sum1 = xyr[0]-arr[i][1];
			sum1 = (int) Math.pow(sum1, 2);
			int sum2 = xyr[1]-arr[i][2];
			sum2 = (int) Math.pow(sum2, 2);
			int distance = (int) Math.sqrt(sum1 + sum2); 
			if(distance < xyr[2]) {
				System.out.println(arr[i][0] + " " + "1");
			}else {
				System.out.println(arr[i][0] + " " + "0");
			}
			
			
		}
		
		
	}

}
