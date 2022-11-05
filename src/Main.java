public class Main {
    public static void main(String[] args) {
        System.out.println(going(100, 10000));
        System.out.println(going(25, 20));
        System.out.println(going(15,20));
        System.out.println(going(50,10));
        System.out.println(going(34,53));
    }



    public static String going(int age, int temp){
        if (age > 20 && age < 45 && temp > -20 && temp < 30){
            return ( "Можно идти гулять");}
        else if (age < 20 && temp >0 && temp < 28){
            return ( "Можно идти гулять");
        } else if (age > 45 && temp > -10 && temp < 25 ) {
            return ( "Можно идти гулять");
        }
        return("Оставайтесь дома");
    }




}