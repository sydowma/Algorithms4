package sort;

/**
 * 选择排序
 */
public class Selection {

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    
    public static int[] sort(int[] arr) {
        int min, temp, len = arr.length;

//        先遍历
        for (int i = 0; i < len; i++) {
            min = i;

//            找出最小的数
            for (int j = i + 1; j < len; j++) {

//                if (less(arr[j], arr[min])) {
//                    min = j;
//                }
                if (arr[j] < arr[min]) {
                    min = j;
                }

            }

//            将最小的数与当前index交换
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;


        }
        System.out.println(arr);
        return arr;
    }

    public static void main(String[] args) {
        int[] foo = {1,2,3,323,2,23,23,21,321,312,3,213,2,32,32,231,321,321};

        int[] bar = sort(foo);
        System.out.println(bar);
    }
     
}
