import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class spilt_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.nextLine();
		String rep = "";
		
		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<String> arr1 = new ArrayList<String>();
		
		for(int i=0;i<n.length();i++) {
			if(Character.isUpperCase(n.charAt(i))) {
				if(i!=0) {
					arr.add(rep);
				}
				rep = n.charAt(i) + "";
			}else {
				rep += n.charAt(i);
				if(i == n.length()-1)
					arr.add(rep);
			}
		}
		
		arr1.add(arr.get(0));
	
		for(String a : arr) {
			if(!arr1.contains(a)) {
				arr1.add(a);
			}
		}
		
		int[] count = new int[arr1.size()];
		
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i).equals(arr1.get(0))) {
				count[0]++;
			}else if(arr.get(i).equals(arr1.get(1))) {
				count[1]++;
			}else if(arr.get(i).equals(arr1.get(2))) {
				count[2]++;
			}
		}
		
		int max = count[0];
		int index = 0;
		for(int i=0;i<count.length;i++) {
			if(max < count[i]) {
				index = i;
				max = count[i];
			}
		}
		
		System.out.println(arr1.get(index));
		
		/*for(int i=0;i<arr1.size();i++) {
			System.out.println(arr1.get(i));
		}*/
		
	}

}
