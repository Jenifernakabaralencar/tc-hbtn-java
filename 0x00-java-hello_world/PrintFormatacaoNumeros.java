import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        DecimalFormat df = new DecimalFormat ("#,##0.00");
        String valorFormatado = df.format (valor);
        System.out.println("Valor: R$" + valorFormatado);
        String taxaFormatada = df.format (taxa);
        System.out.println("Taxa: " + taxaFormatada + "%");
    }
}