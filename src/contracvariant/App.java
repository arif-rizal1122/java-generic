package contracvariant;

import genericClass.MyDataT;

public class App {
    public static void main(String[] args) {

        MyDataT<Object> objectStr = new MyDataT<>("arif");
        MyDataT<? super String> myData = objectStr;
        process(myData);
        System.out.println(myData.getData());
    }

    public static void process(MyDataT<? super String> myData){
        String value = (String) myData.getData();
        System.out.println("proccess get data " + value); // arif
        myData.setData("rizal");


    }

}
