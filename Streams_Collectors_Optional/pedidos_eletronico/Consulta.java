import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Consulta {

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

}
