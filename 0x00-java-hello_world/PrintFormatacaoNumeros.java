import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        Locale localeBR = new Locale("pt","BR");
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
        System.out.println("Valor: " + dinheiro.format(valor));
        DecimalFormat df = new DecimalFormat ("#,##0.00");
        String taxaFormatada = df.format (taxa);
        System.out.println("Taxa: " + taxaFormatada + "%");
    }
}

