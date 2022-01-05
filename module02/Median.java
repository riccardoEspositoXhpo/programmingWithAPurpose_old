public class Median {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);
        
        int tmp;
        if (a > b) { tmp = a; a = b; b = tmp; }
        if (c > d) { tmp = c; c = d; d = tmp; }
        if (a > c) { tmp = a; a = c; c = tmp; }
        if (b > d) { tmp = b; b = d; d = tmp; }
        if (b > c) { tmp = b; b = c; c = tmp; }
        
        if (c > e) { 
            // median is b
            System.out.println(b);
        } else {
            // median is c
            System.out.println(c);
        };

    }
}

