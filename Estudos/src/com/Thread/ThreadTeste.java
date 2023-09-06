package com.Thread;

public class ThreadTeste {

	public static void main(String[] args) {
		// Objeto para manupilar o thread.
		Thread threadTeste = new Thread(thread1);
		threadTeste.start();

		Thread threadTest2 = new Thread(thread2);
		threadTest2.start();

	}

	// interface em Java que é usada para representar uma tarefa que pode ser
	// executada em uma thread.
	private static Runnable thread1 = new Runnable() {

		// Métedo que executa o codigo.
		public void run() {
			for (int pos = 0; pos < 10; pos++) {
				try {

					// tempo de pausa em milisegundos desejado para realizar a operação a seguir.
					Thread.sleep(500);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

				System.out.println("Fazendo a operação");
			}

		}
	};

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			for (int pos = 0; pos < 10; pos++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("Fazendo a operação sesundaria");
			}

		}
	};

}
