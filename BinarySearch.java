/* Assignment 6.4: Program to search an element in one-dimensional 
   array using Binary Search Algorithm.
   Display a message stating whether element found in array or not. 
   Also display the index position of the element if found.
*/

import java.util.Scanner;	//Scanner util to read input from screen.

class BinarySearch {	// Class Binary Search
	int arr[] = {0,13,24,35,43,51,62,76,88,90,97};		// Array with pre-defined length and value
	int str,end,mid;	// Few variables used to keep start, ending and middle positions
	boolean found=false;	// Flag to store if key found or not.
	
	public int bSearch(int key){	// bSearch method to run the binary search algorithm.
		str = 0;
		end = arr.length-1;
		mid = (str + end)/2;
		while(str <= end){
			if (key < arr[mid]){
				end = mid - 1;
			}
			if (key == arr[mid]){
				found = true;
				return mid;
			}
			if (key > arr[mid]){
				str = mid + 1;				
			}
			mid = (str + end)/2;
		}
		return -1;
	}

	public static void main(String[] args){
		System.out.print("Enter the key: ");
		Scanner in = new Scanner(System.in);
		int key = in.nextInt();
		BinarySearch bs = new BinarySearch();
		int pos = bs.bSearch(key);
		if (bs.found) {
			System.out.println("Element found in the array at position: " + pos);
		}
		else {
			System.out.println("Element not found!");
		}
	}	
}