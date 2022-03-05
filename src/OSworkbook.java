import java.util.Scanner;

public class OSworkbook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //Unit
		int k = sc.nextInt(); //Jode
		
		int l[] = new int[n]; 
		
		for(int i=0;i<n;i++) {
			l[i] = sc.nextInt();
		}
		int count = 1;
		int page = 1;
		int check = 0;
		int unit = 1;
		for(int i=0;i<n;i++) { //Ç¹Array
			while(count <= l[i]){
				if(count == page) {
					check++;
				}
				if(count % k == 0 ) {
					page++;
				}
				if(count % k != 0) {
					if(count == l[i]) {
						page++;
					}
				}
				count++;
			}
			count = 1;
		}
		
		
	System.out.println(check);	//àÅ¢àËÁ×Í¹Ë¹éÒ
		
		
	

	}

}
