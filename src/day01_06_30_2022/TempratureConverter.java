package day01_06_30_2022;

public class TempratureConverter {
    public static void main(String[] args) {
        int fahrenheit=222;
        double celcius=(5*(fahrenheit-32))/9;  //we can get decimal so we choose double
        System.out.println("celcius = " + celcius);


        System.out.println(fahrenheit+ " fahrenheit is equal to " + celcius + " celcius." );
    }
}
