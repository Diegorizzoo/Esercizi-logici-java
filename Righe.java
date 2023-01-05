import java.io.*;
import java.util.Scanner;

public class Righe {
    public static void main(String[] args) {
        try {
            Scanner t = new Scanner(System.in);
            File newfile = new File("newfile.txt");
            FileReader fr = new FileReader(newfile);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(newfile);
            if (newfile.exists()) {
            } else {
                newfile.createNewFile();
            }
            String riga = "";
            int p = 0;
            while (riga.compareTo("stop") != 0) {
                System.out.println("Inserisci parola o digita stop per fermarti: ");
                riga = t.nextLine();
                if (riga.compareTo("stop") != 0) {
                    fw.write(riga + '\n');
                }
                System.out.println("è stata scritta la riga n " + (p + 1));
                int lunghezza = riga.length();
                char v[] = riga.toCharArray();
                int lung = lunghezza / 2, j = lung;
                if (lunghezza % 2 == 0) {
                    for (int i = lung - 1; i > -1; i--) {
                        System.out.print(v[i]);
                        System.out.print(v[j]);
                        j++;
                    }
                } else {
                    for (int i = lung; i > -1; i--) {
                        System.out.print(v[i]);
                        if (j != lung) {
                            System.out.print(v[j]);
                        }
                        j++;
                    }

                }
                System.out.println(" ");
                p++;
            }
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
