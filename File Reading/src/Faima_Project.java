import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * What were the most interesting topics from Mr Python
 *
 * @author Faima Khan
 */

public class Faima_Project {

    private ArrayList<String> input;
    private ArrayList<Integer> brek;
    public Faima_Project() {
        this.input = new ArrayList<>();
        this.brek = new ArrayList<>();
    }

    /**
     * Method to read the file -> Opinions.txt
     */
    public void readOpinion() {
        // Start of Method
        try(Scanner read = new Scanner(new File("Opinions.rtf"))) {
            while(read.hasNext()){

                String current =String.valueOf(read.nextLine()); // Read next line
                input.add(current); // Add it the ArrayList
            }
            read.close(); // Always close the scanner
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
        // End of Method
    }

    /*

    public void writeOpinion() {
        //Start of Method
        try(
                FileWriter write = new FileWriter("MrPythonFavVideos.txt");
                BufferedWriter bw = new BufferedWriter(write)
        ) {
            // Checks for Semi Colons, so to intialise bw.newLine();
            // Start
            Scanner semiColon = new Scanner(new File("Opinions.rtf"));
            int semiIndex = 0;  // Entering when brek happens
            while(semiColon.hasNextLine()){

                if (semiColon.nextLine().equals(";")){
                    semiIndex++; // Increment semiIndex
                    brek.add(semiIndex); // The point of break, is added to brek ArrayList
                } else {
                    semiIndex++;
                }
            }
            // End of Odd Function
                int brekIndex = 0;

                for (int i = 0; i < input.size(); i++) {
                    // To prevent Out of Bounds Exception:
                    if (brekIndex > brek.size()) {
                        ; // Do nothing
                    }  else {
                        if (brek.get(brekIndex) == i) {
                        bw.newLine(); // Adding a new line
                        brekIndex++; // Incrementing the index to the next value of the brek ArrayList
                             } else {
                            bw.write(input.get(i));
                            }
                    }


                }
        }
        catch(IOException e){
            System.out.println("IO Exception");
        }
        // End of Method
    }

     */

    public void writeOpinion() {
        try (
                FileWriter write = new FileWriter("MrPythonFavVideos.txt");
                BufferedWriter bw = new BufferedWriter(write);
                Scanner semiColon = new Scanner(new File("Opinions.rtf"))
        ) {
            int semiIndex = 0;
            int lineCounter = 0;

            while (semiColon.hasNextLine()) {
                String line = semiColon.nextLine();
                if (line.trim().equals(";")) {
                    brek.add(lineCounter);  // mark the position in terms of input lines
                } else {
                    lineCounter++;  // only increment for real lines stored in `input`
                }
            }

            int brekIndex = 0;
            for (int i = 0; i < input.size(); i++) {
                if (brekIndex < brek.size() && brek.get(brekIndex) == i) {
                    bw.newLine(); // insert line break
                    brekIndex++;
                }
                bw.write(input.get(i));
                bw.newLine(); // always write the line + newline
            }

        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }

}