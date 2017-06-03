import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;

/**
 * 输入N,产生N个随机点,然后计算两点之间的最近距离
 * Created by MAMIAN on 2017/6/3.
 */
public class Point2DDemo {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        ArrayList<Point2D> p = new ArrayList<Point2D>();
        ArrayList<Double> cl = new ArrayList<Double>();
        double c;

        for (int i = 0; i < N; i++) {
            double x = StdRandom.uniform();
            double y = StdRandom.uniform();
            Point2D point2D = new Point2D(x, y);
//            nextPoint2D = new Point2D(x, y);
//            StdDraw.point(nextPoint2D.x(), nextPoint2D.y());
            StdDraw.point(point2D.x(), point2D.y());

            p.add(point2D);


            if (i < 1)
                continue;

            c = calculator2D(p.get(i-1), p.get(i));
            cl.add(c);




        }


        int clLeng = cl.size();
        double min = 100;
        for (int j = 0; j < clLeng - 1; j++) {
            double pre = cl.get(j);
            double next = cl.get(j+1);

            double temp = next > pre ? next : pre;
            if (temp < min) {
                min = temp;
            }

        }
        StdOut.println("最小的数是"+min);



    }



    public static double calculator2D(Point2D prePoint2D, Point2D nextPoint2D) {
        double c;
        double preX = prePoint2D.x();
        double preY = prePoint2D.y();

        double nextX = nextPoint2D.x();
        double nextY = nextPoint2D.y();

        double temp_A = preX > nextX ? (preX - preX) : (preY - preX);
        double temp_B = nextX > nextY ? (nextX - nextY) : (nextY - nextX);
        c = Math.sqrt(temp_A*temp_A + temp_B*temp_B);
        StdOut.println(c);
        return c;
    }
}
