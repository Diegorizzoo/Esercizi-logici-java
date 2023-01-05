import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);
        int n = 0, p = 1;
        boolean flag = true;
        do {
            System.out.println("Inserisci numero: ");
            n = t.nextInt();
            if (n != 0) {
                if (p == 1 || p == 0) {
                    if (n > 0) {
                        p -= 1;
                    } else {
                        p += 1;
                    }
                    flag = true;
                } else {
                    flag = false;
                }
            }
        } while (n != 0);
        if (flag == true) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
