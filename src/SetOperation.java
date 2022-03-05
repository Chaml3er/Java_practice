import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class SetOperation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = 0,B = 0;
		
		ArrayList<Integer> Aset = new ArrayList<>();
		ArrayList<Integer> Bset = new ArrayList<>();
		ArrayList<Integer> Cset = new ArrayList<>();
		
		while(true) {
			A = sc.nextInt();
			if(A != -1) {
				Aset.add(A);
			}
			if(A == -1) {
				break;
			}
		}
		
		while(true) {
			B = sc.nextInt();
			if(B != -1) {
				Bset.add(B);
			}
			if(B == -1) {
				break;
			}
		}
		
		 if(Aset.isEmpty() && Bset.isEmpty()) {
			 Aset.add(0);
			 Bset.add(0);
		 }
		
		int opera = sc.nextInt();
		
		if(opera == 101) {
			Aset.addAll(Bset);
			 int dup = Aset.get(0);
			 
			 for(int i=1;i<Aset.size();i++) {
				 if(Aset.get(i) == dup) {
					 Aset.remove(i);
				 }
			 }
			 
			 Collections.sort(Aset);
			
			
			
			for(int i=0;i<Aset.size();i++) {
				System.out.println(Aset.get(i));
			}
		}
		
		if(opera == 102) {
			for(int i=0;i<Aset.size();i++) {
				for(int j=0;j<Bset.size();j++) {
					if(Aset.get(i) == Bset.get(j)) {
						Cset.add(Bset.get(j));
					}
				}
			}
			Collections.sort(Cset);
			
			if(Cset.isEmpty()) {
				Cset.add(0);
			}
			
			int dup = Cset.get(0);
			 
			 for(int i=1;i<Cset.size();i++) {
				 if(Cset.get(i) == dup) {
					 Cset.remove(i);
				 }
			 }
			
			for(int i=0;i<Cset.size();i++) {
				System.out.println(Cset.get(i));
			}
			
		}
		
		if(opera == 103) {
			for(int i=0;i<Aset.size();i++) {
				for(int j=0;j<Bset.size();j++) {
					if(Aset.get(i) != Bset.get(j)) {
						Cset.add(Aset.get(i));
					}
				}
			}
			
			Collections.sort(Cset);
			
			if(Cset.isEmpty()) {
				Cset.add(0);
			}
			
			int dup = Cset.get(0);
			 
			 for(int i=1;i<Cset.size();i++) {
				 if(Cset.get(i) == dup) {
					 Cset.remove(i);
				 }
			 }
			
			for(int i=0;i<Cset.size();i++) {
				System.out.println(Cset.get(i));
			}
		}
		
		
		sc.close();

	}

}
