import java.util.Scanner;

public class TheArkofCS300 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] board = new int[20][20];
		
		int I = sc.nextInt();
		int J = sc.nextInt();
		
		int trap = sc.nextInt();
		
		board[I][J] = 3;
		
		for(int i=0;i<trap;i++) {
			int trapi = sc.nextInt();
			int trapj = sc.nextInt();
			board[trapi][trapj] = -2;
		}
		
		int walklen = sc.nextInt();
		int[] walkindex = new int[walklen];
		
		for(int i=0;i<walklen;i++) {
			walkindex[i] = sc.nextInt();
		}
		int result = 0;
		int indexI = 0;
		int indexJ = 0;
		for(int i=0,walkI = 0,walkJ = 0;i<walklen;i++) {
			if(walkindex[i] == 1) {
				if(walkI-1 < 0) {
					board[walkI][walkJ] += 1;
				}else {
					walkI -= 1;
					board[walkI][walkJ] += 1;	
				}
			}
			if(walkindex[i] == 2) { 
				if(walkJ+1 > 19) {
					board[walkI][walkJ] += 1;
				}else {
					walkJ += 1;
					board[walkI][walkJ] += 1;
				}
			}
			if(walkindex[i] == 3) {
				if(walkI+1 > 19) {
					board[walkI][walkJ] += 1;
				}else {
					walkI += 1;
					board[walkI][walkJ] += 1;			
				}
			}
			if(walkindex[i] == 4) {
				if(walkJ-1 < 0) {
					board[walkI][walkJ] += 1;
				}else {
					walkJ -= 1;
					board[walkI][walkJ] += 1;
				}
			}
			if(board[walkI][walkJ] == -2 || board[walkI][walkJ] == -1) {
				result = 0;
				indexI = walkI;
				indexJ = walkJ;
				break;
			}
			indexI = walkI;
			indexJ = walkJ;
		}
		
		if(indexI == I && indexJ == J) {
			result = 1;
		}
		if(indexI + 1 == I && indexJ == J || indexI - 1 == I && indexJ == J) {
			result = 1;
		}
		if(indexI == I && indexJ + 1 == J || indexI == I && indexJ + 1 == J) {
			result = 1;
		}
		
		/*for(int i=0;i<20;i++) {
			for(int j=0;j<20;j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}*/
		System.out.println(indexI + " " + indexJ);
		System.out.println(result);
	}

}
