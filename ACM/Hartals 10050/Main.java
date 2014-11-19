import java.util.Scanner;

class Main {
	
	Scanner in;
	Main ( ) {
		in = new Scanner(System.in);
		run(in);
	}
	
	public void run (Scanner in) {
		
		int numTestCases = in.nextInt();
		
		int[][] track = new int[numTestCases][100];
		
		for (int i=0;i<numTestCases;i++) {
			
			int numDays = in.nextInt();
			int numParties = in.nextInt();
			
			for (int j=0;j<numParties;j++) {
				track[i][j] = in.nextInt();
			}
			//print(track);
			simulate(i, track,numDays,numParties);
			
		}
		String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		//print(track);
		
	}
	
	public void simulate(int caseNum, int[][] arr, int days, int parties) {
		int counter = 0;
		
		int countDays = 1;
		int saturdays = 7;
		
		int dayofweek = 1;
		while (countDays <= days) { //runs 14 times
			innerLoop:
			for(int i=0;i<parties;i++) {
				if (countDays % arr[caseNum][i] == 0) {
					if ( dayofweek != 6 && dayofweek != 7 ) {
						//System.out.println("-------------");
						//System.out.println(countDays);
						//System.out.println(arr[caseNum][i]);
						counter++;
						break innerLoop;
					}					
				}
			}
			countDays++;
			if (dayofweek == 7) {
				dayofweek = 1;
			} else {
				dayofweek++;
			}
		}
		System.out.println(counter);
	}
	
	public void print (int[][] arr) {
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++) {
				if (arr[i][j] != 0) {
					System.out.println("Array Values ----");
					System.out.print(i);
					System.out.print(", ");
					System.out.print(j);
					System.out.print(" ");
				System.out.println(arr[i][j]);
				System.out.println("-----------------");
				}
			}
		}
	}
	
	public static void main(String args[]) {
		Main main = new Main();
	}
}