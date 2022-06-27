import java.util.ArrayList;
import java.util.List;

public class ManipularArrayNumeros {

    static public int buscarPosicaoNumero(List<Integer> numeros, int numeroASerBuscado) {
        for (int posicao = 0; posicao < numeros.size(); posicao++) {
            if (numeroASerBuscado == numeros.get(posicao)) {
                    return posicao;
            }
        }return -1;
    }
    static public void adicionarNumero(List<Integer> numero, int i) throws Exception {
        int resultadoBusca = buscarPosicaoNumero(numero, i);
        if (resultadoBusca != -1){
            throw new Exception("Numero jah contido na lista");
        } else {
            numero.add(i);
        }

    }
     public static void removerNumero(List<Integer> numero, int i) throws Exception {
         int resultadoBusca = buscarPosicaoNumero(numero, i);
         if (resultadoBusca == -1){
             throw new Exception("Numero nao encontrado na lista");
         } else {
             numero.remove(resultadoBusca);
         }
    }
       public static void substituirNumero(List<Integer> numero, int numeroSubstituir, int numeroSubstituto) {
           int posicao = buscarPosicaoNumero(numero, numeroSubstituir);
           if (posicao == -1){
               numero.add(numeroSubstituto);
           }else {
               numero.set(posicao,numeroSubstituto);
           }
    }
}
