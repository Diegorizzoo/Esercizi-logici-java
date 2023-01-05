import java.util.*;

public class Scambio {
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);
        Random r = new Random();
        int a = r.nextInt(10), b = r.nextInt(10);
        System.out.println(a + " " + b + " ");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b + " ");
    }
}
