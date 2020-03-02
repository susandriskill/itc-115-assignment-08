//------------------------------------------------------------------------------
//Method: isSorted
//This method accepts an array of doubles as a parameter and returns true if the
//list is in sorted (nondecreasing) order and false otherwise
//Susan Driskill
//March 2, 2020
//Assignment 8: Chapter 7, Exercise 4
//------------------------------------------------------------------------------

public class IsSorted {

	public static void main(String[] args) {
		double[] list1 = {16.1, 12.3, 22.2, 14.4};
		double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		//Testing
		System.out.println(isSorted(list1));
		System.out.println(isSorted(list2));
	}

	public static boolean isSorted(double[] list) {
		//isSorted is to return true unless the proper conditions are met (the
		//array is not sorted (nondecreasing) order
		boolean isSorted = true;
		//Declare and initialize the variable int i = 0 to start the loop at 0
		//(for a zero-indexed array)
	    //Use i < list.length - 1 to iterate the loop the number of times needed
		//to traverse the array
	    //Use i++ to increment by 1 for each iteration of the loop
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list[i + 1]) {
				isSorted = false;
			}
		}
		
		return isSorted;
	}

}