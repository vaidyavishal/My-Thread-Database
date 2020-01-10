package MyController;

//import java.io.FileNotFoundException;
import java.io.IOException;
//import java.io.PrintWriter;
import java.text.SimpleDateFormat;
//import java.util.*;

import org.json.simple.JSONArray;
import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.FileWriter;
//import java.io.IOException;


public class JsonReadAndWrite implements MyFileHandler{
    MyCollection myCollection = MyCollection.getInstance();

    public void read() throws IOException, ParseException, java.text.ParseException {
        JSONParser parser = new JSONParser();
        JSONArray array = (JSONArray) parser.parse(new FileReader("/Users/vaidyavishal/IdeaProjects/MyControllerDatabase/src/MyController/employee.json"));

        for (Object o : array) {
            JSONObject employee = (JSONObject) o;

            String firstname = (String) employee.get("firstName");

            String lastname = (String) employee.get("lastName");

            String dateOfBirth = (String) employee.get("dateOfBirth");

            Long experience = (Long) employee.get("experience");

            Employee emp = new Employee();
            emp.setFirstName(firstname);
            emp.setLastName(lastname);
            emp.setExperience(experience);
            emp.setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth));
            emp.setMiddleName("");
            emp.setTitle("");
            emp.setDepartmentName("");


//            MyCollection myCollection = MyCollection.getInstance();
            myCollection.add(emp);



        }
    }



//    public void write(Employee emp) throws IOException {
//        FileWriter file = new FileWriter("employeesJSONWrite.json",true);
//        JSONArray employeeList = new JSONArray();
//
////        for(int i = 0; i < 100; i++){
////            Employee emp = myCollection.get();
//        JSONObject jo = new JSONObject();
//        jo.put("firstName", emp.getFirstName());
//        jo.put("lastName", emp.getLastName());
//        jo.put("experience",emp.getExperience());
//        jo.put("dateOfBirth",new SimpleDateFormat("dd/MM/yyyy").format(emp.getDateOfBirth()));
//        JSONObject employeeObject = new JSONObject();
//        employeeObject.put("employee", jo);
//        employeeList.add(employeeObject);
////        }
//
//        file.write(employeeList.toJSONString());
//        file.flush();
//    }

}
