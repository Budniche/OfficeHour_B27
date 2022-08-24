package day_02_07_06_20022;

public class IfElseSmallTask {
    public static void main(String[] args) {
        char input = 'A';
        if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')) {
            System.out.println("Your input is in alphabet");
        } else {
            System.out.println("Your input is not in alphabet");

        }
    }
}
