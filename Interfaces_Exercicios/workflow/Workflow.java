import atividades.Atividade;

import java.util.ArrayList;

public class Workflow {
    private ArrayList<Atividade> listaDeAtividades;

    public ArrayList<Atividade> getListaDeAtividades() {
        return listaDeAtividades;
    }

    public Workflow() {
        this.listaDeAtividades = new ArrayList<Atividade>();
    }

    public void registrarAtividade(Atividade atividade){
       listaDeAtividades.add(atividade);
    }
}
