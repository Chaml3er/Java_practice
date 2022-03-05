import java.util.Arrays;
import java.util.Scanner;

public class TxID {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String txid = sc.nextLine();
		
		int Weigth[] = new int[txid.length()];
		int Wsum[] = new int[txid.length()];
		
		for(int i=1;i<=txid.length();i++) {
			if(i%2!=0) {
				if(i < 11) {
					Weigth[i-1] = i;
				}
				if(i > 10) {
					int a = i%10;
					int b = i/10;
					Weigth[i-1] = a+b;
				}
				
			}
			if(i%2==0) {
				if(i<11) {
					Weigth[i-1] = 11 - i;
				}
				if(i > 10) {
					Weigth[i-1] = 10 - Weigth[i-2];
				}
			}
		}
		
		for(int i=0;i<txid.length();i++) {
			switch (txid.charAt(i)) {
			case 'A': Wsum[i] = 0;break;
			case 'B': Wsum[i] = 2*Weigth[i];break;
			case 'C': Wsum[i] = 3*Weigth[i];break;
			case 'D': Wsum[i] = 4*Weigth[i];break;
			case 'E': Wsum[i] = 0;break;
			case 'F': Wsum[i] = 6*Weigth[i];break;
			case 'G': Wsum[i] = 7*Weigth[i];break;
			case 'H': Wsum[i] = 8*Weigth[i];break;
			case 'I': Wsum[i] = 0;break;
			case 'J': Wsum[i] = 10*Weigth[i];break;
			case 'K': Wsum[i] = 11*Weigth[i];break;
			case 'L': Wsum[i] = 12*Weigth[i];break;
			case 'M': Wsum[i] = 13*Weigth[i];break;
			case 'N': Wsum[i] = 14*Weigth[i];break;
			case 'O': Wsum[i] = 0;break;
			case 'P': Wsum[i] = 16*Weigth[i];break;
			case 'Q': Wsum[i] = 17*Weigth[i];break;
			case 'R': Wsum[i] = 18*Weigth[i];break;
			case 'S': Wsum[i] = 19*Weigth[i];break;
			case 'T': Wsum[i] = 20*Weigth[i];break;
			case 'U': Wsum[i] = 0*Weigth[i];break;
			case 'V': Wsum[i] = 22*Weigth[i];break;
			case 'W': Wsum[i] = 23*Weigth[i];break;
			case 'X': Wsum[i] = 24*Weigth[i];break;
			case 'Y': Wsum[i] = 25*Weigth[i];break;
			case 'Z': Wsum[i] = 26*Weigth[i];break;
			case 'a': Wsum[i] = 0;break;
			case 'b': Wsum[i] = 12*Weigth[i];break;
			case 'c': Wsum[i] = 13*Weigth[i];break;
			case 'd': Wsum[i] = 14*Weigth[i];break;
			case 'e': Wsum[i] = 0;break;
			case 'f': Wsum[i] = 16*Weigth[i];break;
			case 'g': Wsum[i] = 17*Weigth[i];break;
			case 'h': Wsum[i] = 18*Weigth[i];break;
			case 'i': Wsum[i] = 0;break;
			case 'j': Wsum[i] = 20*Weigth[i];break;
			case 'k': Wsum[i] = 21*Weigth[i];break;
			case 'l': Wsum[i] = 22*Weigth[i];break;
			case 'm': Wsum[i] = 23*Weigth[i];break;
			case 'n': Wsum[i] = 24*Weigth[i];break;
			case 'o': Wsum[i] = 0;break;
			case 'p': Wsum[i] = 26*Weigth[i];break;
			case 'q': Wsum[i] = 27*Weigth[i];break;
			case 'r': Wsum[i] = 28*Weigth[i];break;
			case 's': Wsum[i] = 29*Weigth[i];break;
			case 't': Wsum[i] = 30*Weigth[i];break;
			case 'u': Wsum[i] = 0*Weigth[i];break;
			case 'v': Wsum[i] = 32*Weigth[i];break;
			case 'w': Wsum[i] = 33*Weigth[i];break;
			case 'x': Wsum[i] = 34*Weigth[i];break;
			case 'y': Wsum[i] = 35*Weigth[i];break;
			case 'z': Wsum[i] = 36*Weigth[i];break;
			case '0': Wsum[i] = 0*Weigth[i];break;
			case '1': Wsum[i] = 1*Weigth[i];break;
			case '2': Wsum[i] = 2*Weigth[i];break;
			case '3': Wsum[i] = 3*Weigth[i];break;
			case '4': Wsum[i] = 4*Weigth[i];break;
			case '5': Wsum[i] = 5*Weigth[i];break;
			case '6': Wsum[i] = 6*Weigth[i];break;
			case '7': Wsum[i] = 7*Weigth[i];break;
			case '8': Wsum[i] = 8*Weigth[i];break;
			case '9': Wsum[i] = 9*Weigth[i];break;
				
			}
				
		}
		
		int sum = 0;
		
		for(int i=0;i<Wsum.length;i++) {
			sum+=Wsum[i];
		}
		
		System.out.println(sum);
		int digit = 0;
		
		while(sum % 10 != 0) {
			sum = sum+=1;
			digit++;
		}
		
		System.out.println(digit);
		
	}

}
