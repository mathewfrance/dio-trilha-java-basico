import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {    
        try {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro parametro: ");
        int parametroUm = scanner.nextInt();
        System.out.print("Digite o segundo parametro: ");
        int parametroDois = scanner.nextInt();
        
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
            scanner.close();
        } catch (ParametrosInvalidosException exception ) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
        }
        
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm e maior que parametroDois e lancar exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O parametroDois precisa ser maior que o parametroUm");
        }


        int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o numero " + i);
        }

    }

}