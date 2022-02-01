package pl.PawelLeszczynski.zad2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class zad2 {
    public static void main(String[] args) {
        ArrayList<String> arList = new ArrayList<>();
        arList.add("el1");
        arList.add("el2");
        arList.add("el3");

        Set<String> set=Set.of(arList.get(0),arList.get(1),arList.get(2));

        HashSet<String> hashSet= new HashSet<String>(arList);

        TreeSet<String> treeSet= new TreeSet<String>(arList);

        printMargina(arList);
//        System.out.println("\n");
//        printMargina(set);
//        System.out.println("\n");
//        printMargina(hashSet);
//        System.out.println("\n");
//        printMargina(treeSet);
    }
    public static <E extends Iterable> void printMargina(E e){
        e.forEach(i-> System.out.print(e));
        }
        
    }

