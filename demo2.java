import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> arrOne = new ArrayList<Integer>();

       arrOne.add(1);
       arrOne.add(2);
       arrOne.add(3);

        List<Integer> arrTwo = new ArrayList<Integer>();
            arrTwo.add(1);
            arrTwo.add(5);
            arrTwo.add(1);


            for (int i = 0; i < arrOne.size(); i++) {
            if(arrOne.get(i) != arrTwo.get(i)){
                arrTwo.add(arrOne.get(i))
                        ;
            }

        }System.out.print(arrTwo);


    }
}
