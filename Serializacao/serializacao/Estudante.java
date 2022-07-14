import java.io.Serializable;

public class Estudante implements Serializable {

    private static final long serialVersionUID = 1L;
    private int idade;
    private String nome;
    private transient String senha;

    public Estudante(int idade, String nome, String senha) {
        this.idade = idade;
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return String.format("ESTUDANTE { Nome='%s', idade='%d', senha='%s'}", nome, idade, senha);
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }
}
