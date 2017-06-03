import edu.princeton.cs.algs4.StdOut;

/**
 * 判断回文数
 * Created by MAMIAN on 2017/6/3.
 */
public class Palindrome {
    public static boolean isPalindrome(String s) {
        int N = s.length();

        // 从开始到中间位置
        for (int i = 0; i < N / 2; i++) {
            // 当前位置的数 不等于 总共-1-当前 位置的数
            // 从最开始的位置和最后一个位置进行匹配, 如果不对就返回false
            //
            if (s.charAt(i) != s.charAt(N-1-i)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        StdOut.println(isPalindrome("123"));

    }
}
