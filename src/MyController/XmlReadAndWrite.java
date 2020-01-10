package MyController;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlReadAndWrite implements MyFileHandler{
 boolean flag = false;
 Element root;
 int count = 0;
 DocumentBuilderFactory documentFactory ;
 DocumentBuilder documentBuilder ;
 Document document ;

    @Override
    public void read() throws ParserConfigurationException,
            SAXException, IOException, ParseException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse(new File("/Users/vaidyavishal/IdeaProjects/MyControllerDatabase/src/MyController/employee.xml"));

        NodeList nodeList = document.getDocumentElement().getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element elem = (Element) node;

                String firstname = elem.getElementsByTagName("firstName")
                        .item(0).getChildNodes().item(0).getNodeValue();

                String lastname = elem.getElementsByTagName("lastName").item(0)
                        .getChildNodes().item(0).getNodeValue();

                Integer experience = Integer.parseInt(elem.getElementsByTagName("experience")
                        .item(0).getChildNodes().item(0).getNodeValue());

                String dateOfBirth = elem.getElementsByTagName("dateOfBirth")
                        .item(0).getChildNodes().item(0).getNodeValue();

                Employee emp = new Employee();
                emp.setFirstName(firstname);
                emp.setLastName(lastname);
                emp.setExperience(experience);
                emp.setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth));
                emp.setMiddleName("");
                emp.setTitle("");
                emp.setDepartmentName("");

//                System.out.println(emp);
                MyCollection myCollection = MyCollection.getInstance();
                myCollection.add(emp);
            }
        }
    }


//    @Override
//    public void write(Employee emp) throws ParserConfigurationException, TransformerException {
//
//        if(flag==false) {
//            documentFactory = DocumentBuilderFactory.newInstance();
//            documentBuilder = documentFactory.newDocumentBuilder();
//            document = documentBuilder.newDocument();
//
//            root = document.createElement("employees");
//            document.appendChild(root);
//
//            Element employee = document.createElement("employee");
//            root.appendChild(employee);
//
//            Element firstName = document.createElement("firstname");
//            firstName.appendChild(document.createTextNode(emp.getFirstName()));
//            employee.appendChild(firstName);
//
//            Element lastname = document.createElement("lastname");
//            lastname.appendChild(document.createTextNode(emp.getLastName()));
//            employee.appendChild(lastname);
//
//            Element experience = document.createElement("experience");
//            experience.appendChild(document.createTextNode(emp.getExperience() + ""));
//            employee.appendChild(experience);
//
//            Element dateOfBirth = document.createElement("DateOfBirth");
//            dateOfBirth.appendChild(document.createTextNode(new SimpleDateFormat("dd/MM/yyyy").format(emp.getDateOfBirth())));
//            employee.appendChild(dateOfBirth);
//            flag = true;
//            count++;
//        }
//
//        else {
//
//            Element employee = document.createElement("employee");
//            root.appendChild(employee);
//
//            Element firstName = document.createElement("firstname");
//            firstName.appendChild(document.createTextNode(emp.getFirstName()));
//            employee.appendChild(firstName);
//
//            Element lastname = document.createElement("lastname");
//            lastname.appendChild(document.createTextNode(emp.getLastName()));
//            employee.appendChild(lastname);
//
//            Element experience = document.createElement("experience");
//            experience.appendChild(document.createTextNode(emp.getExperience() + ""));
//            employee.appendChild(experience);
//
//            Element dateOfBirth = document.createElement("DateOfBirth");
//            dateOfBirth.appendChild(document.createTextNode(new SimpleDateFormat("dd/MM/yyyy").format(emp.getDateOfBirth())));
//            employee.appendChild(dateOfBirth);
//            count++;
//        }
//        if(count>=100)
//        {
//
//        TransformerFactory transformerFactory = TransformerFactory.newInstance();
//        Transformer transformer = transformerFactory.newTransformer();
//        DOMSource domSource = new DOMSource(document);
//        StreamResult streamResult = new StreamResult(new File("/Users/vaidyavishal/IdeaProjects/singleton/employeeWrite.xml"));
//        transformer.transform(domSource, streamResult);
//        }
//        }

}
