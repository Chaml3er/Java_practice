import java.util.Scanner;

public class PowerOfBattleShip {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tableSize = scan.nextInt();
		int numOfObstruction = scan.nextInt();
		int numOfEnemy = scan.nextInt();
		
		int table[][] = new int[tableSize][tableSize];
		int shipXStart = scan.nextInt() - 1;
		int shipYStart = scan.nextInt() - 1;
		table[shipXStart][shipYStart] = 1;
		
		for(int i = 0 ; i < numOfObstruction ; i++) {
			table[scan.nextInt() - 1][scan.nextInt() - 1] = -1;
		}
		
		for(int i = 0 ; i < numOfEnemy ; i++) {
			table[scan.nextInt() - 1][scan.nextInt() - 1] = -2;
		}
		
		scan.close();
		
		int powerCount = 0;
		int fireAtEnemy = 0;
		for(int i = shipXStart, j = shipYStart ; i < tableSize ; i++) {
			if(table[i][j] == 0) {
				powerCount++;
			}else if(table[i][j] == -1) {
				break;
			}
			else if(table[i][j] == -2) {
				powerCount++;
				fireAtEnemy++;
			}
		}
		
		for(int i = shipXStart, j = shipYStart ; i >= 0 ; i--) {
			if(table[i][j] == 0) {
				powerCount++;
			}else if(table[i][j] == -1) {
				break;
			}
			else if(table[i][j] == -2) {
				powerCount++;
				fireAtEnemy++;
			}
		}
		
		for(int i = shipXStart, j = shipYStart ; j < tableSize ; j++) {
			if(table[i][j] == 0) {
				powerCount++;
			}else if(table[i][j] == -1) {
				break;
			}
			else if(table[i][j] == -2) {
				powerCount++;
				fireAtEnemy++;
			}
		}
		
		for(int i = shipXStart, j = shipYStart ; j >= 0 ; j--) {
			if(table[i][j] == 0) {
				powerCount++;
			}else if(table[i][j] == -1) {
				break;
			}
			else if(table[i][j] == -2) {
				powerCount++;
				fireAtEnemy++;
			}
		}
		
		for(int i = shipXStart, j = shipYStart ; i < tableSize && j < tableSize ; i++, j++) {
			if(table[i][j] == 0) {
				powerCount++;
			}else if(table[i][j] == -1) {
				break;
			}
			else if(table[i][j] == -2) {
				powerCount++;
				fireAtEnemy++;
			}
		}
		
		for(int i = shipXStart, j = shipYStart ; i >= 0 && j >= 0 ; i--, j--) {
			if(table[i][j] == 0) {
				powerCount++;
			}else if(table[i][j] == -1) {
				break;
			}
			else if(table[i][j] == -2) {
				powerCount++;
				fireAtEnemy++;
			}
		}
		
		for(int i = shipXStart, j = shipYStart ; i < tableSize && j >= 0 ; i++, j--) {
			if(table[i][j] == 0) {
				powerCount++;
			}else if(table[i][j] == -1) {
				break;
			}
			else if(table[i][j] == -2) {
				powerCount++;
				fireAtEnemy++;
			}
		}
		
		for(int i = shipXStart, j = shipYStart ; i >= 0 && j < tableSize ; i--, j++) {
			if(table[i][j] == 0) {
				powerCount++;
			}else if(table[i][j] == -1) {
				break;
			}
			else if(table[i][j] == -2) {
				powerCount++;
				fireAtEnemy++;
			}
		}
		
		System.out.println(powerCount);
		System.out.println(fireAtEnemy);

	}

}