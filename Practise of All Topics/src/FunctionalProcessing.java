import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import static java.util.Optional.empty;

public class FunctionalProcessing {

    ArrayList<String> Dinosaurs;

    public FunctionalProcessing() {

        Dinosaurs = new ArrayList<String>();
    }

    public void addDinosaur(String d1, String d2, String d3) {
        Dinosaurs.add(d1);
        Dinosaurs.add(d2);
        Dinosaurs.add(d3);
    }

    public void getDetails(){

        System.out.println("Number of dinosaurs sick: " + Dinosaurs.size());
        int Rexindex = 0;
        int RapIndex = 0;
        int TraIndex = 0;
        int index = 0;
        while(index < Dinosaurs.size()) {

            if(Dinosaurs.get(index).toLowerCase().contains("rex")) {
                Rexindex += 1;
            } else if(Dinosaurs.get(index).toLowerCase().contains("rap")) {
                RapIndex += 1;
            } else {
                TraIndex += 1;
            }

            index++;
        }

        System.out.println("Number of T-rexes: " + Rexindex);
        System.out.println("Number of Raptors: " + RapIndex);
        System.out.println("Number of Traceratops: " + TraIndex);


        Dinosaurs.forEach(

                record -> System.out.println(record));



    }

    public String getDino(String Dino) {
        /*
        for(String record: Dinosaurs) {
            if(record.contains(Dino)){

                System.out.println(record);
                return record;
            }
        }

         */

        for(int i = 0; i < Dinosaurs.size(); i++){

            if(Dinosaurs.get(i).toLowerCase().contains(Dino.trim().toLowerCase())){
                return Dinosaurs.get(i);
            }
        }

        return null;
    }

    public void removeDino(String exDino) throws IOException {

        for (String record : Dinosaurs) {
            if (record.toLowerCase().contains(exDino.toLowerCase())) {
                Dinosaurs.remove(record);
                Dinosaurs.forEach(
                        CurrentDinos -> System.out.println(CurrentDinos));
            } else {

                throw new IOException("Dinosaur species not in hospital!");

            }
        }

    }

    public void printDinosaurs(){
        Dinosaurs.forEach(
                record -> System.out.println(record)
        );

    }



}
