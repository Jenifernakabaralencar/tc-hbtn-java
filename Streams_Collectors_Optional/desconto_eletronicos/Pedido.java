import java.util.List;

public class Pedido {
    private int codigo;
    private List<Produto> produtos;
    private Cliente cliente;

    public Pedido(int codigo, List<Produto> listaDeProdutos, Cliente cliente) {
        this.codigo = codigo;
        this.produtos = listaDeProdutos;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s", codigo, cliente.getNome());
    }

    public int getCodigo() {
        return codigo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

}
