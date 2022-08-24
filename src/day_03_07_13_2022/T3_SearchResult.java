package day_03_07_13_2022;

public class T3_SearchResult {
    public static void main(String[] args) {

        String str = "About 640,000,000 results (0.78 seconds)";
        int firstSpace = str.indexOf(" ");
        int secondSpace = str.indexOf(" r");
        String resultNumber = str.substring(firstSpace + 1, secondSpace);
        int firstPar = str.indexOf("(");
        int secondPar = str.indexOf(")");
        String responseTime = str.substring(firstPar + 1, secondPar);

        System.out.println("Result number is " + resultNumber);
        System.out.println("Response time is " + responseTime);
    }
}
