package genericClass;

public class App {
    public static void main(String[] args) {

        MyDataT<String> myDataTString = new MyDataT<String>("arif");
        MyDataT<Integer> myDataTInteger = new MyDataT<>(90);

        String stringValue = myDataTString.getData();
        Integer integerValue = myDataTInteger.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);

    }
}
