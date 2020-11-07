import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamTester {

    private static int getCountEmptyString(List<String> strings){
        return (int) strings.stream().filter(String::isEmpty).count();
    }

    private static int getCountLength(List<String> strings){
        return (int) strings.stream().map(x -> x.toString().length()).count(); //Not sure if it works
    }

    private static List<String> deleteEmptyStringsUsingJava7(List<String> strings){
        return strings.stream().filter(String::isEmpty).collect(Collectors.toList());
    }

    private static String getMergedString(List<String> strings, String seperator){
       //return strings.stream().
        return null;
    }

    private static List<Integer> getSquares(List<Integer> numbers){
        return Collections.singletonList(numbers.stream().mapToInt(x -> x * x).sum()); //singletonList returns specified objectts
    }

    private static int getMax(List<Integer> numbers){
        return numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
    }

    private static int getMin(List<Integer> numbers){
        return numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
    }

    private static int getSum(List<Integer> numbers){
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    private static int getAvarage(List<Integer> numbers){
        return (int) numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
    }
}
