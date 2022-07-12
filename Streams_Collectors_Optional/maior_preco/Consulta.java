import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Consulta {

    public static Produto obterProdutoMaiorPreco(List<Produto> listaDeProdutos){
        List<Produto> lista = listaDeProdutos.stream()
                .sorted(Comparator.comparing(Produto::getPreco).reversed())
                .collect(Collectors.toList());

        return lista.get(0);
    }

}
