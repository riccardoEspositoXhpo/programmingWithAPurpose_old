public class Butterfly {

    public static void main(String[] args) {
        StdDraw.setXscale(-4, 4);
        StdDraw.setYscale(-4, 4);
        double x0 = 0, y0 = 0;
        for (double theta = 0.0; theta < 72; theta += 0.01) {
            double r = Math.exp(Math.cos(theta)) - 2*Math.cos(4*theta) + Math.pow(Math.sin(theta/12), 5);
            double x1 = r * Math.cos(theta);
            double y1 = r * Math.sin(theta);
            StdDraw.line(x0, y0, x1, y1);
            x0 = x1;
            y0 = y1;
        }
    }
}
