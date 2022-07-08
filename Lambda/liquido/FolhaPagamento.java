public class FolhaPagamento implements CalculadorDeSalario{

    @Override
    public double calcular(double valor) {
        return 0;
    }

    public static double calcularLiquido(Funcionario funcionario, CalculadorDeSalario calculadorDeSalario){
    return calculadorDeSalario.calcular(funcionario.getSalario());
    }


}
