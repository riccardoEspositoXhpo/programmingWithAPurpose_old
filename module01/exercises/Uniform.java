package exercises;

public class Uniform {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();
        double average = ( a + b + c + d + e ) / 5;

        System.out.println("Numbers are: " + a + ", " + b + ", " + c + ", " + d + ", " + e);
        System.out.println("Max is: " + Math.max(a, Math.max(b, Math.max(c, Math.max(d, e)))));
        System.out.println("Min is: " + Math.min(a, Math.min(b, Math.min(c, Math.min(d, e)))));
        System.out.println("Average is: " + average);
    }
}