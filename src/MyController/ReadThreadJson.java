package MyController;

import java.io.IOException;
import java.text.ParseException;

public class ReadThreadJson extends Thread {
    public void run(){
        JsonReadAndWrite jsonReadAndWrite = new JsonReadAndWrite();
        try {
            jsonReadAndWrite.read();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
