package DataWriters;

import java.io.FileWriter;
import java.io.IOException;

public class NotepadWriter {
   private static FileWriter writer;

    public static void printTestValuesToNotepad(String filepath, String valueToBePrinted) {

        try {
            writer = new FileWriter(filepath,true);
            writer.write(valueToBePrinted+ "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the notepad.");
            e.printStackTrace();
        }
    }
}

