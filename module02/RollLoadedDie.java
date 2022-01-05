public class RollLoadedDie {
    public static void main(String[] args) {
                
        double die = Math.random() * 8;

        int value = 0;

        if (die <= 1) {
            value = 1;
        }
        else if (die <= 2) {
            value = 2;
        }
        else if (die <= 3) {
            value = 3;
        }
        else if (die <= 4) {
            value = 4;
        }
        else if (die <= 5) {
            value = 5;
        }
        else {
            value = 6;
        }

        System.out.println(value);
    }
}

