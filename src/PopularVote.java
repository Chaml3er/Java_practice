import java.util.Arrays;
import java.util.Scanner;

public class PopularVote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		int doc[] = new int[K];
		int cap[] = new int[N-K];
		
		for(int i=0,j = 0;i<N;i++) {
			if(i < K) {
				doc[i] = arr[i];
			}
			if(i >= K) {
				cap[j] = arr[i];
				j++;
			}
		}
		
		int a = 0;
		int b = 0;
		for(int i=doc.length-1,j=0;i>=0;i--,j++) {
			a += doc[i]*Math.pow(2,j);	
		}
	
		for(int i=cap.length-1,j=0;i>=0;i--,j++) {
			b += cap[i]*Math.pow(2,j);	
		}
		
		for(int i=0;i<doc.length;i++) {
			System.out.print(doc[i] + " ");
		}
		System.out.println();
		for(int i=0;i<cap.length;i++) {
			System.out.print(cap[i]+ " ");
		}
		
		System.out.println();
		
		if(a == b) {
			System.out.println("0");
		}
		if(a > b) {
			System.out.println("1");
		}
		if(a < b) {
			System.out.println("2");
		}
		
		
	}

}
