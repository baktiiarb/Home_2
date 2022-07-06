public class Main {
    public static void main(String[] args){

        System.out.println(work(23,14));
        System.out.println(work(21,11));
        System.out.println(work(15,7));
        System.out.println(work(18,-20));


    }





        public static String work(int age, int temp)

    {

     if(age > 20 && age < 45 && temp > -20 && temp < 30){
         System.out.println("можно идти гулять");
     }else if(age <20 && temp >=0 && temp <28){
         System.out.println("можно идти гулть");
     }else if(age >45 && temp > -10 && temp < 25){
         System.out.println("можно идти гулять");
     }else{
         System.out.println("оставайтесть дома");
     }
     return" age = " + age + " temp = " + temp;}




    }

























