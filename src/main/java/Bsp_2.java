import javax.xml.bind.SchemaOutputResolver;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class Bsp_2 implements Callable<Integer>{
    public static  int limit;

    public static void main2(String[] args) throws InterruptedException, ExecutionException {
        Scanner s = new Scanner(System.in);
        int erg = 0;
        Bsp_2 thread = new Bsp_2();
        System.out.println("n>");
        String inString = s.nextLine();
        int n = Integer.parseInt(inString);
        int firstNumber = Integer.parseInt(inString.substring(0,1));

        ExecutorService executer = Executors.newScheduledThreadPool(firstNumber+1);
        List<Callable<Integer>> callables = new LinkedList<>();

        for(int i= 1; i<= firstNumber; i++){
            limit = n / (firstNumber +1);
            callables.add(thread);

            for(Future<Integer> future : executer.invokeAll(callables)){
                erg =  erg+ future.get();
            }
        }

        executer.shutdown();
        System.out.println(erg);
    }

    @Override
    public Integer call() throws Exception {
        int run = 0;
        for(int i = 1; i < limit; i++){
            run = run +1;
        }
        return run;
    }
}
