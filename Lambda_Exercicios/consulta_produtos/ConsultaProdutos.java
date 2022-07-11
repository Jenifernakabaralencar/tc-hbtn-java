import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {
    List<Produto> listaDeProduto;

    public ConsultaProdutos() {
        this.listaDeProduto = new ArrayList<Produto>();
    }


    public static List<Produto> filtrar(List<Produto> listaDeProduto, CriterioFiltro filtro) {
        ArrayList<Produto> retornoDaLista = new ArrayList<Produto>();

        for (int i = 0; i < listaDeProduto.size(); i++) {
            if (filtro.testar(listaDeProduto.get(i)) == true) {
                retornoDaLista.add(listaDeProduto.get(i));
            }
        }
        return retornoDaLista;
    }

    public ConsultaProdutos(List<Produto> listaDeProduto) {
        this.listaDeProduto = listaDeProduto;
    }


}
