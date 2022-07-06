import java.util.ArrayList;
import java.util.List;

public class Biblioteca <T extends Midia>  {

    private List<T> listaDeBibliotecas;

    public Biblioteca() {
        this.listaDeBibliotecas = new ArrayList<T>();
    }

    public void adicionarMidia(T novaMidia) {
        this.listaDeBibliotecas.add(novaMidia);
    }

    public List<T> obterListaMidias() {
        return listaDeBibliotecas;
    }

    public List<T> getListaDeBibliotecas() {
        return listaDeBibliotecas;
    }
}
