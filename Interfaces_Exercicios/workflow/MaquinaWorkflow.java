import atividades.Atividade;

public class MaquinaWorkflow {

    public void executar(Workflow workflow){
        for (int i = 0; i < workflow.getListaDeAtividades().size() ; i++) {
            Atividade atividade = workflow.getListaDeAtividades().get(i);
            atividade.executar();
        }
    }
}
