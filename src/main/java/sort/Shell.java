package sort;

public class Shell {

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;

        while (h < N / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < N; i++) {
//                将a[i] 插入到 a[i-h], a[i-2*h], a[i-3*h] ... 之中
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h) {
                    exch(a, j, j-h);
                }
            }

            h = h / 3;
        }

        System.out.println(a);
    }

    public static void main(String[] args) {
        Integer[] foo= {12,312,3,32,23,12,3,123,12,312,3,123,12,312,3,1,3,4,35,43,534,5,4356,34,23,423,4,2343,2};
        sort(foo);
    }
}
