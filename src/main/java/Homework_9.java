import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Homework_9 {
    public static void main(String[] args) {
        ArrayList<String> ArrayForHomework = new ArrayList<>();
        ArrayForHomework.add("list");
        ArrayForHomework.add("Mapffar");
        ArrayForHomework.add("Mapapapa");
        ArrayForHomework.add("Pafema");
        ArrayForHomework.add("Marepatr");
        ArrayForHomework.add("Mamamamam");
        ArrayForHomework.add("PaMaMa");
        ArrayForHomework.add("Kerlflf");
        ArrayForHomework.add("hettet");
        ArrayForHomework.add("pappapapapap");
        ArrayForHomework.add("mamamama");

                ArrayList<Character> OurArray = new ArrayList<>();
        for (int i=0; i < ArrayForHomework.size(); i++) {

            char[] OurMyArray = ArrayForHomework.get(i).toCharArray();
            ArrayList<Character> MynewArray = new ArrayList<>();


            for (int y = 0; y < OurMyArray.length; y++)
            {
                MynewArray.add(OurMyArray[y]);
            }
            Set<Character> newset = new HashSet<>();
            newset.addAll(MynewArray);

            for (Character s : newset)
            {
                OurArray.add(s);
            }
            System.out.println(OurArray);

        }
    }

}


