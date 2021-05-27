import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int quantidadeAlunos = 0;
		double totalConsumo = 0; // ZERANDO. Essa var�avel que recebe a soma do total do consumo precisa ser criada fora do FOR porque sen�o zeraria a soma a cada loop e s� retornaria como resultado o �ltimo valor digitado, e nunca uma soma.
		System.out.println("Digite a quantidade de alunos na turma:");
		quantidadeAlunos = leitor.nextInt();
		
		
		double valores[] = new double[quantidadeAlunos]; // declara��o de vetor array
		int numeroAluno = 0;
		for ( int i = 0; i < quantidadeAlunos; i++ ) {
			//int numeroAluno = i + 1; manter aqui obriga a cria��o uma e outra vez da vari�vel (diminui perfomance), ao ficar fora do FOR basta usar esta var�avel sem precisar cri�-la novamente. Evitar fazer instancias dentro do FOR
			numeroAluno = i + 1;
			System.out.println("Por favor, digite o consumo do " + numeroAluno +  "� aluno");
			//double valorConsumo = leitor.nextDouble();
			//System.out.println("O aluno " + numeroAluno + " consumiu R$ " + valorConsumo);
			//aqui iria a vari�vel double totalConsumo = 0; mas s� retornaria o �ltimo valor digitado e nunca a soma.
			//totalConsumo += valorConsumo; toda esa parte do c�digo n�o � interessante ficar dentro do for
			valores[i] = leitor.nextDouble();
			totalConsumo = totalConsumo + valores[i];
		}
		System.out.println("***********");
		System.out.println(valores.length);
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("O consumo do aluno " + numeroAluno + " foi de R$" + valores[i]);
		}
		
		System.out.println("*********Total R$: " + totalConsumo); //esse tamb�m fica fora do for para imprimir uma vez s�
		
		leitor.close();
		
		/*
		double aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9, aluno10, total;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Por favor, digite o consumo do 1� aluno");
		aluno1 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 2� aluno");
		aluno2 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 3� aluno");
		aluno3 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 4� aluno");
		aluno4 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 5� aluno");
		aluno5 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 6� aluno");
		aluno6 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 7� aluno");
		aluno7 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 8� aluno");
		aluno8 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 9� aluno");
		aluno9 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 10� aluno");
		aluno10 = leitor.nextDouble();
		
		total = aluno1 + aluno2 + aluno3 + aluno4 + aluno5 + aluno6 + aluno7 + aluno8 + aluno9 + aluno10;
		
		System.out.println("O aluno 1 consumiu R$" + aluno1);
		System.out.println("O aluno 2 consumiu R$" + aluno2);
		System.out.println("O aluno 3 consumiu R$" + aluno3);
		System.out.println("O aluno 4 consumiu R$" + aluno4);
		System.out.println("O aluno 5 consumiu R$" + aluno5);
		System.out.println("O aluno 6 consumiu R$" + aluno6);
		System.out.println("O aluno 7 consumiu R$" + aluno7);
		System.out.println("O aluno 8 consumiu R$" + aluno8);
		System.out.println("O aluno 9 consumiu R$" + aluno9);
		System.out.println("O aluno 10 consumiu R$" + aluno10);

		System.out.println("O total de consumo foi de R$" + total);
		
		leitor.close();
		*/
		

	}

}
