public class Maths {
    public static void main(String[] args) {
        // +, -, *
        short n1 = 50, n2 = 100, n3 = 10;
        int res = (n1 + n2 - n3) * n3;
        System.out.println(res);

        // Divide
        short n4 = 41, n5 = 100;
        int resD = n5 / n4;
        System.out.println(resD);

        // Divide with float
        float n6 = 41, n7 = 100;
        float resD2 = n7 / n6;
        System.out.println(resD2);

        // The rest of the divide
        short n8 = 41, n9 = 100;
        int resD3 = n9 % n8;
        System.out.println(resD3);

        //
        short n10 = 41;
        n10 += 10;
        System.out.println(n10);
        n10 -= 10;
        System.out.println(n10);
        n10 /= 10;
        System.out.println(n10);
        n10 *= 10;
        System.out.println(n10);
        n10 %= 3;
        System.out.println(n10);
        n10++;
        System.out.println(n10);
        n10--;
        System.out.println(n10);
    }
}
