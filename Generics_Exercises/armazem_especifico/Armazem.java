import java.util.*;

public abstract class Armazem <T> implements Armazenavel<T>{

    private Map<String, T> itens = new TreeMap<String, T>();
    @Override
    public void adicionarAoInventario(String nome, T valor) {
        itens.put(nome, valor);
    }
    @Override
    public T obterDoInventario(String nome) {

        return  itens.get(nome);
    }
}
