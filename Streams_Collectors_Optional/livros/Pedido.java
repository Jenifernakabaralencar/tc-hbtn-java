import java.util.List;

public class Pedido {
    private int codigo;
    private List<Produto> listaDeProdutos;
    private Cliente cliente;

    public Pedido(int codigo, List<Produto> listaDeProdutos, Cliente cliente) {
        this.codigo = codigo;
        this.listaDeProdutos = listaDeProdutos;
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public List<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
