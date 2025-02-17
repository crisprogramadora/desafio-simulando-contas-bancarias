//TODO: conhecer e importar a classe Scanner

//Exibir as mensagens para o usuário

//Obter pela scanner os valores digitados no terminal

//Exibir a mensagem conta criada

//link do repositório do desafio: https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe
import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome");
        String nome = scanner.next();

        System.out.println("Por favor, digite o seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o número da agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da conta!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + ", " + 
        "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + 
        " e seu saldo " + saldo + " já está disponível para saque.");


    }
}



