import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String input = "BatCatCatAntBatCatAntCatAnt";

        ArrayList<String> array = new ArrayList<String>();
        String represent = "";
        for(int i = 0 ; i < input.length() ; i++) {
            if(Character.isUpperCase(input.charAt(i))) {
                if(i != 0)
                    array.add(represent);
                represent = input.charAt(i)+"";
            }
            else
                represent += input.charAt(i)+"";
        }
        

        
        for(String a : array) {
        	System.out.println(a);
        }
        
        String word = array.get(0);
        String[] arr2 = new String[3];
        arr2[0] = array.get(0);
        int index = 0;
        
        
        for(int i=0;i<array.size();i++) {
        	for(int j=0;j<arr2.length;j++) {
        		if(array.get(i) != arr2[j]) {
        			arr2[index] = array.get(i);
        			index++;
        		}
        	}
        		
        }
        
        System.out.println(Arrays.toString(arr2));

	}

}
