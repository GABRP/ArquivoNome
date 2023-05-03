import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConcatenarNomes {
    public static void main(String[] args) throws IOException {

        BufferedReader nomesReader = new BufferedReader(new FileReader("ArquivoNomes.txt"));
        BufferedReader sobrenomesReader = new BufferedReader(new FileReader("SobreNomes.txt"));

        BufferedWriter writer = new BufferedWriter(new FileWriter("NomeSobrenome.txt"));

        String nome, sobrenome;

        while ((nome = nomesReader.readLine()) != null && (sobrenome = sobrenomesReader.readLine()) != null) {
            String nomeSobrenome = nome + " " + sobrenome;
            System.out.println(nomeSobrenome);
            writer.write(nomeSobrenome);
            writer.newLine();
        }

        nomesReader.close();
        sobrenomesReader.close();
        writer.close();
    }
}