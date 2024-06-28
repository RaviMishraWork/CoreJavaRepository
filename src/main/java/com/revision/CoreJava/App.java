package com.revision.CoreJava;

import java.util.Arrays;
import java.util.Scanner;

import com.revision.CoreJava.First.A;

/**
 * Hello world!
 *
 */
public class App extends A {
	Scanner sc = null;

	App() {
		sc = new Scanner(System.in);
	}

	public static void main(String[] args) {
//		// Write a program to check if a number is prime.
		App o1 = new App();
//		System.out.println("Enter Input to check Prime Number");
//		long num = o1.sc.nextLong();
//		o1.checkPrime(num);
//		// Write a program to print the Fibonacci series up to a given number.
//		System.out.println("Enter Input to print fibonacci series");
//		long num2 = o1.sc.nextLong();
//		System.out.println("Fibonacci Series");
//		o1.fibonacci(num2);
//		// Write a program to find the factorial of a number.
//		System.out.println("Enter Input to print factorial");
//		long num3 = o1.sc.nextLong();
//		System.out.println("factorial of " + num3 + "=" + o1.factorial(num3));
//		// Write a program to reverse a number.
//		System.out.println("Enter number to reverse");
//		long nun4 = o1.sc.nextLong();
//		System.out.println("Reverse number " + o1.reverse(num3));
//		// Write a program to check if a number is a palindrome.
//		System.out.println("Enter number to check palindrome");
//		long nun5 = o1.sc.nextLong();
//		System.out.println(o1.palindrome(nun5) ? "It is palindrome" : "Not palindrome");
//		// Write a program to print the multiplication table of a given number.
//		System.out.println("Enter number to print table");
//		long nun6 = o1.sc.nextLong();
//		o1.table(nun6);
//		// Write a program to count the number of digits in a number.
//		System.out.println("Enter number to count digit");
//		long num7 = o1.sc.nextLong();
//		System.out.println("Digit Count " + o1.count(num7));
//		// Write a program to find the sum of the digits of a number.
//		System.out.println("Enter number to sum digit");
//		long num8 = o1.sc.nextLong();
//		System.out.println("Digit Count " + o1.digitSum(num7));
//		// Write a program to find the largest element in an array.
//		long[] num9 = { 12, 23, 12, 23, 34, 45, 56, 34, 23 };
//		System.out.println("Digit Count " + o1.largestNumber(num9));
//		// Write a program to find the second largest element in an array.
//		long[] num10 = { 12, 23, 12, 23, 34, 45, 56, 34, 23 };
//		System.out.println("Digit Count " + o1.secondLargestNumber(num10));
//		// Write a program to find the smallest element in an array.
//		long[] num11 = { 12, 23, 12, 23, 34, 45, 56, 34, 23 };
//		System.out.println("Digit Count " + o1.smallestNumber(num11));
//		// Write a program to find the sum of all elements in an array.
//		long[] num12 = { 12, 23, 12, 23, 34, 45, 56, 34, 23 };
//		System.out.println(o1.arraySum(num12));
//		// Write a program to find the average of all elements in an array.
//		long[] num13 = { 12, 23, 12, 23, 34, 45, 56, 34, 23 };
//		System.out.println(o1.arrayAverage(num13));
//		// Write a program to reverse an array.
//		long[] num14 = { 12, 23, 12, 23, 34, 45, 56, 34, 23 };
//		System.out.println(Arrays.toString(o1.reverseArray(num14)));
//		// Write a program to find the frequency of each element in an array.
//		long[] num15 = { 12, 23, 12, 23, 34, 45, 56, 34, 23 };
//		o1.digitFrequency(num15);
//		// Write a program to sort an array in ascending order.
//		long[] num16 = { 12, 23, 12, 23, 34, 45, 56, 34, 23 };
//		System.out.println(Arrays.toString(o1.ascendingOrder(num16)));
//		// Write a program to sort an array in ascending order.
//		long[] num17 = { 12, 23, 12, 23, 34, 45, 56, 34, 23 };
//		System.out.println(Arrays.toString(o1.descendingOrder(num17)));
//		// Write a program to remove duplicate elements from an array.
//		long[] num18 = { 12, 23, 12, 23, 34, 45, 56, 34, 23 };
//		int n = num18.length;
//		n = o1.removeDuplicates(num18, n);
//		for (int i = 0; i < n; i++) {
//			System.out.println(num18[i]);
//		}
//		// Write a program to merge two arrays.
//		long[] num19a = { 12, 23, 12, 23, 34, 45, 56, 34, 23 };
//		long[] num19b = { 234, 23, 34, 45, 56 };
//		System.out.println(o1.mergeArray(num19a, num19b));
//
//		// 24. Write a program to check if a string is a palindrome
//		System.out.println("Enter Text to check palindrome");
//		String text = o1.sc.nextLine();
//		StringBuffer sb = new StringBuffer(text);
//		System.out.println(sb.reverse().toString().equalsIgnoreCase(text) ? "Palindrome" : "No Palindrome");
//
//		// 25.Write a program to find the frequency of each character in a string.
//		System.out.println("Enter string to check Frequency");
//		text = o1.sc.nextLine();
//		o1.charFrequency(text);
//
//		// 26. Write a program to count the number of vowels and consonants in a string.
//		System.out.println("Enter string to check vowel and consonants Frequency");
//		text = o1.sc.nextLine();
//		o1.vowelandconsonantsFrequency(text);
//		
		//28. Write a program to replace a character in a string.
		System.out.println("ENter String");
		String text = o1.sc.nextLine();
		System.out.println("Enter character that you want to replace");
		char c1 =  o1.sc.nextLine().charAt(0);
		System.out.println("replaced by ");
		char c2 = o1.sc.nextLine().charAt(0);
		char[] data = text.toCharArray();
		
		
	}
}
