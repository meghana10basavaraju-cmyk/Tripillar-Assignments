package module7;

public class BinarySearchExample {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50}; // Array must be sorted
        int key = 30;

        int low = 0;
        int high = arr.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                break;
            }
            else if (arr[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if (low > high) {
            System.out.println("Element not found");
        }
    }
}
