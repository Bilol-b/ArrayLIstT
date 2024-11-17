import java.util.ArrayList;
import java.util.Collections;

public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList5 = new ArrayList<>();

        arrayList5.add("oq");
        arrayList5.add("qora");
        arrayList5.add("yashil");
        arrayList5.add("sariq");
        arrayList5.add("pushti");
        arrayList5.add("kok");
        arrayList5.add("jigar");

        //toplam elementlarini ornini almashtiruvchi metod
        Collections.swap(arrayList5, 2, 3);
        System.out.println(arrayList5);

        ArrayList<String> list = new ArrayList<>();
        list.add("oqroq");
        list.add("oqroq1");
        list.add("oqroq2");
        list.add("oqroq3");

        //ikkita toplamni qoshish uchun addAll ishlatiladi
        list.addAll(arrayList5);
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>(3);
        list1.add("1");
        list1.add("2");
        list1.add("3");


        // To'plamni ekranga chiqarish
        System.out.println("Dastlabki sonlar to'plami: " + list1);
        // To'plam o'lchamini oshirish uchun ensureCapacity ishlatiladi
        list1.ensureCapacity(6);
        // Yangi elementlar qoshish
        list1.add("4");
        list1.add("5");
        list1.add("6");
        // Natijani ekranga chop etish
        System.out.println("O'lchami oshirilgan sonlar to'plami: " + list1);


    }
}
