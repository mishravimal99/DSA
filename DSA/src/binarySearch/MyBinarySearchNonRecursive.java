package binarySearch;

/*
algorithm : binarySearch(search element)
//arr is the array in which we search for element
        Start
        Step 1: 	low= 0
        Step 2: 	high = arr.size – 1
        Step 3:	while(low <= high) do the following  steps 4, 5, 7
        Step 4:	mid = (low + high) / 2
        Step 5:	if(searchElement == arr[mid]) then step 6.
        Step 6:	return true;
        Step 7:	if(searchElement < arr[mid]) then step 8 else step 9.
        Step 8:	high = mid – 1;
        Step 9: 	low  = mid + 1
        Step 10:	return false;
        end
*/
public class MyBinarySearchNonRecursive {
    private int[] arr;

    MyBinarySearchNonRecursive(int[] arr) {
        this.arr = arr;
    }

}
