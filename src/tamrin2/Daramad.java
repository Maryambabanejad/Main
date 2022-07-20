package tamrin2;

import java.util.Scanner;

public class Daramad {
    public static void main(String[] args) {
        System.out.println("MyFinancialTurnover");
        Scanner myScanner = new Scanner(System.in);
        int hoghogh , aghsat , hazineh;
        System.out.println("please Enter your hoghogh");
        hoghogh=myScanner.nextInt();
        System.out.println("please Enter your aghsat");
        aghsat=myScanner.nextInt();
        System.out.println("please Enter Your hazineh");
        hazineh=myScanner.nextInt();
        System.out.println("mandehhoghogh");
        int mandehhoghogh=hoghogh-(aghsat+hazineh);

        myScanner.close();
    }
}
