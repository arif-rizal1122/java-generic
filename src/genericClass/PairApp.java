package genericClass;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, String> pairStr = new Pair<>("arif", "rizal");
        Pair<String, Integer> pairCampur = new Pair<>("auhh", 90);

        System.out.println(pairStr);
        System.out.println(pairCampur);
    }
}
