import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TableUsingStream {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of which table you want to print in reverse order: ");
        int number=sc.nextInt();
        int start=1;
        int end=11;
        //IntStream.range(start,end).map(e->(start+(end-1-e))*number).forEach(e-> System.out.println(e));
        System.out.println( IntStream.range(start,end).map(e->(start+(end-1-e))*number).boxed().collect(Collectors.toList()));

    }
}
