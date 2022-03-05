import java.util.Scanner;

public class Goldcoin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int M = sc.nextInt();
		int D = sc.nextInt();
		
		int Q = sc.nextInt();
		int S = sc.nextInt();
		
		int[] arrS = new int[S];
		
		for(int i=0;i<S;i++) {
			arrS[i] = sc.nextInt();
		}
		
		int[][] questcoin = new int[Q][2];
		
		for(int i=0;i<Q;i++) {
			questcoin[i][0] = sc.nextInt();
			questcoin[i][1] = sc.nextInt();
		}
		
		int[] arrD = new int[D];
		for(int i=0;i<D;i++) {
			arrD[i] = sc.nextInt();
		}
		
		int run = 0;
		for(int i=0;i<D;i++) {
			
			run += arrD[i];
			if(run >= L ) {
				break;
			}
			M -= 1;
			if(M <= 0) {
				break;
			}
			for(int j=0;j<Q;j++) {
				if(run == questcoin[j][0]) {
					M+=questcoin[j][1];
				}
			}
			for(int k=0;k<S;k++) {
				if(run == arrS[k]) {
					M*=2;
				}
			}
			
		}
		
		System.out.println(M);

	}

}
