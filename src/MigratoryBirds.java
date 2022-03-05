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

public class MigratoryBirds {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(arr);
		
		arr2.add(arr[0]);
		
		for(int i=0;i<n-1;i++) {
			if(arr[i] != arr[i+1]) {
				arr2.add(arr[i+1]);
			}
		}
		
		int[] count = new int[arr2.size()];
		
		
		for(int i=0;i<arr2.size();i++) {
			for(int j=0;j<n;j++) {
				if(arr2.get(i) == arr[j]) {
					count[i]++;
				}else if(arr2.get(i) + 1 == arr[j]) {
					count[i]++;
				}else if(arr2.get(i) + 2 == arr[j]) {
					break;
				}
			}
		}
		
		int max = arr2.get(0);
		for(int i=0;i<count.length;i++) {
			if(max < count[i]) {
				max = count[i];
				
			}
		}
		
		System.out.println(max);
		
	}

}
