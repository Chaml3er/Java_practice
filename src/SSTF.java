import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SSTF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int htrack = sc.nextInt();
		int[] alltrack = new int[size];
		
		
		for(int i=0;i<size;i++) {
			alltrack[i] = sc.nextInt();
		}
		
	
		int sum = 0;
		int index = 0;
		
		
		for(int i=0;i<size;i++) {
			int min = Integer.MAX_VALUE;
			for(int j=i;j<size;j++) {
				int distance = Math.abs(htrack - alltrack[j]);
				if(distance < min) {
					index = j;
					min = distance;
				}
				
			}
			int swap = alltrack[i];
			alltrack[i] = alltrack[index];
			alltrack[index] = swap;
			sum += Math.abs(htrack - alltrack[i]);	
			htrack = alltrack[i];
		}
		
		
		
		System.out.println(sum);
		sc.close();
		
	
	}

}

