import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {

    private final String numeracao;
    private double saldo = 0;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor > 0){
            this.saldo += valor;
        }else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor >= 0){
            if (saldo >= valor){
                this.saldo -= valor;
            }else{
                throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
            }
        }else {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }
    }

    public double calcularTarifaMensal(){
        double tarifaMensal = saldo / 100 * 10;
        if (tarifaMensal > 10){
            tarifaMensal = 10;
        }
        return tarifaMensal;
    }

    public double calcularJurosMensal() {
        double mensal = taxaJurosAnual / 12;
        double saldoAposJuros = saldo /100 * mensal;
        if (saldo <= 0) {
            taxaJurosAnual = 0;
        }
        return saldoAposJuros;
    }
    public void aplicarAtualizacaoMensal() throws OperacaoInvalidaException {
        double tarifa = calcularTarifaMensal();
        double juros = calcularJurosMensal();
        this.saldo += juros - tarifa;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }
}