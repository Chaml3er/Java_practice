import java.util.Scanner;

public class rochambo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int Mwin = 0;
		int Wwin = 0;
		int draw = 0;
		
		int[][] arr = new int[n][2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j] = sc.nextInt(); 
			}
		}
		
		for(int i=0;i<n;i++) {
				if(arr[i][0] == 0 && arr[i][1] == 1) {
					Wwin++;
				}
				if(arr[i][0] == 1 && arr[i][1] == 2) {
					Wwin++;
				}
				if(arr[i][0] == 2 && arr[i][1] == 0) {
					Wwin++;
				}
				if(arr[i][0] == 1 && arr[i][1] == 0) {
					Mwin++;
				}
				if(arr[i][0] == 2 && arr[i][1] == 1) {
					Mwin++;
				}
				if(arr[i][0] == 0 && arr[i][1] == 2) {
					Mwin++;
				}
				if(arr[i][0] ==  arr[i][1] ) {
					draw++;
				}
		}
		
		if(Mwin > Wwin) {
			System.out.println("1");
			System.out.println(5*(Mwin-Wwin));
		}
		if(Wwin > Mwin) {
			System.out.println("2");
			System.out.println(5*(Wwin-Mwin));
		}
		if(Wwin == Mwin) {
			System.out.println("0");
			System.out.println("0");
		}
		
		
	}
}
