package thread;





public class ExemploThread2Estrategia implements Runnable{

	private Thread thread;
	
	private String print;
	
	
	
	


	public void metodoQueCriaNovaThread(String print)
	{
	this.print = print;
	this.thread = new Thread(this);
	this.thread.start();
	}
	
	
	@Override
	public void run() {
				long inicio = System.currentTimeMillis();
				for (int i = 0; i < 1000; i++) {
					System.out.println(i + " " + print);
				}
				long fim = System.currentTimeMillis();
				System.out.println("tempo: " + (fim - inicio));
				System.out.println("Termina thread " + print);
		
	}

	

	public static void main(String[] args) {
		new ExemploThread2Estrategia().metodoQueCriaNovaThread("vasco");;
		new ExemploThread2Estrategia().metodoQueCriaNovaThread("Flamengo");;
		new ExemploThread2Estrategia().metodoQueCriaNovaThread("Fluminense");;
		new ExemploThread2Estrategia().metodoQueCriaNovaThread("Botafogo");;
		
	
	}
	
	

}
