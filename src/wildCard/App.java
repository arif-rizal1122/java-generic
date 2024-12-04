package wildCard;

import boundedParameter.MultipleConstraintApp;
import genericClass.MyDataT;

public class App {
    public static void main(String[] args) {

        printLenght(new MyDataT<>(100));
        printLenght(new MyDataT<>("eki"));
        printLenght(new MyDataT<>(true));
        printLenght(new MyDataT<>(new MultipleConstraintApp.Manager()));

    }

    public static void printLenght(MyDataT<?> data){
        System.out.println(data.getData());
    }

}
