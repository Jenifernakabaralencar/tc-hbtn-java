public class Pedido {
    private double percentualDesconto;
    private ItemPedido itens[];

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double valorTotal = 0;
        for (int i = 0; i < itens.length; i++) {
            ItemPedido item = itens[i];
            for (int x = 0; x < item.getQuantidade(); x++){
                valorTotal += item.getProduto().obterPrecoLiquido();
            }
       }
        double desconto = valorTotal / 100 * percentualDesconto;
        return valorTotal - desconto;
    }
}
