package provedores;

public class Sedex implements ProvedorFrete{
    @Override
    public Frete calcularFrete(double peso, double valor) {
       double valorComPorcentagem = 0;
        if (peso > 1000){
            valorComPorcentagem = valor / 100 * 10;
        }else {
            valorComPorcentagem = valor/ 100 * 5;
        }
        Frete Frete = new Frete(valorComPorcentagem,TipoProvedorFrete.SEDEX);
        return Frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
