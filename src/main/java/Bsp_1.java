import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bsp_1 {
    public void run(int[] list){
       Scanner s = new Scanner(System.in);

        System.out.println("Divider: ");
        int divider = Integer.parseInt(s.nextLine());

        for(int i = 0; i< list.length; i++){
            if(list[i] % divider == 0){
                System.out.println(list[i]);
            }
        }
    }


}
