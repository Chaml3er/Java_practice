import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Multipy {

	public static void main(String[] args) {
			
		/* if (row2 != col1) {
			 
	            System.out.println("\nMultiplication Not Possible");
	      }*/
		 
		 /*int row1 = 4, col1 = 3, row2 = 3, col2 = 4;
		 
		 int A[][] = { { 1, 1, 1 },
                 	   { 2, 2, 2 },
                 	   { 3, 3, 3 },
                 	   { 4, 4, 4 } };

		 int B[][] = { { 1, 1, 1, 1 },
                 	   { 2, 2, 2, 2 },
                 	   { 3, 3, 3, 3 } };
		 
		 int C[][] = new int[row1][col2];
		 
        
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }*/
        
        String a = "100110";
        String b = "25";
        
        System.out.println(Integer.parseInt("1010",2));
        
        int index = 0;
        int num = 45;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        while(num  > 0){
            arr.add(num%2);
            num = num/2;
            index++;
         }
        Collections.reverse(arr);
        for(int i=0;i<arr.size();i++) {
        	System.out.println(arr.get(i));
        }
        
        //Collections.reverse(arr);
        int n = 0;
        int sum = 0;
        for(int i=0;i<arr.size();i++) {
        	sum += arr.get(i)*Math.pow(2, n);
        	System.out.println(arr.get(i) + " " + n);
        	n++;
        }
        
        String test = "";
        for(int i=0;i<arr.size();i++) {
        	test += arr.get(i);
        }
        //System.out.println(Integer.parseInt(test,2));
        System.out.println(sum);
       

	}
}

