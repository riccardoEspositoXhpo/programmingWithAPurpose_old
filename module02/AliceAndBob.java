public class AliceAndBob {
    
    public static void main (String[] args) {

        // this program is a bit stupid, the probability is constantly shifting from 0.3 to 0.9...
        
        int trials = Integer.parseInt(args[0]);
        int aliceToss = 0, bobToss = 0, aliceLessThanBob = 0;

        double coin = 0;
        // head is < 0.5 by convention
        for (int i = 0; i < trials; i++) {
            
            // Alice requires two heads
            int heads = 0, headTail = 0;
            while (heads < 2) {
                
                coin = Math.random();
                aliceToss += 1;
                
                if (coin < 0.5) heads += 1;
                else heads = 0;
            }

            // Bob requires a head followed by a tail

            while (headTail < 2) {

                coin = Math.random();  
                bobToss += 1;              
                
                if (coin < 0.5) {
                    if (headTail == 0) {
                        // previous toss was not head
                        headTail += 1;
                    } 
                    else {
                        // previous toss was a head, we reset
                        headTail = 0;
                    }
                }
                else {
                    if (headTail == 1) {
                        // previous toss was head, cycle complete
                        headTail += 1;
                    }
                    else {
                        // previous toss was tail, we reset
                        headTail = 0;
                    }
                    
                }

            }

            if (aliceToss < bobToss) {
                aliceLessThanBob += 1;
            }

        }

        System.out.println("Probability of Alice less than Bob: " + (1.0 * aliceLessThanBob / trials));
        

    }
}