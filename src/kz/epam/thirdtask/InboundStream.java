package kz.epam.thirdtask;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Voodoo3000 on 07.07.2017.
 */
public class InboundStream {

    public String txtReader(String INPUT_FILE) {

        int b = 0;
        String text = "";
        
        try {
            FileInputStream fis = new FileInputStream(INPUT_FILE);
            InputStreamReader isr = new InputStreamReader(fis, "cp1251");
            while ((b = isr.read()) != -1){
                text += (char) b;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
