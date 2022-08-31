package Pattern;
import java.io.*;
import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the row no.");
		int n= sc.nextInt();
		patternPrinter(n);
		

	}
	
	public static void patternPrinter(int n){
		int N=n;
		for(int i=1;i<=n;i++){
			int c=n;
			for(int j=1; j<=n; j++){
				
				for(int k=1;k<=N;k++){
					System.out.print(c);
				}
				c--;
			}
			System.out.println();
			N--;
		}
	}

}
