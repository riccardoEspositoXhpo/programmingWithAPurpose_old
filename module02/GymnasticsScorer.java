public class GymnasticsScorer {
    
    public static void main(String[] args) {

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double d = Double.parseDouble(args[3]);
        double e = Double.parseDouble(args[4]);
        double f = Double.parseDouble(args[5]);

        // find lowest and highest scores   
        double lowest = Math.min(a, Math.min(b, Math.min(c, Math.min(d, Math.min(e, f)))));
        double highest = Math.max(a, Math.max(b, Math.max(c, Math.max(d, Math.max(e, f)))));

        // remove outliers
        double adjusted = a + b + c + d + e + f - lowest - highest;

        double average = adjusted / 4;

        System.out.println(average);
        
    }
}
