import java.util.ArrayList;
import java.util.Scanner;

public class Snowmonster {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int HP = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		ArrayList<Integer> arri = new ArrayList<>();
		ArrayList<Integer> arrj = new ArrayList<>();
		
		int pair = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(arr[i] + arr[j] == HP) {
					if((i + j) % 2 != 0) {
						//System.out.println(i + " " + j);
						arri.add(i);
						arrj.add(j);
						pair++;
						for(int k=0;k<arri.size();k++) {
							if(arri.get(k) == j && arrj.get(k) == i ) {
								pair--;
							}
						}
					}
				}
			}
		}
		
		System.out.println(pair);
		int max = 0;
		for(int i=0;i<arrj.size();i++) {
			if(max < arrj.get(i)) {
				max = arrj.get(i)+1;
			}
		}
		
		System.out.println(max);
	}

}
