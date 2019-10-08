import algorithms.BinarySearch;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = binarySearch.binarySearch(arr, 0, n-1, x);
        if (result == -1)
            System.out.println("Element is not present");
        else
            System.out.println("Element is found at index " + result);
    }

}
