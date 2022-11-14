import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer>set1=new HashSet<>();
        set1.add(0);
        set1.add(2);
        set1.add(1);

        Set<Integer>set2=new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(1);

        System.out.println(symmetricDifference(set2,set1));

    }
    public static  Set<Integer>symmetricDifference(Set<Integer>set2,Set<Integer>set1) {
        Set<Integer>symm=new HashSet<>(set2);
        symm.addAll(set1);
        Set<Integer> tmp = new HashSet<Integer>(set2);
        tmp.retainAll(set1);
        symm.removeAll(tmp);
        return symm;

    }
}