import java.util.Scanner;

public class Knightwalk {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int w = sc.nextInt();
		int I = sc.nextInt();
		int J = sc.nextInt();
		
		int path[] = new int[w];
		
		for(int i=0;i<w;i++) {
			path[i] = sc.nextInt();
		}
		
		int walk = 0;
		
		while(walk < path.length) {
			if(path[walk] == 1) {
				if(I - 1 >= 0 && I-1 < n) {
					if(J + 1 >= 0 && J + 1 < n) {
						I = I-2;
						J = J+1;	
					}
				}
				System.out.println(I + " " + J);
			}
			if(path[walk] == 2) {
				if(I - 1 >= 0 && I-1 < n) {
					if(J + 1 >= 0 && J + 1 < n) {
						I = I-1;
						J = J+2;
					}
				}
				System.out.println(I + " " + J);
			}
			if(path[walk] == 3) {
				if(I + 1 >= 0 && I+1 < n) {
					if(J + 2 >= 0 && J + 2 < n) {
						I = I+1;
						J = J+2;	
					}
				}
				System.out.println(I + " " + J);
			}
			if(path[walk] == 4) {
				if(I + 2 >= 0 && I+2 < n) {
					if(J + 1 >= 0 && J + 1 < n) {
						I = I+2;
						J = J+1;
					
					}
				}
				System.out.println(I + " " + J);
			}
			if(path[walk] == 5) {
				if(I + 2 >= 0 && I+2 < n) {
					if(J - 1 >= 0 && J - 1 < n) {
						I = I+2;
						J = J-1;
					
					}
				}
				System.out.println(I + " " + J);
			}
			if(path[walk] == 6) {
				if(I + 1 >= 0 && I+1 < n) {
					if(J - 2 >= 0 && J - 2 < n) {
						I = I+1;
						J = J-2;
						
					}
				}
				System.out.println(I + " " + J);
			}
			if(path[walk] == 7) {
				if(I - 1 >= 0 && I-1 < n) {
					if(J - 2 >= 0 && J - 2 < n) {
						I = I-1;
						J = J-2;
						
					}
				}
				System.out.println(I + " " + J);
			}
			if(path[walk] == 8) {
				if(I - 2 >= 0 && I-2 < n) {
					if(J - 1 >= 0 && J - 1 < n) {
						I = I-1;
						J = J-2;
					
					}
				}
				System.out.println(I + " " + J);
			}
			walk++;
		}
			
		
		
		

	}

}
