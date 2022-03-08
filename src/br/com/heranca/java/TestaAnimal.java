package br.com.heranca.java;

public class TestaAnimal {

	public static void main(String[] args) {
		Cachorro cr = new Cachorro();
		Cavalo ca = new Cavalo();
		Preguica pr = new Preguica();
		
		cr.setNome("Bob");
		cr.setIdade(15);
		cr.setSom("Sim");
		cr.setCorrer("Sim");
		
		
		System.out.println("Nome: " + cr.getNome());
		System.out.println("Idade: " + cr.getIdade());
		System.out.println("Emite som: "  + cr.getSom());
		System.out.println("Corre: " + cr.getCorrer());
		System.out.println();
		
		ca.setNome("Ponio");
		ca.setIdade(9);
		ca.setSom("Sim");
		ca.setCorrer("Sim");
		
		
		System.out.println("Nome: " + ca.getNome());
		System.out.println("Idade: " + ca.getIdade());
		System.out.println("Emite Som: " + ca.getSom());
		System.out.println("Corre: " + ca.getCorrer());
		System.out.println();
		
		pr.setNome("Astride");
		pr.setIdade(12);
		pr.setSom("Sim");
		pr.setSubirArvore("Sim");
		
		
		System.out.println("Nome: " + pr.getNome());
		System.out.println("Idade: " + pr.getIdade());
		System.out.println("Emite som: " + pr.getSom());
		System.out.println("Sobe em Árvore: " + cr.getCorrer());
		System.out.println();

	}

}
