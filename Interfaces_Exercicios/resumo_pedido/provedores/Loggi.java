package provedores;

public class Loggi implements ProvedorFrete{
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorComPorcentagem = 0;
        if (peso > 5000){
            valorComPorcentagem = valor / 100 * 12;
        }else {
            valorComPorcentagem = valor/ 100 * 4;
        }
        Frete Frete = new Frete(valorComPorcentagem,TipoProvedorFrete.LOGGI);
        return Frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
