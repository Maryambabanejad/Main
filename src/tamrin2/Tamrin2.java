package tamrin2;

import java.util.Scanner;

public class Tamrin2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = reader.nextInt();
        System.out.println("Enter a number 2");
        int number2 = reader.nextInt();
        System.out.println("Enter a number3");
        int number3 = reader.nextInt();
        int sub = (number + number2 + number3);
        System.out.println("Miyangin is " + sub / 3);
    }
}


