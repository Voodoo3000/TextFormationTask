package kz.epam.thirdtask;

import java.io.*;

/**
 * Created by Voodoo3000 on 07.07.2017.
 */
public class OutboundStream {

    private static final String OUTPUT_TXTFILE = "textresult.txt";

    public void txtWriter(String text) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(OUTPUT_TXTFILE, true);
            fileOutputStream.write(text.getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
