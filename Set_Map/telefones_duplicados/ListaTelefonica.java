import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class ListaTelefonica {
    HashMap<String, HashSet<Telefone>> listatelefone;
    public ListaTelefonica() {
        this.listatelefone = new HashMap<>();
    }

    public HashSet<Telefone> adicionarTelefone(String nome, Telefone novoTelefone){
        HashSet<Telefone> lista = listatelefone.get(nome);
        if (lista == null){
            lista = new HashSet<Telefone>();
        }else {
            if (lista.contains(novoTelefone)){
                throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
            }
            Iterator<HashSet<Telefone>> telefones =  listatelefone.values().iterator();
            while (telefones.hasNext()){
                for (Telefone tel: telefones.next()) {
                    if (tel.equals(novoTelefone)){
                        throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
                    }
                }
            }
        } lista.add(novoTelefone);
        this.listatelefone.put(nome, lista);
        return lista;
    }
    public HashSet<Telefone> buscar(String nome){
        for (String listaTel: this.listatelefone.keySet()) {
            if (listaTel.equals(nome)){
                return listatelefone.get(nome);
            }
        }
        return null;
    }


}
