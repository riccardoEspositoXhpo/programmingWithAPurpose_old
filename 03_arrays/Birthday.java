public class Birthday {    
    public static void main(String[] args) {
    
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int[] counts = new int[n + 1];
        int cumulativeCount = 0;
        double fraction = 0;

        for (int i = 0; i < trials; i++) {

            boolean[] birthdays = new boolean[n];
            int count = 0;
            while (true) {

                // sample birthday
                int birthday = (int) (Math.random() * n);
    
                
                if (!birthdays[birthday]) {
                    birthdays[birthday] = true;
                    count += 1;
                }
                else {
                    counts[count] += 1;
                    break;
                }  
            }     
        }

        int countIndex = 1;
        
        
        while (fraction < 0.5) {
                        
            cumulativeCount += counts[countIndex - 1];
            fraction = 1.0 * cumulativeCount / trials;

            System.out.println(countIndex + "\t" + counts[countIndex - 1] + "\t" + fraction);
            countIndex++;
        }        
    }
}
