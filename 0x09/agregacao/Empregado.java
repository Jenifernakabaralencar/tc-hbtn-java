package Empresa;

public class Empregado {
    private String nome;
    private int codigo;
    private Endereco endereço;

    public Empregado(String nome, int codigo, Endereco endereço) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereço = endereço;
    }

    public void apresentar(){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Bairro: " + this.endereço.getBairro());
        System.out.println("Cidade: " + this.endereço.getCidade());
        System.out.print("Pais: " + this.endereço.getPais());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Endereco getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereco endereço) {
        this.endereço = endereço;
    }
}
