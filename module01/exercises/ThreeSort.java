package exercises;

public class ThreeSort {
    public static void main(String[] args) {
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int first = Math.min(a, Math.min(b, c));
        int third = Math.max(a, Math.max(b, c));

        // the middle number is the one left-over after subtracting first and second
        int second = (a + b + c) - (first + third);


        System.out.println("Numbers in order: " + first + ", " + second + ", " + third);
    }
}