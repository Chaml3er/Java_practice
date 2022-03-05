import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Number1_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		sc.close();
		int sum = 0;
		int count = 0;
		while(sum != 4) {
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i=0;i<num.length();i++) {
				char s = num.charAt(i);
				int n = Character.getNumericValue(s);
				arr.add(n);	
			}
			sum = 0;
			for(int j=0;j<arr.size();j++) {
				sum += arr.get(j) * arr.get(j);
			}
			num = String.valueOf(sum);
			count++;
			if(sum == 1) {
				break;
			}
		}
		
		System.out.println(sum);
		System.out.println(count);
		
		
		
		
		

	}

}
