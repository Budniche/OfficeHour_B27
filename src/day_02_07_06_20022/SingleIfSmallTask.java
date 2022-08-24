package day_02_07_06_20022;

import java.util.Scanner;

public class SingleIfSmallTask {

    public static void main(String[] args) {
        //4-Write an if statements that prints "Ideal Temp" if the temp is between 70 and 80

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter temp");

        /*
        after if statement if you use one statement you don"t need to use {}
         */
        int temp = scanner.nextInt();

        if (temp >= 70 && temp <= 80){
            System.out.println("Ideal Temp");
            System.out.println(temp);
        }

        if (temp >= 70 && temp <= 80)
            System.out.println("Ideal Temp");
        System.out.println(temp);
    }
}
