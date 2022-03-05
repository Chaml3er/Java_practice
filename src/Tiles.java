import java.util.Scanner;

public class Tiles {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		//n x m using 1 x m tiles 
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int count[] = new int[n + 1]; 
	    count[0] = 0; 
		
	    sc.close();
		       
	    int i; 
		
	    for (i = 1; i <= n; i++) { 
	    	if(i > m){
		       count[i] = count[i - 1] + count[i - m]; 
		    }else if (i < m) {
		    	count[i] = 1; 
		    }else {
		    	count[i] = 2; 
		    }
		              
	    }
	    
		System.out.println(count[n]);
		            

	}

}
