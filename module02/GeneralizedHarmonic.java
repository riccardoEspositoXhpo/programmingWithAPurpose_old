public class GeneralizedHarmonic {
        public static void main(String[] args) {
            
            int n = Integer.parseInt(args[0]);
            int r = Integer.parseInt(args[1]);

            // n numbers to the power r
            double harmonicMean = 0;
            for (int i = 1; i <= n; i++) {

                harmonicMean += Math.pow(1.0 / i, r);

            }

            System.out.println(harmonicMean);
        }
}
