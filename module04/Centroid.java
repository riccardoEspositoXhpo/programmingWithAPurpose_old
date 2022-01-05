public class Centroid { 
    public static void main(String[] args) { 
        
        int sum = 0;
        int mx = 0;
        int my = 0;

        // read data and compute statistics
        while (!StdIn.isEmpty()) {
            
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();
            double m = StdIn.readDouble();
            
            sum += m;
            mx += (m * x);
            my += (m * y);    
            
        }

        // compute the average
        double centroidX = mx / sum;
        double centroidY = my / sum;
        double centroidM = sum;

        // print results
        StdOut.println("Coordinates are (x, y, m):");
        StdOut.print(centroidX + ", ");
        StdOut.print(centroidY + ", ");
        StdOut.print(centroidM + " ");
    }
}