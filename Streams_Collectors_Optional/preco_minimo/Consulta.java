import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Consulta {

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> listaDeProdutos, int precoMinimo){
        List<Produto> lista = listaDeProdutos.stream()
                .filter(produto -> produto.getPreco() >= precoMinimo)
                .sorted(Comparator.comparing(Produto::getCodigo))
                .collect(Collectors.toList());

        return lista;
    }

}
