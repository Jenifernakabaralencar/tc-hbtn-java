import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Locale;
import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap contagemPalavras(String texto) {
        String[] palavras = texto.toLowerCase(Locale.ROOT).split("[?,.! ]+");
        TreeMap<String, Integer> mapa = new TreeMap<String, Integer>();
        for (int i = 0; i < palavras.length; i++) {
            if (mapa.isEmpty()) {
                mapa.put(palavras[0],1);
            }else {
                if (mapa.containsKey(palavras[i])){
                    Integer aux = mapa.get(palavras[i]);
                    mapa.replace(palavras[i],aux+1);
                }else {
                    mapa.put(palavras[i],1);
                }
            }
        }

        return mapa;
    }}
