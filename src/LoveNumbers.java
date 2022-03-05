/*
LANG: JAVA 
COMPILER: JAVA
*/
/*
NAME: Kasidich Keattiwut
SID: 6209650479
*/
import java.util.ArrayList;
import java.util.Scanner;

public class LoveNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<>();
		int n = sc.nextInt();
		int x = 1;
		int count = 1;
		int result = 0;
		while(n > count) {
			x++;
			int t=x;
			while(t!=0) {
				if(t%2==0) {
					t = t/2;
				}else if(t%3==0) {
					t = t/3;
				}else if(t%5==0) {
					t = t/5;
				}else {
					break;
				}
			}			
			if(t==1) {
				count++;
			}
			result = x;
		}
		if(n == 1) {
			System.out.println(1);
		}else {
			System.out.println(result);
		}		
		
		sc.close();

		
	}

}
