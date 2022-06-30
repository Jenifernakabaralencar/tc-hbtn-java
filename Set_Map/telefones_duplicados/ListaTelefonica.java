import java.util.HashMap;
import java.util.TreeSet;

public class ListaTelefonica {
    HashMap<String, TreeSet<Telefone>> telefones;
    public ListaTelefonica() {
        telefones = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone novoTelefone){
          TreeSet<Telefone> lista = telefones.get(nome);
        if (lista == null){
            lista = new TreeSet<Telefone>();
        }else {
            if (lista.contains(novoTelefone)){
                throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
            }
            for (String chaveNomePessoa: telefones.keySet()) {
                if (nome == chaveNomePessoa)
                    continue;
                if (telefones.get(chaveNomePessoa).contains(novoTelefone)){
                    throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
                }
            }
        } lista.add(novoTelefone);
        telefones.put(nome, lista);
    }
    public TreeSet<Telefone> buscar(String nome){
        return telefones.get(nome);

    }


}
