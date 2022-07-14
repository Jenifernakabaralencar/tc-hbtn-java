import java.io.*;
import java.util.List;

public class SerializarEstudantes<Estudante> {
    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> listaDeEstudantes) {

        try {
            FileOutputStream fos = new FileOutputStream(this.nomeArquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listaDeEstudantes);
            oos.close();
            fos.close();

        } catch (Exception ex) {
            System.out.println("Nao foi possivel serializar");
        }

    }
    public List<Estudante> desserializar() {
        try {
            FileInputStream fis = new FileInputStream(this.nomeArquivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Estudante> lista = (List<Estudante>) ois.readObject();
            ois.close();
            fis.close();

            return lista;
        } catch (Exception ex) {
            System.out.println("Nao foi possivel desserializar");
            return null;
        }

    }

}
