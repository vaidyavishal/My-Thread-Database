//package MyController;
//
//import org.xml.sax.SAXException;
//
//import javax.xml.parsers.ParserConfigurationException;
//import javax.xml.transform.TransformerConfigurationException;
//import javax.xml.transform.TransformerException;
//import java.io.IOException;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//
//public class Test {
//    public static void main(String[] args) throws ParserConfigurationException, SAXException, ParseException, IOException, TransformerException {
//        XmlReadAndWrite xmlReadAndWrite = new XmlReadAndWrite();
//        xmlReadAndWrite.read();
//        Employee employee = new Employee();
//        employee.setFirstName("Raghav");
//        employee.setLastName("Agarwal");
//        employee.setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy").parse("16/09/1998"));
//        employee.setExperience(2);
//        xmlReadAndWrite.addToList(employee);
//        employee = new Employee();
//        employee.setFirstName("Paarth");
//        employee.setLastName("Dixit");
//        employee.setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy").parse("22/11/1998"));
//        employee.setExperience(23);
//        xmlReadAndWrite.addToList(employee);
//        xmlReadAndWrite.write();
//    }
//}
