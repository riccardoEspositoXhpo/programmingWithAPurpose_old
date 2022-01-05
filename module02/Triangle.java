public class Triangle {
    
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        String dot = ". ";
        String star = "* ";

        for (int i = 0; i < n ; i++) {
            
            int dots = i;
            int stars = n - i;

            for (int j = 0; j < dots; j++) {
                System.out.print(dot);
            }

            for (int j = 0; j < stars; j++) {
                System.out.print(star);
            }

            System.out.println("");
        }
    }
}
