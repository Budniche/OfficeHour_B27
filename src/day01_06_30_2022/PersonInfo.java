package day01_06_30_2022;

public class PersonInfo {

    //task1
    public static void main(String[] args) {

        String name; // only declaring
        String name1 = "Adam";
        byte age = 35;
        char gender = 'F';
        boolean isStudent = true; //or we can use false
        short numberOfSibling = 1;
        long myFavoriteNamber = 35;
        double birthDate = 01.14;
        int year = 2022;
        // String full birthday date with year
        String fullBirthDay =birthDate+"."+year;
        System.out.println(fullBirthDay);
        System.out.println("fullBirthDay = " + fullBirthDay);
        System.out.println("name1 = " + name1);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("isStudent = " + isStudent);
        System.out.println("numberOfSibling = " + numberOfSibling);
        System.out.println("myFavoriteNamber = " + myFavoriteNamber);
        System.out.println("birthDate = " + birthDate);
        System.out.println("year = " + year);
        //  System.out.println(birthDate+year);

        int num1=1;
        int num2=3;
/*
int +int addition
String+int concat retirn String abc+1 it will be abc1
int+String concat
int+double addition
 */
        int total=num1+num2;
        String result=""+num1+num2;//13 or 4
        System.out.println("result = " + result);

        String result2=num1+num2+"";
        System.out.println("result2 = " + result2);// 4

        String result3=""+(num1+num2);
        System.out.println("result3 = " + result3);//4

        System.out.println("\t"); // tab
        System.out.println("\n"); // next line
        System.out.println("\""); //lapky
        System.out.println("\\"); //odyn slesh
        int hour = 2;
        int min = 10;
        int sec = 23;
        System.out.println(hour+":"+min+":" +sec);



    }
}
