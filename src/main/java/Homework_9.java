import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Homework_9 {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        input.add("mama");
        input.add("papa");
        input.add("list");
        input.add("Pafema");
        input.add("Marepatr");
        input.add("Mamamamam");
        input.add("PaMaMa");
        input.add("Kerlflf");
        input.add("hettet");
        input.add("pappapapapap");
        input.add("mamamama");

        Set<Character> resultSet = getCharactersDuplicatesSetsArray(input);
        if (resultSet.size() > 0) {
            System.out.println(resultSet);
        } else {
            System.out.println("No words that match parameters wasn't found");
        }
    }

    private static Set<Character> getCharactersDuplicatesSetsArray(ArrayList<String> input) {
        int sameCharSetCount = 0;
        Set<Character> resultSet = new HashSet<>();
        for (int i = 0; i < input.size(); i++) {

            char[] inputCharArray = input.get(i).toCharArray();

            Set<Character> outputSet = getCharactersDuplicatesSet(inputCharArray);

            if (outputSet.size() > 0 && sameCharSetCount <= 2) {
                sameCharSetCount++;
                resultSet.addAll(outputSet);
            }

            if (sameCharSetCount == 2) {
                return resultSet;
            }
        }
        return resultSet;
    }

    private static Set<Character> getCharactersDuplicatesSet(char[] inputCharArray) {
        int sameCharCount = 0;
        for (int y = 0; y < inputCharArray.length - 1; y++) {
            for (int x = y; y < inputCharArray.length - 1; y++) {
                if (inputCharArray[y] == inputCharArray[x]) {
                    sameCharCount++;
                }
            }
        }
        Set<Character> outputSet = new HashSet<>();
        if ((sameCharCount % 2) == 0) {
            for (Character sameChar : inputCharArray) {
                outputSet.add(sameChar); //добавляем в финальный список, результат чистки
            }
        }
        return outputSet;
    }
}