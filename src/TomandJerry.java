import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TomandJerry {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int T = sc.nextInt();
		
		
		
		String trap = sc.next();
		
		int[] board = new int[T+1];
		board[T] = 4; //Tom
		board[c] = 2; //cheese
		board[0] = 3; //jerry	
		
		for(int i=0;i<trap.length();i++) {
			if(trap.charAt(i) == '1') {
				board[i+1]  = 1;
			}
		}
		
		ArrayList<Integer> jcount = new ArrayList<>();
		int Tcount = 0;
		for(int i=0;i<c;i++) {
			if(board[i+1] == 0) {
				board[i+1] += 3;
				if(board[i+1] != 5)
				jcount.add(i+1);
				if(board[c] == 5) {
					break;
				}
			}
			if(board[i+1] == 1) {
				i++;
				board[i+1] += 3;
				jcount.add(i+1);
				if(board[c] == 5) {
					break;
				}
			}
		}
		
		for(int j=T;j>c;j--) {
			board[j-1] += 4;
			Tcount++;
		}
		
		for(int i=0;i<jcount.size();i++) {
			System.out.print(jcount.get(i)+" ");
		}
		
		System.out.println();
		
		if(jcount.size() > Tcount) {
			System.out.println("0");
		}
		if(jcount.size() == Tcount) {
			System.out.println("-1");
		}
		if(jcount.size() < Tcount) {
			System.out.println("1");
		}
		
		
	}

}
