/*
LANG: JAVA
COMPILER: JAVA
*/
/*
NAME: Kasidich Keattiwut
SID: 6209650479
*/
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class PokemonLeague {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		ArrayList<String> arr = new ArrayList<>();
		int score[] = new int[k];
		
		for(int i=0;i<k;i++) {
			arr.add(sc.next());
		}
		
		while(k != 1) {
			for(int i=0,j=1;i<k/2;i+=2,j+=2) {
				for(int index =0;index<3;index++) {
				if(arr.get(i).charAt(index) == 'W' && arr.get(j).charAt(index) == 'W') {
					score[i] ++;
					score[j] ++;
				}
				if(arr.get(i).charAt(index) == 'W' && arr.get(j).charAt(index) == 'F') {
					score[i] ++;
				}
				if(arr.get(i).charAt(index) == 'W' && arr.get(j).charAt(index) == 'E') {
					score[i] ++;
				}
				if(arr.get(i).charAt(index) == 'W' && arr.get(j).charAt(index) == 'T') {
					score[j] ++;
				}
				if(arr.get(i).charAt(index) == 'F' && arr.get(j).charAt(index) == 'W') {
					score[j] ++;
				}
				if(arr.get(i).charAt(index) == 'E' && arr.get(j).charAt(index) == 'W') {
					score[j] ++;
				}
				if(arr.get(i).charAt(index) == 'T' && arr.get(j).charAt(index) == 'W') {
					score[i] ++;
				}
				
				if(arr.get(i).charAt(index) == 'F' && arr.get(j).charAt(index) == 'F') {
					score[i] ++;
					score[j] ++;
				}
				if(arr.get(i).charAt(index) == 'F' && arr.get(j).charAt(index) == 'W') {
					score[i] ++;
				}
				if(arr.get(i).charAt(index) == 'F' && arr.get(j).charAt(index) == 'E') {
					score[i] ++;
				}
				if(arr.get(i).charAt(index) == 'F' && arr.get(j).charAt(index) == 'T') {
					score[j] ++;
				}
				if(arr.get(i).charAt(index) == 'W' && arr.get(j).charAt(index) == 'F') {
					score[j] ++;
				}
				if(arr.get(i).charAt(index) == 'E' && arr.get(j).charAt(index) == 'F') {
					score[j] ++;
				}
				if(arr.get(i).charAt(index) == 'T' && arr.get(j).charAt(index) == 'F') {
					score[i] ++;
				}
				
				if(arr.get(i).charAt(index) == 'E' && arr.get(j).charAt(index) == 'E') {
					score[i] ++;
					score[j] ++;
				}
				if(arr.get(i).charAt(index) == 'E' && arr.get(j).charAt(index) == 'W') {
					score[i] ++;
				}
				if(arr.get(i).charAt(index) == 'E' && arr.get(j).charAt(index) == 'F') {
					score[i] ++;
				}
				if(arr.get(i).charAt(index) == 'E' && arr.get(j).charAt(index) == 'T') {
					score[j] ++;
				}
				if(arr.get(i).charAt(index) == 'W' && arr.get(j).charAt(index) == 'E') {
					score[j] ++;
				}
				if(arr.get(i).charAt(index) == 'F' && arr.get(j).charAt(index) == 'E') {
					score[j] ++;
				}
				if(arr.get(i).charAt(index) == 'T' && arr.get(j).charAt(index) == 'E') {
					score[i] ++;
				}
				
				if(arr.get(i).charAt(index) == 'T' && arr.get(j).charAt(index) == 'T') {
					score[i] ++;
					score[j] ++;
				}
				if(arr.get(i).charAt(index) == 'T' && arr.get(j).charAt(index) == 'W') {
					score[i] ++;
				}
				if(arr.get(i).charAt(index) == 'T' && arr.get(j).charAt(index) == 'E') {
					score[i] ++;
				}
				if(arr.get(i).charAt(index) == 'T' && arr.get(j).charAt(index) == 'F') {
					score[j] ++;
				}
				if(arr.get(i).charAt(index) == 'W' && arr.get(j).charAt(index) == 'T') {
					score[j] ++;
				}
				if(arr.get(i).charAt(index) == 'E' && arr.get(j).charAt(index) == 'T') {
					score[j] ++;
				}
				if(arr.get(i).charAt(index) == 'F' && arr.get(j).charAt(index) == 'T') {
					score[i] ++;
				}
				
				if(score[i] > score[j]) {
					arr.remove(j);
				}
				if(score[i] < score[j]) {
					arr.remove(i);
				}
				
				
				
			}
		}
			k = k/2;
	}
		
		int max = 0;
		int in = 0;
		for(int i=0;i<score.length;i++) {
			if(max < score[i]) {
				max = score[i];
				in = i;
			}
		}
	
		System.out.println(arr.get(in));
}}
