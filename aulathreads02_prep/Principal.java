package aulathreads02_prep;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = "d";
		Thread threadassinaturas1 = new Thread(new TarefaBuscaTextual("assinaturas1.txt", nome));
		Thread threadassinaturas2 = new Thread(new TarefaBuscaTextual("assinaturas2.txt", nome));
		Thread threadAutores = new Thread(new TarefaBuscaTextual("autores.txt", nome));

		threadassinaturas1.start();
		threadassinaturas2.start();
		threadAutores.start();
		
	
	}
	

}
