public class Usuario {
    public static void main(String[] args) throws Exception{

        SmartTv tv = new SmartTv();

        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.aumentarVolume();
        System.out.println("Qual o Canal atual? "+ tv.canal);

        tv.mudarCanal(13);
        System.out.println("Qual o Canal atual? "+ tv.canal);

        tv.ligarTv();
        System.out.println("Tv esta ligada? " + tv.ligada);

        System.out.println("Volume atual:" + tv.volume);
    }
}