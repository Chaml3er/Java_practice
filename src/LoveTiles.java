/*
LANG: JAVA
COMPILER: JAVA
*/
/*
NAME: Kasidich Keattiwut
SID: 6209650479
*/
import java.util.Scanner;
public class LoveTiles {
	
	public static int cal(int n) {
		//“2 x n” board and tiles of size “2 x 1”
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		
		return cal(n - 1) + cal(n - 2);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(cal(n));
	}
	
}
