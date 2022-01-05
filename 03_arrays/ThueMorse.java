public class ThueMorse {
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);

        // estimate the closest power of 2 that equals n
        double powerOfTwo = (Math.ceil(Math.log(n)/Math.log(2)));

        // array of correct length
        int[] morse = new int[(int) Math.pow(2, powerOfTwo)];


        // initialize sequence
        morse[0] = 0;

        // create sequence
        for (int i = 0; i < powerOfTwo; i++) {

            int index = (int) Math.pow(2, i);

            // loop index values
            for (int j = 0; j < index; j++) {
                if (morse[j] == 0) morse[index + j] = 1;
                else morse[index + j] = 0;
            }
        }

        // print grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (morse[i] == morse[j]) System.out.print("+  ");
                else System.out.print("-  ");
            }
            System.out.println();
        }

    }
}
