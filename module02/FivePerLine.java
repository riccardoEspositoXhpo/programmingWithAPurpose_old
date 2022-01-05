public class FivePerLine { 
    public static void main(String[] args) {

        for (int i = 1000; i <= 2000 - 5; i += 5) {

            System.out.println(i + " " + (i + 1) + " " + (i + 2) + " " + (i + 3) 
                                +  " " + (i + 4));
                                
        }    
    }

}