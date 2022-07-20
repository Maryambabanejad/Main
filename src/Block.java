public class Block {

    public static void sample(int x, int y) {
        int a = 0, b = 0, c = 0;

        if (x > y) {
            a++;
            b = x;
            c = x / y;
        } else {
            c = y / x;
            a--;
            System.out.println("y>x");
            System.out.println(y>x);
        }
    }

    public static void main(String[] args) {
        sample(2,8);
        System.out.println((int)'b');
    }
}
