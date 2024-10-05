public class QuickSortDescending {

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);

            quickSort(arr, low, partitionIndex - 1);  // Sorting the left part
            quickSort(arr, partitionIndex + 1, high); // Sorting the right part
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Pivot element
        int i = low - 1;  // Index of the smaller element

        for (int j = low; j < high; j++) {
            // Compare elements to sort in descending order
            if (arr[j] > pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);  // Swap the pivot with the element at i + 1
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
