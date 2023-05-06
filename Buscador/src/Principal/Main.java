package Principal;
import Classes.ConsultaCep;
import Classes.Endereco;
import Classes.GeradorDeArquivos;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite o CEP que deseja buscar: ");
        var cep = leitura.nextLine();

        try {
            Endereco endereco = consultaCep.buscaEndereco(cep);
            System.out.println(endereco);
            GeradorDeArquivos gerador = new GeradorDeArquivos();
            gerador.geraArquivoJson(endereco);

        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando o programa...");
        }
    }
}