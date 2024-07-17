public class SmartTv {

 
    boolean ligada=false;
    int canal=1;
    int volume = 25;  
    
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume: " + volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Novo canal selecionado: "+ novoCanal);
    }

    public void aumentarCanal(){
        canal++;
        
    }
    public void diminuirCanal(){
        canal--;

    }
    public void ligarTv(){
        ligada=true;
        System.out.println("Ligando a Tv");
    }
    public void desligarTv(){
        ligada=false;
        System.out.println("Desligando a Tv");
    }

    
}   
