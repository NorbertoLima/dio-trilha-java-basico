import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Bem Vindo ao Banco NL! Por favor, digite o seu nome:");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite o número da sua agência:");
        String agencia = scanner.next();

        System.out.println("Insira o número da sua conta, sem o dígito:");
        int conta = scanner.nextInt();

        System.out.println("Digite o valor que deseja depositar em sua conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigada por criar uma conta em nosso banco! Sua agência é " + agencia + ", e sua conta é " + conta + ". O seu saldo " + saldo + " já está disponível para saque!");
    }
}