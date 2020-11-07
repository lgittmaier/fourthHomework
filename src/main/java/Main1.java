import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
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


        Bsp_1 uno = new Bsp_1();

        //uno.run();

        Bsp_2 dos = new Bsp_2();
        dos.run();
    }

    public static boolean isNumber(String number){
        try {
            int i = Integer.parseInt(number);
        }catch(NumberFormatException n){
            return false;
        }
        return true;
    }
}

