import java.util.Arrays;
import java.util.Scanner;

public class Parity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.nextLine();
		
		int choice = sc.nextInt();
		int d = sc.nextInt();
		
		int[][] par = new int[n.length()/d][d];
		int count = 0;
		for(int i=0;i<n.length()/d;i++) {
			for(int j=0;j<d;j++) {
				par[i][j] = n.charAt(count);
				count++;
			}
		}
		
		int Horizontal[] = new int[(n.length()/d) + 1];
		int Vertical[] = new int[d+1];
		
		for(int i=0;i<n.length()/d;i++) {
			for(int j=0;j<d;j++) {
				if(par[i][j] == 48) {
					par[i][j] = 0;
				}
				if(par[i][j] == 49) {
					par[i][j] = 1;
				}
			}
		}
		
		
		
		int index = 0;
		for(int i=0;i<n.length()/d;i++) {
			for(int j=0;j<d;j++) {
				Horizontal[index] += par[i][j];
			}
			index++;
		}
		

	    for (int i = 0; i < par.length; i++){
	        for (int j = 0; j < par[i].length; j++){
	            Vertical[j] += par[i][j]; 	        }
	    }
	    
	    
	    
	    if(choice == 0) {
	    	int sumh = 0;
	    	int sumv = 0;
	    	for(int i=0;i<Horizontal.length-1;i++) {
	    		switch(Horizontal[i] % 2) {
	    			case 0 : Horizontal[i] = 1;
	    					 sumh += Horizontal[i];
	    					 break;
	    			case 1 : Horizontal[i] = 0;
	    					 sumh += Horizontal[i];
	    					 break;
	    		}
			}
	    	switch(sumh % 2) {
				case 0 : Horizontal[Horizontal.length - 1] = 1;break;
				case 1 : Horizontal[Horizontal.length - 1] = 0;break;
	    	}
	    	
	    	
	    	for(int i=0;i<Vertical.length-1;i++) {
	    		switch(Vertical[i] % 2) {
    			case 0 : Vertical[i] = 1;
    					 sumv += Vertical[i];
    					 break;
    			case 1 : Vertical[i] = 0;
    					 sumv += Vertical[i];
    					 break;
	    		}
	    	}
	    	switch(sumv % 2) {
				case 0 : Vertical[Vertical.length - 1] = 1;break;
				case 1 : Vertical[Vertical.length - 1] = 0;break;
	    	}
	    	
	    }
	    
	    if(choice == 1) {
	    	int sumh = 0;
	    	int sumv = 0;
	    	for(int i=0;i<Horizontal.length-1;i++) {
	    		switch(Horizontal[i] % 2) {
	    			case 0 : Horizontal[i] = 0;
	    					 sumh += Horizontal[i];
	    					 break;
	    			case 1 : Horizontal[i] = 1;
	    					 sumh += Horizontal[i];
	    					 break;
	    		}
			}
	    	switch(sumh % 2) {
				case 0 : Horizontal[Horizontal.length - 1] = 0;break;
				case 1 : Horizontal[Horizontal.length - 1] = 1;break;
	    	}
	    	
	    	
	    	for(int i=0;i<Vertical.length-1;i++) {
	    		switch(Vertical[i] % 2) {
    			case 0 : Vertical[i] = 0;
    					 sumv += Vertical[i];
    					 break;
    			case 1 : Vertical[i] = 1;
    					 sumv += Vertical[i];
    					 break;
	    		}
	    	}
	    	switch(sumv % 2) {
				case 0 : Vertical[Vertical.length - 1] = 0;break;
				case 1 : Vertical[Vertical.length - 1] = 1;break;
	    	}
	    	
	    }
		
		for(int i =0;i<Horizontal.length;i++) {
			System.out.print(Horizontal[i]);
		}
		System.out.println();
		for(int i =0;i<Vertical.length;i++) {
			System.out.print(Vertical[i]);
		}

	}

}
