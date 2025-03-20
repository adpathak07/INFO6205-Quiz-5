class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
       // Selection Sort Implementation
       for (int i = 0; i < n - 1; i++) {
           // Assume the min is the first element
           int minIndex = i;

           // Test against elements after i to find the smallest
           for (int j = i + 1; j < n; j++) {
               if (arr[j] < arr[minIndex]) {
                minIndex = j;
               }
           }

           // Swap the found minimum element with the first element
           int temp = arr[minIndex];
           arr[minIndex] = arr[i];
           arr[i] = temp;
       }

    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}   