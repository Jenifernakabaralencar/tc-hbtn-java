import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static TreeMap<String, TreeSet<Pessoa>>  obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> listaDePessoas){
        TreeMap<String, TreeSet<Pessoa>> teste = listaDePessoas.stream()
                .collect(
                        Collectors.groupingBy(Pessoa::getCargo,()->new TreeMap<>(Comparator.reverseOrder()),
                                Collectors.toCollection(TreeSet::new)
                        ));
    return teste;
    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> listaDePessoas){
        Map<String, Long> mapa = listaDePessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.counting()));
        return mapa;
    }
}
