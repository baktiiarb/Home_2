import java.util.Random;

public class Main {
    public static void main(String[] args) {
        work(23,12);
        work(5,8);
        work(17,14);
        work(14,-7);
        work(11,5);
        generateRandomAge();


    }

    public static int generateRandomAge() {
        Random random = new Random();
        int x = random.nextInt(70) + 1;
        return x;

    }


    public static String work(int age, int temp) {
        System.out.println(" age = " + generateRandomAge() + " temp + " + temp);

        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            System.out.println(" можно идти гулять ");
        } else if (age < 20 && temp >= 0 && temp < 28) {
            System.out.println("можно идти гулть");
        } else if (age > 45 && temp > -10 && temp < 25) {
            System.out.println("можно идти гулять");
        } else {
            System.out.println("оставайтесть дома");
        }
        return " age = " + age + " temp = " + temp;
    }

}


























