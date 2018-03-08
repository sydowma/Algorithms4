package sort;

/**
 * 插入排序
 *
 * 从左到右遍历数组, 找到最小的元素, 将其插入到指定的位置
 */
public class Insertion {

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static int[] sort(int[] arr) {
        int len = arr.length;


        for (int i = 0; i < len; i++) {

//            相邻元素比大小 --> 倒置
            for (int j = i; j > 0 && less(arr[j], arr[j-1]); j--) {
//                交换
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] foo = {1221,312,23,23,23,231,23,2121,332,213,3,12,312,312,3,12,2,2,2,3,3,3,34};

        int[] bar = sort(foo);

        System.out.println(bar);
    }
}
