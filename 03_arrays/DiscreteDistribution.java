public class DiscreteDistribution {
    public static void main(String[] args) {
        
        int m = Integer.parseInt(args[0]);

        int[] array = new int[args.length - 1];

        // create a new array with cumulative pdf
        for (int i = 1; i < args.length; i++) {
            if (i > 1) array[i - 1] = array[i - 2] + Integer.parseInt(args[i]);
            else array[i - 1] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < m; i++) {

            // select number
            int n = (int) (Math.random() * array[array.length - 1]);  

            for (int j = 0; j < array.length; j++) {

                if (n < array[j]) {
                    System.out.print((j + 1) + " ");
                    break;
                }
            }
        }
        System.out.println();

    }
}
