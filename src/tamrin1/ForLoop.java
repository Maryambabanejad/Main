package tamrin1;

import java.sql.SQLOutput;

public class ForLoop {
    public static void main(String[] args) {
//        int numberone;
//        for ( numberone =1 ;numberone<10 ; numberone++){
//            double number =numberone*0.12;
//            System.out.println("my number is : " + number);
//        }
//        int numberone;
//        for (numberone = 1; numberone <= 50; numberone ++) {
//            int numbertwo=numberone *2;
//            System.out.println(numbertwo);
//        }
        //حالت دوم حل مسئله فوق
        int numberone ;
        int numbertwo;
        for (numberone =1,numbertwo =2 ;numberone*numbertwo<=100 ; numberone++){
            System.out.println("the result : "+ numberone +" * " + numbertwo + "is"  +numberone*numbertwo);
        }
    }
}
