/* Iterable that can iterate over the collection’s items.
The Iterable interface has a default method called “forEach.”
Collection classes use it to iterate items, which extends the Iterable interface.
You may send Lambda Expression as an argument to the “forEach” method, which accepts
the Functional Interface as a single parameter.
ForEach() loop can be used in a collection class that extends the interface Iterable.
Since this method inputs a single parameter, a lambda expression can also be passed as a parameter.
 */

package forEachMethod;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> subList = new ArrayList<>();
        subList.add("Carrot ");
        subList.add("Potato ");
        subList.add("Cauliflower ");
        subList.add("LadyFinger ");
        subList.add("Tomato\n");
        System.out.println("------------Vegetable List--------------");
        subList.forEach(System.out::print);
        //OR  subList.forEach(sub -> System.out.println(sub));

        List<Integer> list1 = new ArrayList<>();
        list1.add(90);
        list1.add(80);
        list1.add(70);
        list1.add(60);
        list1.add(50);
        System.out.println("-------------Integer List---------------");
        list1.forEach(System.out::print);
        System.out.println();

        list1.forEach(sub -> System.out.print(sub + " "));
    }
}
