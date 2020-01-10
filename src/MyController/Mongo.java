package MyController;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import org.bson.Document;
import com.mongodb.client.MongoCollection;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Mongo {
    private MongoClient mongoClient;
    private MongoCredential mongoCredential;
    private MongoDatabase mongoDatabase;
    public void connectDatabase(){
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.SEVERE);


        mongoClient = new MongoClient( "localhost" , 27017 );
        mongoCredential = MongoCredential.createCredential("training", "trainingdb", "training".toCharArray());
        mongoDatabase = mongoClient.getDatabase("trainingdb");
    }
//    public void createCollection(String name){
//        mongoDatabase.createCollection(name);
//        System.out.println("Collection created successfully");
//    }
    public void insert(Employee employee){

        MongoCollection<Document> collection = mongoDatabase.getCollection("employee");
        Document document = new Document()
                .append("firstName",employee.getFirstName())
                .append("lastName", employee.getLastName())
                .append("dateOfBirth", employee.getDateOfBirth())
                .append("experience",employee.getExperience());
        collection.insertOne(document);
        System.out.println("Document inserted successfully");
    }

}
