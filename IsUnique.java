//------------------------------------------------------------------------------
//Method: isUnique
//This method takes an array of integers as a parameter and returns a boolean
//value indicating whether or not the values in the array are unique (true for 
//yes, false for no)
//The values in the list are considered unique if there is no pair of values
//that are equal
//Susan Driskill
//March 2, 2020
//Assignment 8: Chapter 7, Exercise 4
//------------------------------------------------------------------------------

public class IsUnique {

	public static void main(String[] args) {
		int[] arr1 = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
		int[] arr2 = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
		//Testing
		System.out.println(isUnique(arr1));
		System.out.println(isUnique(arr2));
	}

	public static boolean isUnique(int[] array) {
		//isUnique is to return true unless the proper conditions are met (if 
		//there is a pair of values in the array that is passed as a parameter 
		//that are equal)
		boolean isUnique = true;
		//Declare and initialize the variable int i = 0 to start the loop at 0
		//(for a zero-indexed array)
		//Use i < array.length - 1 to iterate the loop the number of times needed
		//to traverse the array
		//Use i++ to increment by 1 for each iteration of the loop
		for (int i = 0; i < array.length; i++) {
			//Declare and initialize the variable int j = 0 to start the loop at 
			//0 (for a zero-indexed array)
			//Use j < i to iterate the loop the number of times needed to traverse
			//the for loop
			//Use j++ to increment by 1 for each iteration of the loop
			for (int j = 0; j < i; j++) {
				//If any element in array j equals any element in array i, then 
				//isUnique is to return false
				if (array[j] == array[i]) {
					isUnique = false;
				}
			}
		}
		return isUnique;
	}
	
}