class binarySearchUsingRecursion {
    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;

            public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scn.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array (sorted in ascending order):");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter the element to be searched:");
        int x = scn.nextInt();

        binarySearchUsingRecursion ob = new binarySearchUsingRecursion();
        int result = ob.binarySearch(arr, 0, n - 1, x);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + result);
    }
}