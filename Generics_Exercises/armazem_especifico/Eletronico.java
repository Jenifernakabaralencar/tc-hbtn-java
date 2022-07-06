public class Eletronico {
    private String descricao;
    private double valor;

    public Eletronico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("[%s] R$ %.6f", descricao, valor);
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
}
