package tamrin2;

import java.util.Scanner;

public class Tamrin3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        System.out.println("برنامه ایی بنویسید که سه عدد از کاربر دریافت نماید و میانگین آنها را محاسبه و چاپ نماید:");
        for (int counter = 1; counter <= 3; counter++) {
            sum += scanner.nextInt();
        }
        System.out.println(sum / 3);
    }
}
