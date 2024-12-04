package covariant;

import genericClass.MyDataT;

public class App {
    public static void main(String[] args) {

        MyDataT<String> dataStr= new MyDataT<>("arif");
        process(dataStr);
        MyDataT<? extends Object> mydata = dataStr;
        System.out.println(mydata.getData());

    }
    public static void process(MyDataT<? extends Object> data){
        Object o = data.getData();
        //data.setData("arif"); // error
        System.out.println(o);


    }
}