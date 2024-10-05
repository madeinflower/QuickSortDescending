public class MainApp {

    public static void main(String[] args) {
        int[] array = {3, 6, 8, 10, 1, 2, 1};
        QuickSortDescending sorter = new QuickSortDescending();

        System.out.println("Original array:");
        ArrayUtils.printArray(array);

        sorter.quickSort(array, 0, array.length - 1);

        System.out.println("Sorted array in descending order:");
        ArrayUtils.printArray(array);
    }
}
