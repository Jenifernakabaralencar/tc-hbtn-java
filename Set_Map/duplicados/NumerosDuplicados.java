import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] numeros){
        HashSet<Integer> test = new HashSet<>();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 1; j < numeros.length; j++) {
                if (i == j){
                    continue;
                }
                if (numeros[i] == numeros[j]){
                        set.add(numeros[i]);
                }
            }
        }return set;

    }
}
