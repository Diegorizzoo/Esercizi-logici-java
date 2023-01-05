import java.util.*;

public class Parcheggio {
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);
        Random r=new Random();
        float pagamento;
        float pagare = r.nextFloat(100);
        System.out.println("importo da pagare: "+pagare);
        do {
            System.out.println("Inserisci pagamento: ");
            pagamento = t.nextFloat();

        } while (pagamento < pagare);
        float[] banconote = { 100, 50, 20, 10, 5, 2, 1, (float) 0.50, (float) 0.25, (float) 0.10, (float) 0.05,
                (float) 0.02, (float) 0.01 };
        int i = 0;
        float resto = pagamento - pagare;
        System.out.println("Ti stiamo per dare un resto di " + resto);
        do {
            if (resto < banconote[i]) {
                i++;
            } else {
                resto = resto - banconote[i];
                System.out.println("Ti stiamo dando una banconota di: " + banconote[i] + "\n nuovo resto: " + resto);
            }
        } while (resto != 0);
    }
}