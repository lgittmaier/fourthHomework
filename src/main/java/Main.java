import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner s = new Scanner(System.in);
        System.out.println("Welches Bsp wollen Sie aufrufen? (1,2)");
        int in = Integer.parseInt(s.nextLine());
        switch(in){
            case 1:
                Bsp_1.main1(args);
                break;
            case 2:
                Bsp_2.main2(args);
                break;
            default:
                System.out.println("Falsche Eingabe!");
        }
    }
}
