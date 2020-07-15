/*********************************************************************************************************************
 **
 **  Implementation of 
 **
 **	 1. Bubble Sort
 **		
 **  Input in the form of array
 **  Output is printed in listed manner
 **
 **  Written By: Avip Anandrao Patil
 **
*********************************************************************************************************************/

import java.util.*;


public class BubbleSort
{
	public static void main(String[]args) 
	{
	 // Initialization of integer array.
		int numbers[] = {4,6,1,17,10,2};
		
	 // Now, let's sort above numbers using Bubble sort.	
		sort(numbers);
	}

	private static void sort(int[] a) 
	{
		
	 //The code does the bubble sort. here we need a temp variable for store temporary value at the time of swapping. 
		
		for(int i = a.length-1 ; i > 0 ; i--)
		{
			for(int j = 0; j < i; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
	 // Finally, let's print the sorted version of the array.
		
		System.out.println("After sorting, the Sequence is : ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + ", ");
		}
		
	}
	
}

