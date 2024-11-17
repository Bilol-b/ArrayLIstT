import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
      ArrayList<String> arrayList1 = new ArrayList<>();

      arrayList1.add("oq");
      arrayList1.add("qora");
      arrayList1.add("yashil");
      arrayList1.add("sariq");
      arrayList1.add("pushti");
      arrayList1.add("kok");
      arrayList1.add("jigar");
    //toplamni ekranga chop etish
        System.out.println("toplam " + arrayList1);

        //birinchi elelmentni boshqasiga ozgartirish
        arrayList1.set(0,"sabzi rang");

        //ozgargan toplam
        System.out.println("almashgan toplam " + arrayList1);

        for (String color: arrayList1){
            System.out.println(color);
        }
        System.out.println("olchami " + arrayList1.size());
    }
}
