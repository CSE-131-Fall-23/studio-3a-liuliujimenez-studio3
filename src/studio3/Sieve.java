package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose a value for n");
		int n = scan.nextInt();
		int[] sieve = new int[n];
		int testNum = 2;
		int[] prime = new int[n];
		
		for (int currentNum = 0; currentNum <= n-1; currentNum++)
		{
			sieve[currentNum] = currentNum + 2;
		}
		for (int currentNum = 0; currentNum <= n-1; currentNum++)
		{
			if (sieve[currentNum] % testNum != 0)
			{
				prime[currentNum] = currentNum;
			}
		System.out.println(prime[3]);
				
		}
	}

}
