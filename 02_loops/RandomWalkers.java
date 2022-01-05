public class RandomWalkers {
    
    public static void main(String[] args) {
        
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int steps = 0;

        for (int i = 0; i < trials; i++) {

            int distance = 0;
            
            int x = 0, y = 0;
            
            while (distance != r) {

                // calculate distance
                distance = Math.abs(x) + Math.abs(y);
                
                
                // walk
                double direction = Math.random();

                // up
                if (direction < 0.25) y += 1;
                // down 
                else if (direction < 0.5) y -= 1;
                // right
                else if (direction < 0.75) x += 1;
                // left
                else x -= 1;

                if (distance != r) steps += 1;


            }  
        }

        double average = (double) steps / trials;

        System.out.println("average number of steps = " + average);
    }
}
