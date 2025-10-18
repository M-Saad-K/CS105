import java.io.*;
import java.util.Scanner;

public class ReadingandWriter {

    public void readFile(){
         /*

         -> This is Bro Code's code


        try{

            FileReader reader = new FileReader("Test.txt");
            int data = reader.read();

            while(data != - 1){

                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {

            System.out.println("File Not Found");
        } catch(IOException e){

            System.out.println("You got a... IO Exception, would you like that with fries or nuggets?");
        }

          */



        /*

        Class Code


        try (Scanner scan = new Scanner(new File("Test.txt"))){

            while (scan.hasNextLine()){

                System.out.print(scan.nextLine());
            }
        } catch(FileNotFoundException e) {

            System.out.println("File not found");
        }

         */

        // Now lets do text output!!!

        try(FileWriter writer = new FileWriter("MrPython2.txt");
        BufferedWriter buff = new BufferedWriter(writer)){
            int data = 0;
            while(data != 4){

                buff.write("Hi there, I'm Mr Python. \n");
                buff.write("These are my students: Liam, Han, Isla, and Faima");

                buff.newLine();

                data += 1;
                System.out.println("index: " + data);
            }

            System.out.println(buff);


        } catch(IOException e){

            System.out.println("Naw");
        }
    }

}
