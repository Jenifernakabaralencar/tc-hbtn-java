import comida.Comida;
import humor.*;

public class Personagem {
    private int pontosDeFelicidade;
    private Humor humor;

    public Humor obterHumorAtual(){
        if (pontosDeFelicidade <-5){
            humor = new Irritado();
        }if (pontosDeFelicidade >=-5 && pontosDeFelicidade <=0){
            humor = new Triste();
        }if (pontosDeFelicidade >=1 && pontosDeFelicidade <=15){
            humor = new Feliz();
        }if (pontosDeFelicidade>15){
            humor = new MuitoFeliz();
        }
        return humor;
    }

    public void comer(Comida[] comidas){
        for (int i=0; i < comidas.length;i++ ){
            Comida comida = comidas[i];
            this.pontosDeFelicidade += comida.getPontosDeFelicidade();
        }
        obterHumorAtual();
    }

    @Override
    public String toString() {
        return pontosDeFelicidade + " - " + humor.getClass().getSimpleName();
    }
}
