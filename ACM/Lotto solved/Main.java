import java.util.Scanner;
import java.util.IllegalFormatException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Main{

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            boolean status=false;   
            while (true){
                int n=in.nextInt();
                if (n==0)
                    break;
                int[] arr=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=in.nextInt();
                }
                if(status)
                     System.out.println();
                comb(0,0,arr,"");
                status=true;
            }
            
    }
        static void comb(int i,int j,int[] arr,String m){
            if(i==6){
                System.out.println(m);
            }else if(j<arr.length){
                String temp=m;
                if(i!=0)
                    m+=" "+arr[j];
                else{
                    m+=arr[j];
                }
                comb(i + 1, j + 1, arr, m);
                comb(i, j + 1, arr, temp);
           }
            
        }
}