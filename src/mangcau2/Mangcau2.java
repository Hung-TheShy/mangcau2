
package mangcau2;

import java.util.Scanner;
public class Mangcau2 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Độ dài của n = ");
		int n = scanner.nextInt();
		int []arr = new int[n];
		InputArray(arr);
		OutputArray(arr);
		Average(arr);
	}
		public static void InputArray(int []arr) {
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<=arr.length-1; i++) {
			System.out.print("a[" + i + "] = ");
			arr[i] = scanner.nextInt();
			
		}
		scanner.close();
	}
	public static void Average(int []arr) {
		double average = 0;
		for(int i=0; i<=arr.length-1; i++) {
			average += arr[i];
		}
		System.out.println("Average of array is " + (average / arr.length));
	}
	
	public static void OutputArray(int []arr) {
		for (int i=0; i<=arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	}
  
    
    

