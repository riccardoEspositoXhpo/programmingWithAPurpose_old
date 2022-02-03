public class Circles {
    public static void main(String[] args) {
        
        // arguments
        double n =     Double.parseDouble(args[0]);
        double p =     Double.parseDouble(args[1]);
        double min_r = Double.parseDouble(args[2]);
        double max_r = Double.parseDouble(args[3]);
    
        // draw circles
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);

        // extract color from the hat
        // extract size 
        for (int i = 0; i < n; i++) {

            boolean white = (Math.random() < (1 - p));
            double radius = (Math.random() * (max_r - min_r) + min_r);
            double x = Math.random();
            double y = Math.random();

            if (white) StdDraw.setPenColor(StdDraw.WHITE);
            else StdDraw.setPenColor(StdDraw.BLACK);

            StdDraw.filledCircle(x, y, radius);

        }
    }
}
