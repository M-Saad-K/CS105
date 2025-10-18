import java.io.FileNotFoundException;

public class Driver {
    public static void main(String[] args) throws FileNotFoundException {
        /*

        ->    Array run code

        ArrayTest eggs = new ArrayTest();
        eggs.getHowmany();
        eggs.getValue(3);
        eggs.getMultiplesOfTwo();
        eggs.printAll();
        eggs.searchfor(6);

         */
        /*

        ->      File Reading Code

        ReadingandWriter reading = new ReadingandWriter();
        reading.readFile();

         */


        /*
        FunctionalProcessing JurassicPark = new FunctionalProcessing();
        JurassicPark.addDinosaur("T-rex", "Raptor", "Traceratops");
        //JurassicPark.getDetails();
        //JurassicPark.removeDino("Raptor");
        JurassicPark.getDino("spino");

        /*
        Dinosaurs.stream()
                .filter(JurassicPark -> "Trace".contains(JurassicPark.printDinosaurs()))
                .forEach(JurassicPark -> System.out.println(JurassicPark.getDetails()));

         */

        Hashes dinoHos = new Hashes();
        dinoHos.addDinoPatient("T-rex");
        dinoHos.getID("T-rex");

        dinoHos.addPreHistoricMammal("Dire Wolf");
        dinoHos.doWeHaveMammals("Dire Wolf");



    }

}
