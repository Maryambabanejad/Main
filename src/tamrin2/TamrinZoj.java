package tamrin2;

import java.util.Scanner;

public class TamrinZoj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("برنامه ایی بنویسید که فقط اعداد زوج را از کاربر دریافت کند و نتیجه را در خروجی چاپ نماید");
            int i = scanner.nextInt();
            if (i < 0) break;
            if (i % 2 == 0) {
                System.out.println("number is zoj");
            }else
                System.out.println("number is not zoj");
            }
        }

    }
