import java.util.LinkedList;

public class Q10_LinkedListPrint {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Roorkee");
        cities.add("Haridwar");
        cities.add("Dehradun");

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
