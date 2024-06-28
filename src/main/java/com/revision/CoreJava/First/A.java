package com.revision.CoreJava.First;

import java.util.Arrays;
import java.util.OptionalDouble;

public class A {
	// Write a program to check if a number is prime.F
	protected void checkPrime(long num) {
		boolean check = false;
		for (long i = 2; i < num / 2; i++) {
			if (num % 2 == 0) {
				check = true;
			}
		}
		System.out.println(check ? "Its not Prime NUmber" : "Prime NUmber");
	}

	// Write a program to print the Fibonacci series up to a given number.
	protected void fibonacci(long num) {
		long a = 0;
		long b = 1;
		long c = 0;
		for (int i = 1; i <= num; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}

	// Write a program to find the factorial of a number.
	protected long factorial(long num) {
		long factorial = 1;
		for (int i = 2; i <= num; i++) {
			factorial *= i;
		}
		return factorial;
	}

	// Write a program to reverse a number.
	protected long reverse(long num) {
		long reverse = 0;
		while (num != 0) {
			reverse += (num % 10) * 10;
			num = num / 10;
		}
		return reverse;
	}

	// Write a program to check if a number is a palindrome.
	protected boolean palindrome(long num) {
		long reversed = reverse(num);
		return reversed == num;
	}

	// Write a program to print the multiplication table of a given number.
	protected void table(long num) {
		for (long i = num; i <= num * 10; i += num) {
			System.out.println(i);
		}
	}

	protected long count(long num) {
		long count = 0;
		while (num != 0) {
			num = num / 10;
		}
		return count;
	}

	// Write a program to find the sum of the digits of a number.
	protected long digitSum(long num) {
		long digitSum = 0;
		while (num != 0) {
			digitSum += num % 10;
			num = num / 10;
		}
		return digitSum;
	}

	// Write a program to find the largest element in an array.
	protected long largestNumber(long[] nums) {
		long max = nums[0];
		for (long x : nums) {
			if (max < x) {
				max = x;
			}
		}
		return max;
	}

	// Write a program to find the second largest element in an array.
	protected long secondLargestNumber(long[] nums) {
		long secondMax = nums[0];
		long max = largestNumber(nums);
		for (long x : nums) {
			if (secondMax < x && x != max) {
				secondMax = x;
			}
		}
		return secondMax;
	}

	// Write a program to find the smallest element in an array.
	protected long smallestNumber(long[] nums) {
		long min = nums[0];
		for (long x : nums) {
			if (min > x) {
				min = x;
			}
		}
		return min;
	}

	// Write a program to find the sum of all elements in an array.
	protected long arraySum(long[] num) {
		return Arrays.stream(num).sum();
	}

	// Write a program to find the average of all elements in an array.
	protected OptionalDouble arrayAverage(long[] nums) {
		return Arrays.stream(nums).average();
	}

	// Write a program to reverse an array.
	protected long[] reverseArray(long[] nums) {
		long[] reversedArray = new long[nums.length];
		for (int i = nums.length - 1; i >= 0; i--) {
			reversedArray[i] = nums[(nums.length - 1) - i];
		}
		return reversedArray;
	}

	// Write a program to find the frequency of each element in an array.
	protected void digitFrequency(long[] nums) {

		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = i; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			System.out.println(nums[i] + " found " + count + " times");
		}
	}

	// Write a program to sort an array in ascending order.
	protected long[] ascendingOrder(long[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					long temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
		return nums;
	}

	// Write a program to sort an array in descending order.
	protected long[] descendingOrder(long[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (nums[i] < nums[j]) {
					long temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
		return nums;
	}

	// Write a program to remove duplicate elements from an array.
	protected int removeDuplicates(long[] nums, int n) {
		nums = ascendingOrder(nums);
		long[] temp = new long[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++)
			if (nums[i] != nums[i + 1])
				temp[j++] = nums[i];
		temp[j++] = nums[n - 1];

		for (int i = 0; i < j; i++)
			nums[i] = temp[i];

		return j;

	}

	// Write a program to merge two arrays.
	protected long[] mergeArray(long[] num1, long[] num2) {
		int length = num1.length + num2.length;
		long[] newArray = new long[length];
		int pos = 0;
		for (long x : num1) {
			newArray[pos] = x;
			pos++;
		}
		for (long x : num2) {
			newArray[pos] = x;
			pos++;
		}
		return newArray;
	}

	protected void charFrequency(String text) {
		char[] data = text.toCharArray();
		for (int i = 0; i < data.length; i++) {
			int count = 0;
			boolean repeatcheck = false;
			for (int k = 0; k < i; k++) {
				if (data[i] == data[k]) {
					repeatcheck = true;
				}
			}
			if (!repeatcheck) {
				for (int j = i; j < data.length; j++) {
					if (data[i] == data[j]) {
						count++;
					}
				}
				System.out.println(data[i] + " frequency is " + count + " times");
			}
		}
	}

	protected void vowelandconsonantsFrequency(String text) {
		text = text.toLowerCase();
		char[] data = text.toCharArray();
		for (int i = 0; i < data.length; i++) {
			int count = 0;
			boolean repeatcheck = false;
			for (int k = 0; k < i; k++) {
				if (data[i] == data[k]) {
					repeatcheck = true;
				}
			}
			if (!repeatcheck) {
				for (int j = i; j < data.length; j++) {
					if (data[i] == data[j]) {
						count++;
					}
				}
				if (data[i] == 'a' || data[i] == 'e' || data[i] == 'i' || data[i] == 'o' || data[i] == 'u') {
					System.out.println(data[i] + "Vowel frequency is " + count + " times");
				}
				else
				{
					System.out.println(data[i] + "Consonant frequency is " + count + " times");
				}
			}
		}
	}

}
