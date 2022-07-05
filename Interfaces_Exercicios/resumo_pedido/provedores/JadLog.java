package provedores;

public class JadLog implements ProvedorFrete{
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorComPorcentagem = 0;
        if (peso > 2000){
            valorComPorcentagem = valor / 100 * 7;
        }else {
            valorComPorcentagem = valor/ 100 * 4.5;
        }
        Frete Frete = new Frete(valorComPorcentagem,TipoProvedorFrete.JADLOG);
        return Frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}
