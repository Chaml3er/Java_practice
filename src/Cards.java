/*
LANG: JAVA
COMPILER: JAVA
*/
/*
NAME: Kasidich Keattiwut
SID: 6209650479
*/
import java.util.ArrayList;
import java.util.Scanner;
public class Cards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String rep = "";
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i=0;i<s.length();i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				if(i!=0) {
					arr.add(rep);
				}
				rep = s.charAt(i) + "";
			}else {
				rep += s.charAt(i);
				if(i == s.length()-1)
					arr.add(rep);
			}
		}
		
		int check = 1;
		for(int i=0;i<arr.size();i++) {
			for(int j=i+1;j<arr.size();j++) {
				if(arr.get(i).equals(arr.get(j))){
					check = 0;
				}
			}
		}
		
		if(check == 0){
			System.out.println("-1");
			System.exit(0);
		}
		
		int C = 13;
		int D = 13;
		int H = 13;
		int S = 13;
		
		for(int i=0;i<arr.size();i++) {
			switch (arr.get(i).charAt(0)) {
			case 'C' : C-=1;break;
			case 'D' : D-=1;break; 
			case 'H' : H-=1;break; 
			case 'S' : S-=1;break; 	
			}
		}
		
		System.out.println(C + " " + D + " " + H + " " + S);
		

	}

}

