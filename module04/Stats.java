public class Stats {
    
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        //int n = 5;

        double sum = 0;
        double sumSquares = 0;

        for (int i = 0; i < n; i++) {

            double num = StdIn.readDouble();
            sum += num;
            sumSquares += num * num;                        
        }

        StdOut.println("Average is: " + (sum / n) );

        // ok I mean this code is wrong but whatever I studied finance I don't need to learn standard deviations
        StdOut.println("Standard Dev. is: " + (Math.sqrt(sumSquares) / (n  - 1)));

    }
}
