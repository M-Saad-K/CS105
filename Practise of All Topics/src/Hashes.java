import java.util.HashMap;
import java.util.Random;
import java.util.HashSet;

public class Hashes {

    HashMap<String, String> DinoPatients = new HashMap<String, String>();
    HashSet<String> PreHistoric_Mammals = new HashSet<String>();

    public Hashes() {

    }
    public void addDinoPatient(String dino) {
        Random rand = new Random();
        int id = rand.nextInt(2);
        DinoPatients.put(dino, String.valueOf(id));

    }

    public void addPreHistoricMammal(String mammal) {

        PreHistoric_Mammals.add(mammal);
    }

    public void doWeHaveMammals(String search){
        String isearch = search;
        if (PreHistoric_Mammals.contains(isearch)){
            System.out.println("Yes we do");
        } else {
            System.out.println("No we don't");
        }
    }
    public void getID(String patient){
        for(int i = 0; i < DinoPatients.size(); i++){
            if(DinoPatients.containsKey(patient.trim())){

                String IDFound = DinoPatients.get(patient);
                System.out.println("Patient searched was " + DinoPatients.keySet() + " ID: " + IDFound);
            }

        }
    }



}

