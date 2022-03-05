import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = "CatBatAntCatCatAntBatBatBat";
		ArrayList<String> arr = new ArrayList<>();
		ArrayList<String> remove = new ArrayList<>();
		String word = "";
		for(int i=0;i<input.length();i++) {
			if(Character.isUpperCase(input.charAt(i))) {
				
				if(i!=0) {
					arr.add(word);
					//remove.add(word);
				}
				word = input.charAt(i)+"";
			}else {
				word += input.charAt(i);
				if(i == input.length()-1) {
					arr.add(word);
				}
			}
		}
		
		String a = arr.get(0);
		System.out.println(arr);
		for(String w : arr) {
			if(!remove.contains(w)) {
				remove.add(w);
			}
		}
		System.out.println(remove);
		int[] count = new int[remove.size()];
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i).equalsIgnoreCase(remove.get(0))) {
				count[0]++;
			}
			if(arr.get(i).equalsIgnoreCase(remove.get(1))) {
				count[1]++;
			}
			if(arr.get(i).equalsIgnoreCase(remove.get(2))) {
				count[2]++;
			}
		}
		
		System.out.println(Arrays.toString(count));
		ArrayList<Integer> list = new ArrayList<>();
		list.add(count[0]);
		list.add(count[1]);
		list.add(count[2]);
		int indexmin = list.indexOf (Collections.min(list)); 
		int indexmax = list.indexOf (Collections.max(list)); 
		int min = 0;
		int max = 0;
		int index = 0;
		for(int i=0;i<count.length;i++) {
			if(max < count[i]) {
				max = count[i];
				index = i;
			}
		}
		
		System.out.println(remove.get(index));
		System.out.println(indexmin);
		System.out.println(indexmax);
		int mid = 0;
		for(int i=0;i<count.length;i++) {
			if(i!=indexmin || i != indexmax) {
				mid = i;
			}
		}
		System.out.println(mid);
	}
		
}


