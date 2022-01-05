public class NPerLine {
    
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        int counter = 0;

        for (int i = 1; i <= 1000; i++) {
            counter ++;    

            String spaces = "";

            if (i < 10) spaces = "   ";
            else if (i < 100) spaces = "  ";
            else spaces = " ";
            
            System.out.print(i + spaces);
            
            if (counter % n == 0) {
                System.out.println("");
            }            
        }
    }
}
