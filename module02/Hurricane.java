public class Hurricane {
    public static void main(String[] args) {

        int windSpeed = Integer.parseInt(args[0]);
        int category;

        if (windSpeed >= 155) category = 5;
        else if (windSpeed >= 131) category = 4; 
        else if (windSpeed >= 111) category = 3; 
        else if (windSpeed >= 96) category = 2; 
        else if (windSpeed >= 74) category = 1; 
        else category = 0;

        System.out.println(category);
    }
}

