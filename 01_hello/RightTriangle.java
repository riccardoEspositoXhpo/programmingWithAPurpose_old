
public class RightTriangle {
    public static void main(String[] args) {
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int first = Math.min(a, Math.min(b, c));
        int third = Math.max(a, Math.max(b, c));

        // the middle number is the one left-over after subtracting first and second
        int second = (a + b + c) - (first + third);

        boolean isRightTriangle = (first > 0) && (second > 0) && (third > 0);
        isRightTriangle = isRightTriangle && (Math.pow(first, 2) + Math.pow(second, 2) == Math.pow(third, 2));

        System.out.println(isRightTriangle);
    }
}