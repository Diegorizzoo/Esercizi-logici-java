import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Random r = new Random();
        int array[] = new int[10], j = 0;
        for (int i = 0; i < 10; i++) {
            array[i] = r.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for (int i = 9; i > 4; i--) {
            System.out.print(array[j] + " ");
            System.out.print(array[i] + " ");
            j++;
        }
    }
}