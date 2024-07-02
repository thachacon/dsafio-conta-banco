import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        //TO DO: conhecer e importar a classe Scanner
        // exibir as mensagens para o nosso usuário
        // obter pela classe scanner os valores digitados no terminal 
        // exibir a mensagem conta criada
        Scanner texto = new Scanner(System.in);

        System.out.println("Olá! Seja bem-vindo (a) ao banco Dio! Digite o seu nome:\n");
        String nome = texto.next();

        System.out.println("Digite o seu sobrenome:\n");
        String sobrenome = texto.next();

        System.out.println("Digite o número da Agência. Exemplo: 1021\n");
        int conta = texto.nextInt();

        String numeroConta = "067-8";
        double saldoConta = 237.48;

        System.out.println("Olá, obrigado " + nome + " " + sobrenome + " por criar uma conta em nosso banco, sua agência é " + conta+ ", conta de número " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.");

    }
}
