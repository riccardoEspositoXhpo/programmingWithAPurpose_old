public class Distinct {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println(a);

        if (a != b) {
            System.out.println(b);
        }

        if (b != c && a != c) {
            System.out.println(c);
        }
    }
}

