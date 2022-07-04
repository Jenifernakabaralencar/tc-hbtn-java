import java.util.ArrayList;

public class ProcessadorVideo {

    private ArrayList<CanalNotificacao> canais;

    public ProcessadorVideo() {
        this.canais = new ArrayList<CanalNotificacao>();
    }

    public void registrarCanal(CanalNotificacao valor){
        canais.add(valor);
    }

    public void processar(Video video){
        for (int i = 0; i < canais.size(); i++) {
            Mensagem mensagem = new Mensagem(video.getArquivo() + " - " + video.getFormato(), TipoMensagem.LOG);
        canais.get(i).notificar(mensagem);
        }

    }
}
