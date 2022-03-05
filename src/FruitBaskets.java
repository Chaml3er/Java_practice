/*
LANG: JAVA 
COMPILER: JAVA
*/
/*
NAME: Kasidich Keattiwut
SID: 6209650479
*/
import java.util.Scanner;

public class FruitBaskets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String info1 = sc.nextLine();
		String info2 = sc.nextLine();
		String teacher = sc.nextLine();
		
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		
		for(int i =0;i<info1.length();i++) {
			switch (info1.charAt(i)) {
				case 'A': arr1[0]++;break;
				case 'B': arr1[1]++;break;
				case 'O': arr1[2]++;break;
				case 'K': arr1[3]++;break;
				case 'M': arr1[4]++;break;	
			}
		}
		
		for(int i =0;i<info2.length();i++) {
			switch (info2.charAt(i)) {
				case 'A': arr2[0]++;break;
				case 'B': arr2[1]++;break;
				case 'O': arr2[2]++;break;
				case 'K': arr2[3]++;break;
				case 'M': arr2[4]++;break;	
			}
		}
		int sum = 0;
		switch (teacher) {
			case "Apple": sum = arr1[0]-arr2[0];break;
			case "Banana": sum = arr1[1]-arr2[1];break;
			case "Orange": sum = arr1[2]-arr2[2];break;
			case "Kiwi": sum = arr1[3]-arr2[3];break;
			case "Mango": sum = arr1[4]-arr2[4];break;	
		}
		
		sum = Math.abs(sum);
		System.out.println(sum);
		
	}

}
