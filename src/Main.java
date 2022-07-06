import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(work(21,-7));
        System.out.println(work(12,2));
        System.out.println(work(6,16));
        System.out.println(work(11,21));
        System.out.println(work(8,14));


    }

    public static int generateRandomAge() {
        Random random = new Random();
        int x = random.nextInt(70) + 1;
        return x;

    }


    public static String work(int age, int temp) {
        String walk = "Можно идти гулять";
        String hom = "оставайтесь дома";

        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            return walk;
        } else if (age < 20 && temp >= 0 && temp < 28) {
            return walk;
        } else if (age > 45 && temp > -10 && temp < 25) {
            return walk;
        } else return hom;

    }

}


























