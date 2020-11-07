import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bsp_2 {
    public void run(){
        Scanner s = new Scanner(System.in);
        System.out.println("n>");
        int n = Integer.parseInt(s.nextLine());
        ExecutorService exec = Executors.newScheduledThreadPool(n+1);
        List<Callable<Integer>> callables = new LinkedList<>();
        Thread t = new Thread();
        
        int sum = (n*(n+1))/2;
        System.out.println(sum);
    }
}
