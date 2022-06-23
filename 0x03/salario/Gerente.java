public class Gerente extends Empregado{

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta()){
            double bonusExtra = departamento.getValorAtingidoMeta() - departamento.getValorMeta();
            double valorBonusExtra = bonusExtra / 100;
            return salarioFixo / 100 * 20 + valorBonusExtra;

        }else {
            return 0;
        }

    }
}
