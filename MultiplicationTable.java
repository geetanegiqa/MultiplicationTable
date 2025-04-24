package day6;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number for multiplication table: ");
		int num = scanner.nextInt();
		System.out.println("Here is your multiplication table for "+ num);
		for(int i=1;i<=10;i=i+1)
		{
			System.out.println(num + " * " + i+ " = "+ num*i);
			
		}

		scanner.close();
	}

}
