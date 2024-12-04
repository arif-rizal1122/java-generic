package genericMethod;

public class App {
    public static void main(String[] args) {

        String[] names = {"arif", "rizal", "aja"};
        Integer[] values = {1, 2, 3, 4};

        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.<Integer>count(values));

    }
}
