//  Merging two sorted array along with exception handling

public class code_3 {
    public static int[] mergeArrays(int a[], int b[]) {
        int c[] = new int[a.length + b.length];
        int i = 0, k = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }
        return c;

    }

    public static void main(String[] args) {
        int a[] = { 1, 3, 5, 7, 9 };
        int b[] = { 2, 4, 6, 8, 10 };
        int c[] = mergeArrays(a, b);

        System.out.println("Sorted array: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

    }
}
