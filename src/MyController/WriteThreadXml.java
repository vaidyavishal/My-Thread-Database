//package MyController;
//
//import javax.xml.parsers.ParserConfigurationException;
//import javax.xml.transform.TransformerException;
//
//public class WriteThreadXml extends Thread {
//    @Override
//    public void run() {
//        MyCollection myCollection = MyCollection.getInstance();
//        XmlReadAndWrite xmlReadAndWrite = new XmlReadAndWrite();
//
//        for(int Counter=0;Counter<100;Counter++)
//        {
//            Employee emp = myCollection.get();
////                for (int i=1;i<100;i++){}
//            try {
//                xmlReadAndWrite.write(emp);
//            } catch (ParserConfigurationException e) {
//                e.printStackTrace();
//            } catch (TransformerException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }
//}
