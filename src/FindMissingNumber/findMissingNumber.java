package FindMissingNumber;

import java.util.Scanner;

public class findMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size= sc.nextInt();
		int arr[]= new int[size-1];
		System.out.println("Enter the array elements");
		for(int i=0;i<size-1;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("The missing no. is "+missingNumberFinder(arr,size));
		
		

	}
	public static int missingNumberFinder(int[] arr, int size){
		int missingNumber;
		int arrSum=0, originalArrSum;
		for(int i=0;i<size-1;i++){
			arrSum=arrSum+arr[i];
		}
		originalArrSum=(size*(size+1))/2;
		missingNumber=originalArrSum- arrSum;
		return missingNumber;
	}

}
