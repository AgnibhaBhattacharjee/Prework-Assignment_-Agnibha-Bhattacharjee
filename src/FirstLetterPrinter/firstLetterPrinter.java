package FirstLetterPrinter;

import java.util.Scanner;

public class firstLetterPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String input= sc.nextLine();
		System.out.println(fristLetterPrinter(input));
		

	}
	public static String fristLetterPrinter(String input){
		String firstLetter= new String();
		char[] ch= new char[input.length()];
		char[] inputChar= input.toCharArray();
		int c=0;
		for(int i=0;i<input.length();i++){
			if(i==0){
				ch[c++]=inputChar[i];
			}
			else if(inputChar[i-1]==' '){
				ch[c++]=inputChar[i];
	
			}
		}
		firstLetter= String.valueOf(ch);
		return firstLetter;
	}

}
