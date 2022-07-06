import java.util.*;

public class Armazem <T> implements Armazenavel{

    private Map<String, T> itens = new TreeMap<String, T>();
    @Override
    public void adicionarAoInventario(String nome, Object valor) {
        itens.put(nome, (T) valor);
    }
    @Override
    public T obterDoInventario(String nome) {

        return  itens.get(nome);
    }
}
