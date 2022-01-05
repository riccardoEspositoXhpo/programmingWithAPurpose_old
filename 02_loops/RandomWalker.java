public class RandomWalker {
    
    public static void main(String[] args) {
        
        int r = Integer.parseInt(args[0]);

        int distance = 0;
        int steps = 0;
        int x = 0, y = 0;

        // print location
        if (r == 0) System.out.println("(" + x + ", " + y + ")");
        
        while (r > 0 && distance != r) {

            // calculate distance
            distance = Math.abs(x) + Math.abs(y);

            // print location
            System.out.println("(" + x + ", " + y + ")");

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
        System.out.println("steps = " + steps);
    }
}
