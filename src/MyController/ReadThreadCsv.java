package MyController;

import java.io.IOException;

public class ReadThreadCsv extends Thread {
    @Override
    public void run() {
        CSVFileHandler csvFileHandler = new CSVFileHandler();
        try {
            csvFileHandler.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
