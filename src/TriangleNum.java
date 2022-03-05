import java.util.Scanner;

public class TriangleNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int c = sc.nextInt();
		
		if(c == 1) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
		
		int sum = 0;
		if(c == 2) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}
				System.out.println();
			}
			
			for(int i=2;i<n;i++) {
				for(int j=2;j<=i-1;j++) {
					sum += j;
				}
			}
			System.out.println(sum);
		}
		
		int sumn = 0;
		
		if(c == 3) {
			for(int i=2;i<n;i++) {
				for(int j=2;j<=i-1;j++) {
					sumn += j;
				}
			}
			System.out.println(sumn);
		}
		
		
	}

}
