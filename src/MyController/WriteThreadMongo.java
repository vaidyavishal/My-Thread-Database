package MyController;

import java.io.IOException;

public class WriteThreadMongo extends Thread {
    @Override
    public void run() {
        MyCollection myCollection = MyCollection.getInstance();
        Mongo mongo = new Mongo();
        mongo.connectDatabase();
        for(int Counter=0;Counter<200;Counter++)
            mongo.insert(myCollection.get());
    }
}
