import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import java.util.Arrays;

class Main {

	Main() {
		ArrayList<int[]> list = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		int k = in.nextInt();
		int[] input = new int[k];
		
		for(int i=0;i<k;i++) {
			input[i] = in.nextInt();
		}
		
		int max = (fac(k))/((fac(k-6))*(fac(6)));
		while (list.size() < max ) {
			int[] select = new int[6];
			
			int j = 0;
			while (j < select.length) {
				int val = input[rand.nextInt(input.length)];
				
				boolean exists = false;
				for(int m=0;m<select.length;m++) {
					if(select[m] == val) {
						exists = true;
					}
				}
				
				if(!exists) {
					select[j] = val;
					j++;
				}
			}
			Arrays.sort(select);
			if(!contains(select,list)) {
				list.add(select);
			}
		}
		print(list);
	}
	
	public boolean contains(int[] s, ArrayList<int[]> list) {
		for(int[] m : list) {
			if(Arrays.equals(s,m)) {
				return true;
			}
		}
		return false;
	}
	
	public void print(ArrayList<int[]> list) {
		for(int[] s : list) {
			for(int i=0;i<s.length;i++) {
				System.out.print(s[i] + " ");
			}
			System.out.println();
		}
	}
	
    public int fac(int n) {
        int fact = 1; // this  will be the result
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
	
	public static void main(String[] args) {
		new Main();
	}
}