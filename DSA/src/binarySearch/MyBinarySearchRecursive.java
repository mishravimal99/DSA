package binarySearch;

public class MyBinarySearchRecursive {
    /*
Algorithm : binarySearch(searchElement, low, high)
Start:
Step1: 		if(low > high) then step 2, else step 3.
Step 2: 		return false;
Step 3: 		mid = (low + high) / 2;
Step 4:		 if(searchElement == arr[mid]) then step 5, else step 6
Step 5:		 return true;
Step 6:		 if(searchElement < arr[mid]) then step 7, else step 8
Step 7:		 binarySearch(searchElement , low , mid - 1)
Step 8:		 binarySearch(searchElement, mid + 1, high)
end
 */
    private int[] arr;

    public MyBinarySearchRecursive(int[] arr) {
        this.arr = arr;
    }

    boolean binarySearch(int searchelement, int low, int high) {
        if (low > high) {
            return false;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == searchelement) {
            return true;
        } else if (arr[mid] > searchelement) {
            return binarySearch(searchelement, low, mid - 1);
        } else {
            return binarySearch(searchelement, mid + 1, high);
        }
    }
}
