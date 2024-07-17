public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 1500;
        double salarioMinimo1 = 15.00;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        
        final double VALOR_DE_PI = 3.14;
        
        System.out.println("salario minimo: " + salarioMinimo + 
        " salario minimo1: "+ salarioMinimo1 + " Numero curto: "+ numeroCurto + " Numero Normal: " + numeroNormal + " Numero Curto 2: " +numeroCurto2 + " Valor de Pi: " + VALOR_DE_PI);
        

    }
}
