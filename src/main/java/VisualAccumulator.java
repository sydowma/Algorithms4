import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by MAMIAN on 2017/6/3.
 */
public class VisualAccumulator {
    private double total;
    private int N;

    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        VisualAccumulator a = new VisualAccumulator(T, 1.0);
        for (int t = 0; t < T; t++) {
            a.addDataValue(StdRandom.uniform());
        }
        StdOut.println(a);


    }

    public VisualAccumulator(int trials, double max) {
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(.005);

    }

    public void addDataValue(double val) {
        N++;
        total += val;

        // point
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        // 数量
        StdDraw.point(N, val);

        // line
        StdDraw.setPenColor(StdDraw.RED);
        // 平均值
        StdDraw.point(N, total/N);
    }
}
