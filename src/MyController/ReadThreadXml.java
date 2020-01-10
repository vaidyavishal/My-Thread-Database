package MyController;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.ParseException;

public class ReadThreadXml extends Thread{
    public void run()
    {
        XmlReadAndWrite xmlReadAndWrite = new XmlReadAndWrite();
        try {
            xmlReadAndWrite.read();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
