package day01_06_30_2022;

public class TypeCasting {
    public static void main(String[] args) {
        /*
        Type Casting: I must know it
        1- Implicit Casting:
        *Done By Compilier
        *Smaller to Bigger
        *No Loss Data

        2- Explicit Casting:
        *Done By Developer
        *Bigger To Smaller
        *We Can Loss Data but not Always

        *** for numeric data default int
        *** for decimal data default type double

        byte<short<int<long<float<double
         */
        byte b=20; //-128 to 127
        short s=b;   //implicit
        byte b1=(byte)s;
        int i= 45;
        short s2=(short) i;

        long l=111_111_1111_111L;

        float f= 12.5F;



    }
}
