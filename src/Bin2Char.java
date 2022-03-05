import java.util.Scanner;

public class Bin2Char {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String bin = sc.nextLine();
		
		int onecount = 0;
		int zerocount = 0;
		
		bin = bin + "2";
		//System.out.println(bin);
		// number % 2 loop || base 10 -> base 2
		// number * 2^n  n เริ่มจากนับที่ 0
	
		for(int i=0;i<bin.length()-1;i++) {
			if(bin.charAt(i) == '1') {
				onecount++;
				if(bin.charAt(i+1) == '0' || bin.charAt(i+1) == '2') {
					switch (onecount) {
					case 1 :  System.out.print('A');break;
					case 2 :  System.out.print('B');break;	
					case 3 :  System.out.print('C');break;	
					case 4 :  System.out.print('D');break;
					case 5 :  System.out.print('E');break;
					case 6 :  System.out.print('F');break;	
					case 7 :  System.out.print('G');break;	
					case 8 :  System.out.print('H');break;
					case 9 :  System.out.print('I');break;
					case 10 :  System.out.print('J');break;	
					case 11 :  System.out.print('K');break;	
					case 12 :  System.out.print('L');break;
					case 13 :  System.out.print('M');break;
					case 14 :  System.out.print('N');break;	
					case 15 :  System.out.print('O');break;	
					case 16 :  System.out.print('P');break;
					case 17 :  System.out.print('Q');break;
					case 18 :  System.out.print('R');break;	
					case 19 :  System.out.print('S');break;	
					case 20 :  System.out.print('T');break;
					case 21 :  System.out.print('U');break;
					case 22 :  System.out.print('V');break;	
					case 23 :  System.out.print('W');break;	
					case 24 :  System.out.print('X');break;
					case 25 :  System.out.print('Y');break;	
					case 26 :  System.out.print('Z');break;
					
					}
					onecount = 0;
				}
			}
			
			if(bin.charAt(i) == '0') {
				zerocount++;
				if(bin.charAt(i+1) == '1' || bin.charAt(i+1) == '2') {
					switch (zerocount) {
					case 1 :  System.out.print('A');break;
					case 2 :  System.out.print('B');break;	
					case 3 :  System.out.print('C');break;	
					case 4 :  System.out.print('D');break;
					case 5 :  System.out.print('E');break;
					case 6 :  System.out.print('F');break;	
					case 7 :  System.out.print('G');break;	
					case 8 :  System.out.print('H');break;
					case 9 :  System.out.print('I');break;
					case 10 :  System.out.print('J');break;	
					case 11 :  System.out.print('K');break;	
					case 12 :  System.out.print('L');break;
					case 13 :  System.out.print('M');break;
					case 14 :  System.out.print('N');break;	
					case 15 :  System.out.print('O');break;	
					case 16 :  System.out.print('P');break;
					case 17 :  System.out.print('Q');break;
					case 18 :  System.out.print('R');break;	
					case 19 :  System.out.print('S');break;	
					case 20 :  System.out.print('T');break;
					case 21 :  System.out.print('U');break;
					case 22 :  System.out.print('V');break;	
					case 23 :  System.out.print('W');break;	
					case 24 :  System.out.print('X');break;
					case 25 :  System.out.print('Y');break;	
					case 26 :  System.out.print('Z');break;
					}

					zerocount = 0;
				}
					
			}
			
		}

	}

	}
