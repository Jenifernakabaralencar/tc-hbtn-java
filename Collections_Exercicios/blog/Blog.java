import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class Blog {
    List<Post> listaDePosts;

    public Blog() {
        listaDePosts = new ArrayList<>();
    }

    public void adicionarPostagem(Post postagem){
        listaDePosts.add(postagem);
    }
    public Set<String> obterTodosAutores(){
        Set<String> listaDeAutores = new TreeSet<>();
        for (int i = 0; i < listaDePosts.size(); i++) {
            listaDeAutores.add(listaDePosts.get(i).getAutor());
        }return listaDeAutores;
    }
    public Map<String, Integer> obterContagemPorCategoria(){
        Map<String, Integer> listaDeCategoria = new TreeMap<>();
        for (int i = 0; i < listaDePosts.size(); i++){
            if (listaDeCategoria.isEmpty()){
                listaDeCategoria.put(listaDePosts.get(i).getCategoria(),1);
                continue;
            }else{
                for (int j = 0; j < listaDeCategoria.size(); j++) {
                    if (listaDeCategoria.containsKey(listaDePosts.get(i).getCategoria())){
                        Integer valor = listaDeCategoria.get(listaDePosts.get(i).getCategoria());
                        listaDeCategoria.replace(listaDePosts.get(i).getCategoria(), valor+1);
                        break;
                    }else {
                        listaDeCategoria.put(listaDePosts.get(i).getCategoria(),1);
                        break;
                    }
                }
            }

        }return listaDeCategoria;
    }

}
