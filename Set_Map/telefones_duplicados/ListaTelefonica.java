import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ListaTelefonica {
    HashMap<String, HashSet<Telefone>> telefones;

    public ListaTelefonica() {
        this.telefones = new HashMap<>();
    }
    public HashSet<Telefone> adicionarTelefone(String nome, Telefone novoTelefone){
        HashSet<Telefone> lista = telefones.get(nome);
        if (lista == null){
            lista = new HashSet<Telefone>();
        } else {
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
            }lista.add(novoTelefone);
        telefones.put(nome, lista);
        return lista;
        }
        public HashSet<Telefone> buscar(String nome){
        HashSet<Telefone> lista = telefones.get(nome);
        return lista;
    }
}
