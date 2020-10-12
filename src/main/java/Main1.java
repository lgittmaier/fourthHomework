import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        List<List<String>> list = new ArrayList<List<String>>();
        try(BufferedReader br = new BufferedReader(new FileReader("numbers.csv"))){
            String line;
            while((line = br.readLine()) != null){
                String[] values = line.split(";");
                list.add(Arrays.asList(values));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Divider:");
        int divider = Integer.parseInt(s.nextLine());

    }
}
