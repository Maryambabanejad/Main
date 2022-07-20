public class CastType {
    public static void main(String[] args) {
        int i;
        float f;
        i = 123456789;
        f = i;
        System.out.println(f);
        System.out.println();
        i = (int) f;
        System.out.println(i);
        System.out.println();
        long a = 123456789_123456789l;
        int b =  (int) a;
        System.out.println(b);
        System.out.println();
        int intvalue=2;
        float floatvalue=2;
        intvalue=(int)floatvalue;
        floatvalue=intvalue;
        double d = 123456789_123456789D;
        int g =(int)d;
        System.out.println(d);
        System.out.println(g);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}

