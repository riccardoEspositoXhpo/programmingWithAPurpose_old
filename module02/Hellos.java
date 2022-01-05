public class Hellos { 
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        int i = 1;
        while (i <= n) {

            String ending = "";

            if ((i % 10 == 1) && (i % 100 != 11)) ending = "st";
            else if ((i % 10 == 2) && (i % 100 != 12)) ending = "nd";
            else if ((i % 10 == 3) && (i % 100 != 13)) ending = "rd";
            else ending = "th"; 

            System.out.println(i + ending + " Hello");
            i += 1;
        }

    }
}