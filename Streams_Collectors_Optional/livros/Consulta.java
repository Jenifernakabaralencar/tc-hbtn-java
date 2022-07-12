import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido novoPedido){
        List<Produto> lista = new ArrayList<Produto>();
        List<Produto> stream= novoPedido.getListaDeProdutos()
                .stream()
                .filter(produto -> produto.getCategoria()
                        .equals(CategoriaProduto.LIVRO))
                .collect(Collectors.toList());

        return stream;
    }
}
