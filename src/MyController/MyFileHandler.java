package MyController;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.text.ParseException;

public interface MyFileHandler {

        void read() throws ParserConfigurationException,
                SAXException, IOException, ParseException, org.json.simple.parser.ParseException;

//        void write(Employee emp) throws ParserConfigurationException, TransformerException,IOException ;

    }

