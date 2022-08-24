package day_02_07_06_20022;

public class MultiIfSmallTask {
    public static void main(String[] args) {

        int number=10;

        /*
        number smaller than 0 invalid
        number between 1-3 good
        number between 4 and 8 better
        more than 8 best

         */

        if (number>=8){
            System.out.println("best");
        }

        if (number>=4 && number<=8){
            System.out.println("better");
        }


        else if (number>=4) {
            System.out.println("better");
        } else if(number>=1){
            System.out.println("good");
        }
        else{
            System.out.println("invalid");
        }
    }
}
