package algorithms;

public class BinarySearch {
    public int binarySearch(int arr[], int low, int range, int x) {
        if(range >= 1){
            // finding middle point in the array
           int mid = low + (range-1)/2;
           if(arr[mid] == x) {
               return x;
           }
           // if its greater than 10, run it again. this is called recursive.
             if(arr[mid] > x) {
                 // looking between low and mid
                 return binarySearch(arr, low, mid-1, x);
           }
            return binarySearch(arr, mid+1, range, x);
        }
        return -1;
    }

}
