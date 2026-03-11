package module7;

public class SearchComparison {
    // Linear Search Method
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search Method
    public static int binarySearch(int arr[], int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50}; // Sorted array
        int key = 30;

        int linearResult = linearSearch(arr, key);
        int binaryResult = binarySearch(arr, key);

        if (linearResult != -1)
            System.out.println("Linear Search: Element found at index " + linearResult);
        else
            System.out.println("Linear Search: Element not found");

        if (binaryResult != -1)
            System.out.println("Binary Search: Element found at index " + binaryResult);
        else
            System.out.println("Binary Search: Element not found");
    }
}
