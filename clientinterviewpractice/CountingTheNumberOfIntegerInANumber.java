package clientinterviewpractice;

import java.util.Scanner;

public class CountingTheNumberOfIntegerInANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check: ");
		int num = sc.nextInt();
		int count = 0;
		while(num!=0) {
			int n = num%10;
			count++;
			num/=10;
		}
		System.out.println("The number of integer present in the number is: "+count);
	}

}
