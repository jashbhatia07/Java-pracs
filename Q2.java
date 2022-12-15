//2.	Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers. 
//Example 1 2 3 4 5 
//The minimum sum is 1+2+3+4=10 and the maximum sum is 2+3+4+5=14. The function prints 

// Java Implementation of the above approach
import java.util.*;

class GFG {

	static void minMax(int[] arr)
	{
		// Initialize the min_value
		// and max_value to 0
		long min_value = 0;
		long max_value = 0;
		int n = arr.length;
	
		// Sort array before calculating
		// min and max value
		Arrays.sort(arr);
						
		for (int i = 0, j = n - 1;
			i < n - 1; i++, j--)
		{
			// All elements except
			// rightmost will be added
			min_value += arr[i];
		
			// All elements except
			// leftmost will be added
			max_value += arr[j];
		}
		
		// Output: min_value and max_value
		System.out.println(
			min_value + " "
			+ max_value);
	}

	// Driver Code
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// Initialize your array elements here
		int[] arr = { 10, 9, 8, 7, 6, 5 };
		int[] arr1 = { 100, 200, 300, 400, 500 };
		minMax(arr);
		minMax(arr1);
	}
}

