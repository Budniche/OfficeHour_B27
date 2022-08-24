package day_03_07_13_2022;

public class T1_PutFirstWordToEnd {
    public static void main(String[] args) {

        String sentence = "Java is a fun language";
        // I need to get first wird
        //I need to find my " " indexOf()

        int indexOffirstSpace =sentence.indexOf(" ");
        String firstWord = sentence.substring(0, indexOffirstSpace);
        System.out.println("firstWord = " + firstWord);
        String secondPart = sentence.substring(indexOffirstSpace+1);
        System.out.println(secondPart +" " +firstWord);
    }
}
