import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido novoPedido){
        List<Produto> lista = new ArrayList<Produto>();
        List<Produto> stream= novoPedido.getProdutos()
                .stream()
                .filter(produto -> produto.getCategoria()
                        .equals(CategoriaProduto.LIVRO))
                .collect(Collectors.toList());

        return stream;
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> listaDeProdutos){
        List<Produto> lista = listaDeProdutos.stream()
                .sorted(Comparator.comparing(Produto::getPreco).reversed())
                .collect(Collectors.toList());

        return lista.get(0);
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> listaDeProdutos, int precoMinimo){
        List<Produto> lista = listaDeProdutos.stream()
                .filter(produto -> produto.getPreco() >= precoMinimo)
                .sorted(Comparator.comparing(Produto::getCodigo))
                .collect(Collectors.toList());

        return lista;
    }
    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> listaDePedidos){
        List<Pedido> listaDeRetorno = new ArrayList<>();
        for (int i = 0; i < listaDePedidos.size(); i++) {
            boolean existe = listaDePedidos.get(i).getProdutos()
                    .stream().anyMatch(produto -> produto.getCategoria().equals(CategoriaProduto.ELETRONICO));
            if (existe){
                listaDeRetorno.add(listaDePedidos.get(i));
            }
        }return listaDeRetorno;

    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> listaDeProduto){
        List<Produto> listaDeRetorno = new ArrayList<>();
        listaDeProduto.stream().forEach(produto -> {
               if(produto.getCategoria().equals(CategoriaProduto.ELETRONICO)) {
                 double porcentagem = produto.getPreco() /100 * 15;
                   produto.setPreco(produto.getPreco() - porcentagem);
                  }
            listaDeRetorno.add(produto);
               });

       return listaDeRetorno;

    }

}
