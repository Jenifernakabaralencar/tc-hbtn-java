import java.util.Objects;

public class Telefone implements Comparable<Telefone>{

    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.format("(%s) %s", codigoArea, numero);
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefone telefone = (Telefone) o;
        return codigoArea.equals(telefone.codigoArea) && numero.equals(telefone.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoArea, numero);
    }

    @Override
    public int compareTo(Telefone o) {
       return numero.compareTo(o.numero);
    }
}
