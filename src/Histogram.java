import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[20];
		
		for(int i=0;i<20;i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] num = new int[10];
		
		for(int i=0;i<20;i++) {
			switch (arr[i]) {
			case 0 : num[0]++;break;
			case 1 : num[1]++;break;
			case 2 : num[2]++;break;
			case 3 : num[3]++;break;
			case 4 : num[4]++;break;
			case 5 : num[5]++;break;
			case 6 : num[6]++;break;
			case 7 : num[7]++;break;
			case 8 : num[8]++;break;
			case 9 : num[9]++;break;	
			}		
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(num[i]);
		}
	}

}
