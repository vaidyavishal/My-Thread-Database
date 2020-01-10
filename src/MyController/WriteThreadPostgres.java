package MyController;

import java.io.IOException;
import java.sql.SQLException;

public class WriteThreadPostgres extends Thread {
    @Override
    public void run() {
        MyCollection myCollection = MyCollection.getInstance();
        Postgres postgres = new Postgres();
        try {
            postgres.connections();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for(int Counter=0;Counter<100;Counter++) {
            try {
                postgres.insert(myCollection.get());
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
