import java.util.Scanner;

public class SymmetricLove {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] love = new int[N][N];
		
		for(int i = 0;i < N;i++) {
			for(int j = 0;j < N;j++) {
				love[i][j] = sc.nextInt();
			}
		}
		
		int sum[][] = new int[N][N];
		int count = 0;
		int sym = 0;
		
		for(int i = 0;i < N;i++) {
			for(int j = i+1;j < N;j++) {
				if(love[i][j] == love[j][i]) {
					System.out.println(love[i][j] + " = " + love[j][i]);
					count++;
					if(love[i][j] != 0) {
						sym++;
					}
				}
				
			}
		}
		
		if(count == N) {
			System.out.println("1");
		}
		
		if(count != N) {
			System.out.println("0");
		}
		
		
		System.out.println(sym);
		
		
		
		
		
	

	}

}
