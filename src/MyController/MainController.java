package MyController;

public class MainController {
    public static void main(String[] args) throws InterruptedException {
        ReadThreadCsv readThreadCsv = new ReadThreadCsv();
        ReadThreadJson readThreadJson = new ReadThreadJson();
        ReadThreadXml readThreadXml = new ReadThreadXml();
        readThreadCsv.start();
        readThreadJson.start();
//        System.out.println("Hello");


        readThreadXml.start();
        readThreadCsv.join();
        readThreadJson.join();
        readThreadXml.join();
//        readThreadXml.join();
        MyCollection mycollection = MyCollection.getInstance();
        mycollection.getWriteCounter();
        mycollection.Display();
        WriteThreadMongo writeThreadMongo = new WriteThreadMongo();
        WriteThreadPostgres writeThreadPostgres = new WriteThreadPostgres();
//        WriteThreadXml writeThreadXml = new WriteThreadXml();
        writeThreadMongo.start();
        writeThreadPostgres.start();
//        writeThreadXml.start();
        writeThreadMongo.join();
        writeThreadPostgres.join();
//        writeThreadXml.join();
    }
}
