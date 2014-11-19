import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;

class Main{

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner( new File("./input.txt" ) );
			
			int n = in.nextInt();
			
			do {
				HashMap<Integer, HashMap<Integer, Integer>> rows = new HashMap<>();
				for (int i = 0; i < n; i++) {
					int row = in.nextInt();
					int col = in.nextInt();
					int rowSpan = in.nextInt();
					int colSpan = in.nextInt();
					
					for (int r = 0; r < rowSpan; r++){
					
						if ( !rows.containsKey( row + r ) ){
							rows.put(row + r, new HashMap<Integer, Integer>() );
						}
						for (int c = 0; c < colSpan; c++){
							
						
							rows.get(row + r).put( col + c, i+1 );
						}
					}
				}
				
				int t = in.nextInt();
				for (int i = 0; i < t; i++) {
					int row = in.nextInt();
					int col = in.nextInt();
					
					System.out.println( rows.get(row).get(col) == null ? "Background" : rows.get(row).get(col) );
				}
				System.out.println();
				n = in.nextInt();				
			} while ( n > 0 );
		} catch(FileNotFoundException x){
			x.printStackTrace();
		}
	}
}