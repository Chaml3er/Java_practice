/*
LANG: JAVA
COMPILER: JAVA
*/
/*
NAME: Kasidich Keattiwut
SID: 6209650479
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ToBeTheLeader {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList();
		
		for(int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}
		arr.add(0);
		int s = sc.nextInt();
		int[] score = new int[s];
		
		for(int i=0;i<s;i++) {
			score[i] = sc.nextInt();
		}
		sc.close();
		ArrayList<Integer> newarr = new ArrayList();
		for (int a : arr) {
            if (!newarr.contains(a)) {
            	newarr.add(a);
            }
        }
		
		int newsize = newarr.size();
		for(int j=0;j<s;j++) {
			for(int i=0;i<newsize;i++) {
				if(newarr.get(i) == score[j]) {
					System.out.println(i+1);
					break;
				}
				if(newarr.get(i) < score[j]) {
					newarr.add(i,score[j]);
					System.out.println(i+1);
					newarr.remove(i);
					break;
				}
			}
		}
		
			
			
	}

}
