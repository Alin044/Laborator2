package Ex3;

public class Vers {
    private String vers;
    private String vocale = "aeiouAEIOU";

    public Vers(String v){
        this.vers = v;
    }

    public String getVers(){
        return vers;
    }

    public int numarCuvinte(){
        int count = 0;
        boolean spaceing = false;

        for(char c : vers.toCharArray()){
            if(Character.isLetter(c)){
                if(!spaceing){
                    count++;
                    spaceing = true;
                }
            }else{
                spaceing = false;
            }
        }
        return count;
    }

    public int numarVocale(){
        int count = 0;

        for(char c : vers.toCharArray()){
            for(char v : vocale.toCharArray()){
                if(c == v){
                    count++;
                }
            }
        }
        return count;
    }

}


//Se va defini o clasă Vers + , care are o variabilă membră privată un șir de caractere +
//reprezentând versul și se va dezvolta câte un operator pentru fiecare cerință de mai sus (o
//metodă care returnează numărul de cuvinte, o metodă care returnează numărul de vocale, etc).
//Se va crea un vector de obiecte de tip Vers care va conține informația preluată din fișierul de
//intrare.