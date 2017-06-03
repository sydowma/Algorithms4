import edu.princeton.cs.algs4.StdOut;

/**
 * Created by MAMIAN on 2017/5/28.
 */
public class BinarySearch {

    public static int rank(int key, int[] a) {
        //数组必须是有序的
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // 被查找的键要么不存在, 要么必然存在于a[lo...hi]中
            int mid = (lo + hi) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else                    return  mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {123, 456};

        int k = rank(123, a);
        StdOut.print(k);


//        Scanner input1 = null;
//        Scanner input2;
//        try {
//            input1 = new Scanner(new File("tinyT.txt"));
//            input2 = new Scanner(new File("tinyW.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        List l = new List();
//
//        while (input1.hasNextLine()) {
//            l.add(input1.nextLine());
//            StdOut.println(input1.nextLine());
//        }
//
//        StdOut.println(l);




//        int[] whitelist = StdIn.readAllInts();
//        Arrays.sort(whitelist);
//        while (!StdIn.isEmpty()) {
//            int key = StdIn.readInt();
//            if (rank(key, whitelist) < 0) {
//                StdOut.println(key);
//            }
//        }
    }
}
