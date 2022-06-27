import produtos.Produto;

import java.util.zip.DeflaterOutputStream;

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

    public void apresentarResumoPedido(){
        System.out.println("------- RESUMO PEDIDO -------");
        double valorTotal = 0;

       for (int i = 0; i < itens.length; i++){
           ItemPedido item = itens[i];
           for (int x = 0; x < item.getQuantidade(); x++){
               valorTotal += item.getProduto().obterPrecoLiquido();
           }
           Produto tipo = item.getProduto();
           String titulo = item.getProduto().getTitulo();
           double preco = item.getProduto().obterPrecoLiquido();
           int quantidade = item.getQuantidade();
           double total = preco * quantidade;

           System.out.printf("Tipo: %s  Titulo: %s Preco: %.2f Quant: %d Total: %.2f \n",item.getProduto().getClass().getSimpleName(),titulo,preco,quantidade,total);
       }
        System.out.println("----------------------------");
        double valorDesconto = valorTotal /100 * percentualDesconto;
        System.out.printf("DESCONTO: %.2f \n", valorDesconto );
        System.out.printf("TOTAL PRODUTOS: %.2f \n", valorTotal );
        System.out.println("----------------------------");
        double valorPedido = valorTotal - valorDesconto;
        System.out.printf("TOTAL PEDIDO: %.2f \n", valorPedido);
        System.out.println("----------------------------");
    }
}
