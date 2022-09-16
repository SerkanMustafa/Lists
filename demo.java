import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
//        ArrayList<String> wor;
//        List<String> wordsList = new ArrayList<String>();
//        wordsList.add("swedish");
//        wordsList.add("pegans");
//        wordsList.add("ashore");
//       // System.out.println(wordsList.get(0));
//        wordsList.set(0, "abvgdejzi");
//        //System.out.println(wordsList.get(0));
//
//        for (int i = 0; i <wordsList.size() ; i++) {
//            System.out.println(wordsList.get(i));
//        }

//        List<String> words = new ArrayList<String>();
//
//        Scanner scanner = new Scanner(System.in);
//// todo: read input to dot
//        String word = scanner.nextLine();
//            while(!word.equals(".")){
//                words.add(word);
//                word=scanner.nextLine();
//                for (int i = 0; i < ; i++) {
//
//                }
//            }
//        for (int i = words.size() - 1; i >= 0; i--) {
//            System.out.println(words.get(i));
//        }

        Scanner scanner =new Scanner(System.in);
        List<String> firstArray = new ArrayList<String>(5);
       // List<String> secondArray = new ArrayList<String>();

        for (int i = 0; i < firstArray.size(); i++) {
            firstArray.add(scanner.nextLine());
            System.out.print(firstArray.get(i));
        }
    }
}
