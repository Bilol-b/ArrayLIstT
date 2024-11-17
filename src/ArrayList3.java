import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> arraylist3 = new ArrayList<>();

        arraylist3.add("oq");
        arraylist3.add("qora");
        arraylist3.add("yashil");
        arraylist3.add("sariq");
        arraylist3.add("pushti");
        arraylist3.add("kok");
        arraylist3.add("jigar");

        Collections.reverse(arraylist3);

        System.out.println("teskarisi " + arraylist3);
        int firstIndex = 3;
        int lastIndex = 6;

        ArrayList<String> sublist = new ArrayList<>(arraylist3.subList(firstIndex,lastIndex));
        System.out.println("kesib olingani " + sublist);
    }
}
