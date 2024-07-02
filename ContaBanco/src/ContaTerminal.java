import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);

        System.out.println("Olá! Seja bem-vindo (a) ao banco XXX! Digite o seu nome:\n");
        String nome = texto.next();

        System.out.println("Digite o seu sobrenome:\n");
        String sobrenome = texto.next();

        System.out.println("Digite o número da Agência. Exemplo: 1021\n");
        int conta = texto.nextInt();

        System.out.println("Digite o número da conta Exemplo: 011-5\n");
        String numeroConta = texto.next();

        double saldoConta = 237.48;

        System.out.println("Olá, obrigado " + nome + " " + sobrenome + 
        " por criar uma conta em nosso banco, sua agência é " + conta+ 
        ", conta de número " + numeroConta + " e seu saldo " + saldoConta + 
        " já está disponível para saque.");

    }
}
