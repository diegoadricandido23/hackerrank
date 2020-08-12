/**
 * 
 */
package br.com.diego.hakerrank.stdinstdout;

import java.util.Scanner;

/**
 * @author dcandido
 *
 */
public class StdinsSdout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Put the first number (int): ");
		final int firstInt = sc.nextInt();
		
		System.out.println("Put the second number (int): ");
		final int secondInt = sc.nextInt();
		
		System.out.println("Put the third number (int): ");
		final int thirdInt = sc.nextInt();
		
		System.out.println("First number: " + firstInt);
		System.out.println("Second number: " + secondInt);
		System.out.println("Third number: " + thirdInt);

	}

}
