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

    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> listaDePessoas){
        Map<String, Map<Integer, Long>> mapa = listaDePessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.groupingBy(Pessoa::getIdade, Collectors.counting())));
        return mapa;
    }

    public static Map<String, Double> obterMediaSalarioPorCargo(List<Pessoa> listaDePessoas){
        Map<String, Double> collect = listaDePessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.averagingDouble(Pessoa::getSalario)));
        return collect;
    }

    public static Map<String, TreeSet<String>> obterHobbiesPorCargo(List<Pessoa> listaDePessoas){
        Map<String, TreeSet<String>> collect = listaDePessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.flatMapping(pessoa -> pessoa.getHobbies().stream(), Collectors.toCollection(TreeSet::new))));
        return collect;
    }
}
