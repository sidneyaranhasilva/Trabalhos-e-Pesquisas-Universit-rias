
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ProgramaCliente {
	public static void main(String[] args) {
		String num1, num2, total;
		String opc = "";
		Scanner leia = new Scanner(System.in);

		Socket sckCliente;
		InputStream canalDeEntrada;
		OutputStream canalDeSaida;
		PrintWriter saida;
		BufferedReader entrada;
		Scanner scanner = new Scanner(System.in);
		try {
			// Instancio um Socket ao localhost porta 4000
			sckCliente = new Socket("localhost", 4000);
			// Recuperando os canais de comunicação do socket
			canalDeEntrada = sckCliente.getInputStream();
			canalDeSaida = sckCliente.getOutputStream();

			// Para facilitar o processo de leitura e escrita dos canais
			// de entrada e saída criamos os objetos BufferedReader
			// (para leitura) e PrintWriter (para saída)
			entrada = new BufferedReader(new InputStreamReader(canalDeEntrada));
			saida = new PrintWriter(canalDeSaida, true);

			System.out.println("Digite o primeiro numero : ");
			num1 = leia.nextLine();
			saida.println(num1);

			System.out.println("Digite a operação: ");
			opc = leia.nextLine();
			saida.println(opc);

			System.out.println("Digite o segundo numero: ");
			num2 = leia.nextLine();
			saida.println(num2);
			saida.println("");

			
				String s = entrada.readLine(); // string recebe o conteudo do
												// buffer atraves do readLine.
				
				System.out.println(s);
				String s2 = entrada.readLine(); 
				System.out.println(s2);
			

			sckCliente.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
