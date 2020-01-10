package MyController;

import java.util.ArrayList;

public class MyCollection {
    private  Employee[] arrayList = new Employee[300];
    private  int writeCounter=0;
    private  int readCounter=0;
    private static final Object lock = new Object();
    private static MyCollection instance = null;

    private MyCollection(){

    }

    public static MyCollection getInstance()
    {
        if (instance == null)
            synchronized (lock) {
                if (instance==null){
                    instance = new MyCollection();
            }
    }
    return instance;
    }

    public void add(Employee newEmployeeObject){
        if(writeCounter < 300) {
            synchronized (lock) {
                arrayList[writeCounter] = newEmployeeObject;
                writeCounter++;
            }
        }
    }
    public void Display(){
        for(int i=0;i<writeCounter;i++)
            System.out.println(arrayList[i]);
    }
    public  void getWriteCounter() {
        System.out.println(writeCounter);
    }
    public  Employee get(){
        synchronized (lock) {
            return arrayList[readCounter++];
        }
    }

}
