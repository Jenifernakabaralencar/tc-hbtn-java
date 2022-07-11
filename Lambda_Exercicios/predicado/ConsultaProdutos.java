import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {
    List<Produto> listaDeProduto;

    public ConsultaProdutos() {
        this.listaDeProduto = new ArrayList<Produto>();
    }


    public static List<Produto> filtrar(List<Produto> listaDeProduto, Predicate<Produto> filtro) {
        ArrayList<Produto> retornoDaLista = new ArrayList<Produto>();

        for (int i = 0; i < listaDeProduto.size(); i++) {
            if (filtro.test(listaDeProduto.get(i))) {
                retornoDaLista.add(listaDeProduto.get(i));
            }
        }
        return retornoDaLista;
    }

    public ConsultaProdutos(List<Produto> listaDeProduto) {
        this.listaDeProduto = listaDeProduto;
    }


}
