import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("Testing Jenkins...!!");
        List<Integer> val= Arrays.asList(2,7,43,6,3);
        System.out.println("Initial List...!!");
        val.stream().forEach(i->System.out.print(i+" "));

        System.out.println("Map Opeartion...!!");

      List<Integer> res=val.stream().map(x->x+1).collect(Collectors.toList());
        res.stream().forEach(i->System.out.print(i+" "));

        System.out.println("Filter List...!!");

        System.out.println(val.stream().filter(x->x%2==0).collect(Collectors.toList()));


        int even
                = val.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, (ans, i) -> ans + i);


        System.out.println(even);

    }
}