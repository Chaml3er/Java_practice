import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Magicsquare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int row[] = new int[n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				row[i] += arr[i][j];
			}
		}
		
		int col[] = new int[n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				col[i] += arr[j][i];
			}
		}
		
		int left = 0;
		int right = 0;
		
		for(int i=0,j=0;i<n;i++,j++) {
			left += arr[i][j];
		}

		for(int i=0,j=n-1;i<n;i++,j--) {
			right += arr[i][j];		
		}
		
		ArrayList<Integer> maxarr = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			maxarr.add(row[i]);
			maxarr.add(col[i]);
		}
		
		maxarr.add(left);
		maxarr.add(right);
		
		Collections.sort(maxarr);
		
		int square = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(row[i] == col[j] && row[i] == left && row[i] == right) {
					square = 9;
				}else {
					square = 0;
				}
			}
		}
		
		System.out.println(square);
		System.out.println(maxarr.get(maxarr.size()-1));
		
		
		
		
	}

}
