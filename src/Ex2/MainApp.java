package Ex2;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        String numeFisIn = "cantex_in.txt";
        String numeFisOut = "cantex_out.txt";
        List<String> cantec = new ArrayList<>();
        try{
            String line;
            BufferedReader tempIn = new BufferedReader(new FileReader(numeFisIn));
            while((line = tempIn.readLine()) != null){
                cantec.add(line);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        int[] numOfWords;
        int numOfVowels;

        for(String s : cantec){
            
        }
    }
}



//Fișierul cantec_in.txt conține versurile unui cântec la alegere. Să se scrie un
//program care creează fișierul cantec_out.txt, care conține versurile cântecului original dar în
//plus în dreptul fiecărui rând sunt afișate numărul de cuvinte de pe rând şi numărul de vocale
//de pe fiecare rând. În dreptul rândurilor care se încheie cu o grupare de litere aleasă se va
//pune o steluță (*). Rândurile pentru care un număr generat aleator este mai mic decât 0.1 vor
//fi scrise cu majuscule (se vor genera aleator numere între 0 şi 1).