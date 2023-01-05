import java.io.*;
import java.util.*;

public class LeggiFile {
    public static void main(String[] args) {
        try {
            boolean ex = true;
            String alfa = " abcdefghijklmnopqrstuvwxyz";
            char alfabeto[] = alfa.toCharArray();
            int l = alfa.length();
            File newfile = new File("newfile.txt");
            if (newfile.exists()) {
            } else {
                newfile.createNewFile();
            }
            FileReader fr = new FileReader(newfile);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(newfile);
            fw.write("abcdefg");
            fw.close();
            do {
                int somm = 0, cont = 0, cont1 = 0;
                String line = br.readLine();
                if (line == null) {
                    ex = false;
                }
                char riga[] = line.toCharArray();
                int lunghezza = line.length();
                System.out.println("Riga non modificata: ");
                for (int i = 0; i < lunghezza; i++) {
                    System.out.print(riga[i]);
                }
                System.out.println();
                System.out.println("Riga modificata: ");
                for (char i : alfabeto) {
                    for (char j : riga) {
                        if (j == i) {
                            if (i % 2 == 0) {
                                somm += i;
                                cont1++;
                                System.out.print(j);
                            } else {
                                somm += i * 2;
                                cont++;
                                System.out.print(j);
                                System.out.print(j);
                            }
                        }

                    }
                }
                System.out.println();
                if (somm > 26) {
                    somm -= 26;
                }
                System.out.println("numero di lettere alterate: " + cont + " numero di lettere inalterate: " + cont1);
            } while (ex == false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
