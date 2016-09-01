package thread;
public class ExemploThread1Estrategia extends Thread {

	public ExemploThread1Estrategia(String str) {
		super(str);
		start();
	}

	public void run() {
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			System.out.println(i + " " + getName());
		}
		long fim = System.currentTimeMillis();
		System.out.println("tempo: " + (fim - inicio));
		System.out.println("Termina thread " + getName());
	}

	public static void main(String[] args) {
		new ExemploThread1Estrategia("Vasco");
		new ExemploThread1Estrategia("Flamengo");
		new ExemploThread1Estrategia("Fluminense");
		new ExemploThread1Estrategia("Botafogo");
	}

}
