import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CircularArrayRotation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int s = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int[] m = new int[n-1];
		for(int i=0;i<m.length;i++) {
			m[i] = sc.nextInt();
		}
		int[] newarr = new int[n];
		for(int i=0;i<k;i++) {
			int temp = arr[n-1];
			for(int j=0;j<n-1;j++) {
				newarr[j+1] = arr[j];	
				//System.out.println(Arrays.toString(newarr));
			}
			newarr[0] = temp;
			System.arraycopy(newarr, 0, arr, 0, arr.length);
			if(s == 0) {
				System.out.println(arr[m[i]]);
			}
			if(s > 0) {
				int index=0;
				int ns = 0;
				int S = s;
				ArrayList<Integer> sarr = new ArrayList();
				for(index = 0;index<n;index++) {
					if(S >= n) {
						sarr.add(arr[ns]);
						ns++;
					}else {
						sarr.add(arr[S]);
						S++;
					}
				}
				System.out.println(sarr.get(m[i]));
			}

		}
		
		//System.out.println(Arrays.toString(newarr));
	}

}
