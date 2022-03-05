import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindingDory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String w1 = sc.nextLine();
		String w2 = sc.nextLine();
		
		sc.close();
		
		w1 = w1.replaceAll("\s", "");
		w2 = w2.replaceAll("\s", "");
		
		
		ArrayList<Character> Print = new ArrayList<>();
			
		for(int i=0;i<w1.length();i++) {
			for(int j=0;j<w2.length();j++) {
				if(w1.charAt(i) == w2.charAt(j)) {
					if(i == j) {
						Print.add(w1.charAt(i));
						
					}
				}
			}

		}
		
		for(int i=0;i<Print.size();i++) {
			System.out.print(Print.get(i) + " ");
		}
		
		
		if(w1.charAt(w1.length() - 1) == w2.charAt(w2.length() - 1)) {
			System.out.println(w1.charAt(w1.length() - 1));
		}else if(w1.charAt(w1.length() - 1) != w2.charAt(w2.length() - 1)) {
			System.out.println("0");
		}
			
		
	}	
}
