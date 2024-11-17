import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList2 = new ArrayList<>();

        arrayList2.add("oq");
        arrayList2.add("qora");
        arrayList2.add("yashil");
        arrayList2.add("sariq");
        arrayList2.add("pushti");
        arrayList2.add("kok");
        arrayList2.add("jigar");

        //nusxa olish

        ArrayList<String> copy = new ArrayList<>(arrayList2);

        System.out.println("nusxasi " + copy);

        Collections.shuffle(arrayList2);

        System.out.println("aralashgani " + arrayList2);
    }
}
