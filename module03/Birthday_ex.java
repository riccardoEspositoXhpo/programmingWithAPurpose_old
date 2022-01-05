

public class Birthday_ex {
    
    public static void main(String[] args) {

        int count = 0;
        int trials = 1000000;

        for (int j = 0; j < trials; j++) {

            boolean[] birthdays = new boolean[364];
            for (int i = 0; i < birthdays.length; i++) {

                int birthday = (int) (Math.random() * birthdays.length);
    
                if (!birthdays[birthday]) {
                    birthdays[birthday] = true;
                    count++;
                }
                else break; 
               
            }
    
        }
        System.out.println(count / trials);
    }
}
