public class merge_sort {

    public static void conqure(int arr[], int mid, int s, int e) {

        int merged[] = new int[e - s + 1];
        int idx1 = s;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= e) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= e) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = s; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }

    public static void divide(int arr[], int s, int e) {

        if (s >= e) {
            return;
        }

        int mid = s + (e - s) / 2;

        divide(arr, s, mid);
        divide(arr, mid + 1, e);
        conqure(arr, mid, s, e);

    }

    public static void main(String[] args) {
        int arr[] = { 6, 7, 8, 4, 2 };

        int n = arr.length;
        divide(arr, 0, n - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
