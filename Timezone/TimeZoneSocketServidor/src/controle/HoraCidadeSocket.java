package controle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HoraCidadeSocket {

	private ServerSocket sckServidor;

	private Double resultado = 0.0;
	HorarioCidades horaCidade = new HorarioCidades();

	public HoraCidadeSocket() throws IOException {
		// Criando o ServerSocket
		this.sckServidor = new ServerSocket(4000);
		// Verificando e atendendo as requsições. Cada requisição
		// será tratada por uma thread específica através da
		// estratégia colocada na classe AtenderRequisicao.
		for (;;) {
			System.out.println("estou vivo");
			Socket requisicao = this.sckServidor.accept();

			InputStream canalDeEntrada;
			OutputStream canalDeSaida;
			BufferedReader entrada;
			PrintWriter saida;

			try {
				// Recuperando os canais de comunicação do socket

				canalDeEntrada = requisicao.getInputStream();
				canalDeSaida = requisicao.getOutputStream();
				// Para facilitar o processo de leitura e escrita dos canais
				// de entrada e saída criamos os objetos BufferedReader
				// (para leitura) e PrintWriter (para saída)
				entrada = new BufferedReader(new InputStreamReader(canalDeEntrada));
				saida = new PrintWriter(canalDeSaida, true);
				// Envia um texto dizendo que a requisição foi aceita
				saida.println("Requisição Aceita pelo Servidor ");
				// Para cada linha enviada será reenviada pelo servidor
				// acrescentando-se a String "Echo:" em seu início.

				String cidadeContinente = entrada.readLine();

				

				String hora = horaCidade.devolverHora(cidadeContinente);
				

				saida.println("A hora da cidades: "+ cidadeContinente +" é:" + hora);

				saida.println(" ");

				// Fechando o socket
				requisicao.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
