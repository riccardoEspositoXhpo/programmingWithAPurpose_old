public class BoysAndGirls {
    
    public static void main (String[] args) {

        int trials = Integer.parseInt(args[0]);
        double child = 0;
        int two = 0, three = 0, four = 0, fiveOrMore = 0, totalChildren = 0;

        for (int i = 0; i < trials; i++) {
            
            int numberOfChildren = 0, boy = 0, girl = 0;;
            while (boy < 1 || girl < 1) {
                
                // have child
                child = Math.random();
                numberOfChildren += 1;
                
                if (child < 0.5) boy += 1;
                else girl += 1;
            }

            if (numberOfChildren == 2) two += 1;
            else if (numberOfChildren == 3) three += 1;
            else if (numberOfChildren == 4) four += 1;
            else if (numberOfChildren >= 5) fiveOrMore += 1;
            
            totalChildren += numberOfChildren;

        }

        System.out.println("Two children: " + two);
        System.out.println("Three children: " + three);
        System.out.println("Four children: " + four);
        System.out.println("Five or More children: " + fiveOrMore);
        System.out.println("Average: " + (1.0 * totalChildren / trials));

         
    }
}