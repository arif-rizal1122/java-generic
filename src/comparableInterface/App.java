package comparableInterface;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Person[] people = {
                new Person("arif", "denmark"),
                new Person("adel", "jkt"),
        };
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }

}
