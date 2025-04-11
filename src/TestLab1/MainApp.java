package TestLab1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> judete = new ArrayList<>();
        String fisIn = "judete_in.txt";
        try(BufferedReader judeteIn = new BufferedReader(new FileReader(fisIn))) {
            String line;
            while ((line = judeteIn.readLine()) != null) {
                judete.add(line);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        Collections.sort(judete);
        System.out.println(judete);
    }
}

//Fișierul judete_in.txt, conține lista neordonată a județelor din țară. Să se încarce
//datele din fișier într-un tablou de String-uri și să se ordoneze acest tablou cu ajutorul metodei
//sort() din clasa Arrays. Să se returneze pe ce poziție se află în vectorul ordonat un județ
//introdus de la tastatură. Se va utiliza metoda de căutare binară din clasa Arrays.