public class Rose { 

    public static void main(String[] args) { 
        int n = Integer.parseInt(args[0]);
        StdDraw.setXscale(-1, +1);
        StdDraw.setYscale(-1, +1);

        double x0 = 0, y0 = 0;
        for (double t = 0.0; t <= 2 * Math.PI; t += 0.005) {
            double theta = t;
            double r = Math.sin(n * theta);
            double x1 = r * Math.cos(theta);
            double y1 = r * Math.sin(theta);
            StdDraw.line(x0, y0, x1, y1);
            x0 = x1;
            y0 = y1;
        }
    }

}