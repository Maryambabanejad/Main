package tamrin1;

import java.util.Scanner;

public class Daramd {
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
        int result=hoghogh-(aghsat+hazineh);
        System.out.println( "khales daryafei :"+ result);
        myScanner.close();
    }
}
