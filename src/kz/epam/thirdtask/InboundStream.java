package kz.epam.thirdtask;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Voodoo3000 on 07.07.2017.
 */
public class InboundStream {

    private static final String INPUT_TXTFILE = "textin.txt";
    private static final String TXTFILE_UNICODE = "UTF-8";

    public String txtReader() {

        int b = 0;
        String txt = "";

        try {
            FileInputStream fis = new FileInputStream(INPUT_TXTFILE);
            InputStreamReader isr = new InputStreamReader(fis, TXTFILE_UNICODE);
            while ((b = isr.read()) != -1) {
                txt += (char) b;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return txt;
    }
}
