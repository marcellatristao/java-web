package cursojava.thread;
import javax.swing.JOptionPane;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {
	
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		Thread threadNota = new Thread(thread2);
		threadNota.start();
		
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usu�rio");
	}
	
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			for(int pos = 0; pos< 10; pos++) {
				System.out.println("Enviando nota fiscal");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}	
		}
	};
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			for(int pos = 0; pos< 10; pos++) {
				System.out.println("Enviando um e-mail");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}	
		}
	};
	
}
