public class Main{
    public static void main(String[] args) {
        // Criação de Variáveis
        int idade = 25;
        double altura = 1.75;
        String nome = "João";
        boolean estudante = true;

        // Operações Simples
        int outraIdade = 30;
        int somaIdades = idade + outraIdade;
        double alturaMultiplicada = altura * 2;
        String saudacao = "Olá, " + nome + "!";

        // Exibição de Resultados
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Estudante: " + estudante);
        System.out.println("Soma das idades: " + somaIdades);
        System.out.println("Altura multiplicada por 2: " + alturaMultiplicada);
        System.out.println(saudacao);
    }
}