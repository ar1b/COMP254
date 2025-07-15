package chapterOneExercises;
import java.util.Scanner;

public class R1 {
    public static void inputAllBaseTypes(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ender a string: ");
        String simpleString = sc.next();

        System.out.println("Ender a Decimal number: ");
        double simpleDouble = sc.nextDouble();

        System.out.println("Ender a boolean value: ");
        boolean simpleBoolean = sc.nextBoolean();

        System.out.println("Ender a number: ");
        int simpleInt = sc.nextInt();

        System.out.println("Ender a Long: ");
        long simpleLong = sc.nextLong();

        System.out.println("Ender a Floating number: ");
        float simpleFloat = sc.nextFloat();

        System.out.println("Ender a short: ");
        short simpleShort = sc.nextShort();

        System.out.println("Ender a character: ");
        char simpleChar = sc.next().charAt(0);

        System.out.println("Ender a anything: ");
        byte simpleByte = sc.nextByte();

        System.out.println(simpleString);
        System.out.println(simpleDouble);
        System.out.println(simpleBoolean);
        System.out.println(simpleInt);
        System.out.println(simpleLong);
        System.out.println(simpleFloat);
        System.out.println(simpleShort);
        System.out.println(simpleChar);
        System.out.println(simpleByte);
    }
}
