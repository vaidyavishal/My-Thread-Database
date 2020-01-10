package MyController;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.PrintWriter;
import java.io.FileWriter;

public class CSVFileHandler implements MyFileHandler{


    @Override
    public void read() throws IOException {
        String line;
        List<String> details =null;
        BufferedReader br = new BufferedReader(new FileReader("/Users/vaidyavishal/IdeaProjects/MyControllerDatabase/src/employee.csv"));
        while((line=br.readLine())!=null)
        {
            details = Arrays.asList(line.split(","));
            Employee emp = new Employee();
            emp.firstName = details.get(0);
            emp.lastName = details.get(1);
            Date date = new Date(details.get(2));
            emp.dateOfBirth = date;
            emp.experience = Double.parseDouble(details.get(3));

            MyCollection myCollection = MyCollection.getInstance();
            myCollection.add(emp);
        }
    }
//    @Override
//    public void write(Employee emp) throws IOException{
//        FileWriter f = new FileWriter("/Users/vaidyavishal/IdeaProjects/singleton/newEmployee.csv", true);
//        BufferedWriter b = new BufferedWriter(f);
//        PrintWriter p = new PrintWriter(b);
////        Iterator<Employee> iterator = list.iterator();
////        while(iterator.hasNext()) {
////            Employee emp = iterator.next();
//            String firstName = emp.firstName;
//            String lastName = emp.lastName;
//            Date dateOfBirth = emp.dateOfBirth;
//            Double experience = emp.experience;
//            String toWrite = new String();
//            toWrite = firstName + "," + lastName + "," + dateOfBirth + "," + experience + "\n";
////        System.out.println(toWrite);
//            p.write(toWrite);
//
//
////        }
//        p.close();
//    }




}
