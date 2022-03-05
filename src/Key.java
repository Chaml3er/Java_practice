import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Key {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int q = sc.nextInt();
		
		int[] arr = new int[(q-p)+1];
		

		ArrayList<Integer> narr = new ArrayList<Integer>();
	
		for(int i=p;i<=q;i++) {
			for(int j=2;j<=i;j++) {
				if(j==i) {
					narr.add(i);
				}
				if(i % j == 0) {
					break;
				}
			}
		}
   
		System.out.println(narr.get(1) * narr.get(narr.size()-1));
		System.out.println(narr.size());
		
		
		
	}

}
