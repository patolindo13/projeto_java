import java.util.Scanner;

public class Cashback {

    public static void main(String[] args) {
        // Criar um objeto Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar o nome do cliente
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        // Solicitar a idade do cliente
        System.out.print("Digite a idade do cliente: ");
        int idade = scanner.nextInt();

        // Solicitar o valor da compra
        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        // Inicializar o cashback com 0
        double cashback = 0;

        // Verificar as condições para aplicar o cashback
        if (idade >= 21) {
            // Se a idade é 21 ou mais
            if (valorCompra < 1000) {
                cashback = valorCompra * 0.05; // 5% de cashback
            } else {
                cashback = valorCompra * 0.07; // 7% de cashback
            }
        } else {
            // Se a idade é menor que 21
            if (valorCompra < 1000) {
                cashback = valorCompra * 0.07; // 7% de cashback
            } else {
                cashback = valorCompra * 0.10; // 10% de cashback
            }
        }

        // Exibir os resultados
        System.out.println("Cliente: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.printf("Cashback: R$ %.2f\n", cashback);

        // Fechar o scanner
        scanner.close();
    }
}

