package day_02_07_06_20022;

public class CodilityTAsk {
    public static void main(String[] args) {

    int number = 6;
    String result = "";

    if(number%2==0)

    {
        result = result + "Codility";
    }// += short cut of result=result+ == result+=

    if(number%3==0)

    {
        result += "Test";
    }

        if(number%5==0)

    {
        result += "Coders";
    }
        System.out.println(result);
}}
