package exercises;

public class AllEqual {
    public static void main(String[] args) {
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        
        String allEqual = ((a == b) && (b == c)) ? "equal" : "not equal";

        System.out.println(allEqual);
    }
}

