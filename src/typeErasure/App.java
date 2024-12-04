package typeErasure;

import genericClass.MyDataT;

public class App {
    public static void main(String[] args) {

        MyDataT myDataT = new MyDataT<>("arif");
        MyDataT<Integer> integerMyDataT = (MyDataT<Integer>) myDataT;
        myDataT.setData(100);



    }
}
