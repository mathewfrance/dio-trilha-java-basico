import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //TODO: conhecer e importar a classe scanner
       Scanner keybordScanner = new Scanner(System.in);

       // Exibir mensagens para o usuario
        System.out.println("Bem vindo ao nosso Sistema de Conta Bancaria.");
        System.out.println("Para iniciar, informe os dados a seguir.");

       //Obter pela classe scanner os valores digitados no terminal
       System.out.print("Informe seu nome: ");
       String nomeCliente = keybordScanner.nextLine();

       System.out.print("Informe o Numero da conta: ");
       int numeroConta = keybordScanner.nextInt();
       System.out.print("Informe o Numero da agencia: ");
       int numeroAgencia = keybordScanner.nextInt();
       String numeroAgenciaFormatado = String.format("%03d-%d", numeroAgencia / 10, numeroAgencia % 10);
       System.out.print("Informe o saldo: ");
       Double saldo = keybordScanner.nextDouble();

       
       
       //Exibir a mensagem conta criada
       System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ numeroAgenciaFormatado +", conta "+ numeroConta +" e seu saldo "+ saldo +" já está disponível para saque.");
       keybordScanner.close();
    }
}
