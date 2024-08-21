
import java.util.Scanner;

public class ContaTerminal {

    public static Scanner scanner = new Scanner(System.in);
        // Intanciando a classe do perfilCliente
    public static PerfilCliente perfilCliente = new PerfilCliente();
    public static void main(String[] args) throws Exception {
       

        System.out.println("Digite o seu nome:");
        perfilCliente.setNomeCliente(scanner.nextLine());
        
        System.out.println("Agora digite o numero da conta: ");
        perfilCliente.setNumeroDaConta(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Agora digite o numero da Agência: ");
        perfilCliente.setAgencia(scanner.nextLine());

        System.out.println("Agora defina seu saldo:");
        perfilCliente.setSaldo(scanner.nextDouble());
        scanner.nextLine();

        System.out.printf(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f%n já está disponível para saque",
            perfilCliente.getNomeCliente(), perfilCliente.getAgencia(), perfilCliente.getNumeroDaConta(),
            perfilCliente.getSaldo());
        

    }

}
