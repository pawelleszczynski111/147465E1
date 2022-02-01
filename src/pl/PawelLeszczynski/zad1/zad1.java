package pl.PawelLeszczynski.zad1;

import java.time.LocalTime;
import java.util.ArrayList;

public class zad1 {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ArrayList<LocalTime> times = new ArrayList<LocalTime>();
        ints.add(1);
        ints.add(1);
        times.add(LocalTime.of(22,12));
        times.add(LocalTime.of(11,54));
        jestPalindromem(ints);
        System.out.println("\n");
        jestPalindromem(times);
    }
    public static <T extends Comparable> void jestPalindromem(ArrayList<T> list){
        ArrayList<T> arrayList1=list;
        ArrayList<T> arrayList2 = new ArrayList<>();
        for (int i=0;i< arrayList1.size();i++){
            arrayList2.add(arrayList1.get(arrayList1.size()-i-1));
        }
        if(arrayList2.equals(arrayList1)){
            System.out.println("jest palindromem");
        }else {
            System.out.println("nie jest palindromem");
//        }


        }
    }
}
