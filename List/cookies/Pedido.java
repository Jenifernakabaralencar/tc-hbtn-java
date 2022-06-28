import java.util.ArrayList;
import java.util.List;

public class Pedido {
    ArrayList<PedidoCookie> cookies = new ArrayList<>();

    public Pedido() {
        this.cookies = new ArrayList<PedidoCookie>();
    }
    public void adicionarPedidoCookie(PedidoCookie novoCookie){
        cookies.add(novoCookie);
    }
    public int obterTotalCaixas(){
        int quantidadeTotal = 0;
        for (int i = 0; i < cookies.size(); i++) {
            PedidoCookie p = cookies.get(i);
            quantidadeTotal += p.getQuantidadeCaixas();
        }
    return quantidadeTotal;
    }
    public int removerSabor(String sabor){
        int quantidadeCaixas = 0;
        for (int i = 0; i < cookies.size(); i++) {
            PedidoCookie p = cookies.get(i);
            if (p.getSabor().equals(sabor)){
                quantidadeCaixas += p.getQuantidadeCaixas();
                cookies.remove(p);
            }
        }
        return quantidadeCaixas;
    }

}
