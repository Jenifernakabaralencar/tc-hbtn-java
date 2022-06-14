import java.util.Scanner;

public class InteiroPositivo {
    
    private Integer valor;
    
    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) throws Exception{
        if (valor > 0) {
            this.valor = valor;
        }else {
            throw new Exception("Valor nao eh um valor inteiro positivo");
        }

    }

    
    public InteiroPositivo(int x) {
        this.valor = x;
    }

    public InteiroPositivo(String y) throws Exception{

            this.valor = Integer.parseInt(y);
            if (this.valor < 0){
                throw new Exception("Valor nao eh um valor inteiro positivo");
            }
    }

    public Boolean ehPrimo() {
        if (this.valor == 1){
            return false;
        }
        for (int x = 2; x < this.valor; x++) {
            Integer resto = (this.valor % x);
            if (resto.equals(0)) {
                return false;
            }
        }
        return true;
    }
}
