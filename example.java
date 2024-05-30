import java.util.LinkedList;
import java.util.List;

public class example {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        numbers.add(1,4);
        numbers.forEach(System.out::println);

        int number = numbers.get(0);
        System.out.println(number);

        boolean found = numbers.contains(4);
        System.out.println(found);

        int index = numbers.indexOf(3);
        numbers.remove(index);

        numbers.forEach(System.out::println);
    }
    
}
