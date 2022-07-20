package tamrin1;

public class MonthlyPaymentAverage {
    public static void main(String[] args) {
        int[] MonthlyName = new int[12];
        MonthlyName[0] = 15000000;
        MonthlyName[1] = 25000000;
        MonthlyName[2] = 30000000;
        MonthlyName[3] = 4000000;
        MonthlyName[4] = 5000000;
        MonthlyName[5] = 6000000;
        MonthlyName[6] = 7000000;
        MonthlyName[7] = 8000000;
        MonthlyName[8] = 9000000;
        MonthlyName[9] = 10000000;
        MonthlyName[10] = 110000000;
        MonthlyName[11] = 120000000;
        int total = 0;

        for (int counter = 0; counter < 12; counter++){
            total += MonthlyName[counter];
        }

        System.out.println(total);
    }
}