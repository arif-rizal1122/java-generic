package invariant;

import genericClass.MyDataT;

public class App {
    public static void main(String[] args) {

        MyDataT<String> dataString = new MyDataT<>("astaga");
        // MyDataT<Object> objectMyDataT = dataString;
        MyDataT<Object> objectMyDataT = new MyDataT<>(90);
        // MyDataT<Integer> dataInt = objectMyDataT;
        // doIt(objectMyDataT);

    }


    public static void doIt(MyDataT<Integer> objectMyDataT){

    }
}
