package kz.epam.thirdtask;

import java.io.*;

/**
 * Created by Voodoo3000 on 07.07.2017.
 */
public class OutboundStream {

    public void txtWriter (String s, String OUTPUT_FILE) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(OUTPUT_FILE, true);
            fileWriter.write(s);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
