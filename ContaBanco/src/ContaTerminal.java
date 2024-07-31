import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        System.out.println("Por favor, digite seu nome. ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        System.out.println("Por favor, digite o número da agência");
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da conta");
        Integer numero = sc.nextInt();
        double saldo = 200.00;

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                nome, agencia, numero, saldo);

    }
}

