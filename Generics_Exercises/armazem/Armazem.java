import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Armazem <T> implements Armazenavel{

    private Map<String, T> itens = new HashMap<>();
    @Override
    public void adicionarAoInventario(String nome, Object valor) {
        itens.put(nome, (T) valor);
    }
    @Override
    public T obterDoInventario(String nome) {

        return  itens.get(nome);
    }
}
