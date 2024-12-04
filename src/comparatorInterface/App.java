package comparatorInterface;


import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        Person[] people = {
                new Person("arif", "denmark"),
                new Person("adel", "jkt"),
        };
        // Arrays.sort(people);
        // System.out.println(Arrays.toString(people));

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Arrays.sort(people, comparator);
        System.out.println(Arrays.toString(people));
    }
}
