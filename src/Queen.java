import java.util.Scanner;

public class Queen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int w = sc.nextInt();
		
		int inform[][] = new int[n][w];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<w;j++) {
				inform[i][j] = sc.nextInt();
			}
		}
		
		int board[][] = new int[n][n];
		
		for(int i=0;i<w;i++) {
			board[inform[i][0]][inform[i][1]] = 1;
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
