public class MaxMin {
    public static void main(String[] args) {
        
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;

        while (!StdIn.isEmpty()) {
            
            double n = StdIn.readDouble();

            max = Math.max(max, n);
            min = Math.min(min, n);

            StdOut.println("Max is : " + max);
            StdOut.println("Min is : " + min);
        }
    }
}
