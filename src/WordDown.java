/*
LANG: JAVA
COMPILER: JAVA
*/
/*
NAME: Kasidich Keattiwut
SID: 6209650479
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WordDown {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int col = sc.nextInt();
		int row = sc.nextInt();
		
		char[][] arr = new char[col][row];
		
		
		for(int i=0;i<col;i++) {
			String s = sc.next();
			for(int j=0;j<row;j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		
		int cols = sc.nextInt() - 1;
		int rows = sc.nextInt() - 1;
		int len = sc.nextInt();
		
		sc.close();
		
		
		//cols = 1 
		//len = 4 len - 1 = 3
		
		if(cols + len-1 < col) {
			if(cols+1 == len) {
				len+=1;	
			}
				
			for(int i=cols;i<len;i++) {
				System.out.println(arr[i][rows]);
				System.out.println(i + " " + rows + " " + len);
			}
		}else {
			System.out.println("NULL");
		}
		
		
		
		

	}

}

/*
 
  
 
*/
 