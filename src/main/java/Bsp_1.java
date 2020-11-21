import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Bsp_1 implements Runnable{
    public static List<Integer> list = new ArrayList<>();
    public static int divider;

    public static void main1(String[] args){
        Scanner s = new Scanner(System.in);

        try(BufferedReader br = new BufferedReader(new FileReader("numbers.csv"))) {
            while (br.ready()) {
                String[] line = br.readLine().split(":");
                for(int i = 0; i < line.length; i++){
                    if(isNumber(line[i])){
                        list.add(Integer.parseInt(line[i]));
                    }
                }
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        System.out.println("chunks: ");
        int chunks = Integer.parseInt(s.nextLine());
        System.out.println("Divider: ");
        divider = Integer.parseInt(s.nextLine());

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(chunks);
        for(int i = 1; i <= chunks; i++){
            Bsp_1 b1 = new Bsp_1();
            executor.execute(b1);
            executor.shutdown();
        }

    }

    public static boolean isNumber(String number){
        try {
            int i = Integer.parseInt(number);
        }catch(NumberFormatException n){
            return false;
        }
        return true;
    }


    @Override
    public void run() {
        for(int i = 0; i < list.size(); i++){
            if((list.get(i) % divider) == 0){
                System.out.println(list.get(i).toString());
            }
        }
    }
}
