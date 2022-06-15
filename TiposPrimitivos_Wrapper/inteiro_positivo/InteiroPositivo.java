import java.util.Scanner;

public class InteiroPositivo {
    
    private int valor;
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) throws IllegalArgumentException{
        if (valor > 0) {
            this.valor = valor;
        }else {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }

    }

    
    public InteiroPositivo(int x) {
        this.valor = x;
    }

    public InteiroPositivo(String y) throws IllegalArgumentException{

            this.valor = Integer.parseInt(y);
            if (this.valor < 0){
                throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
            }
    }

    public Boolean ehPrimo() {
        if (this.valor == 1){
            return false;
        }
        for (int x = 2; x < this.valor; x++) {
            int resto = (this.valor % x);
            if (resto == (0)) {
                return false;
            }
        }
        return true;
    }
}
