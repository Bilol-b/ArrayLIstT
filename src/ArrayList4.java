import java.util.ArrayList;

import static java.lang.System.*;

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<String> alist1 = new ArrayList<>();
        alist1.add("yellow");
        alist1.add("green");
        alist1.add("black");

        ArrayList<String> alist2 = new ArrayList<>();
        alist2.add("yellow");
        alist2.add("red");
        alist2.add("black");

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < alist2.size(); i++) {
            if(alist2.get(i).equals(alist1.get(i))) {
                result.add("yes");
            }else {
                result.add("no");
            }
        }

        out.println(result);

    }
}
