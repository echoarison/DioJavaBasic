//importando packages
import edu.dio.Metodos.SmartTv;

public class Usuario {
    
    public static void main(String[] args){
        
        SmartTv smartTv = new SmartTv();

        //exibindo pro user
        System.out.println("Status da Tv: " + smartTv.ligada);
        System.out.println("Canal selecionado: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar(); //ligando a tv

        System.out.println("Status da Tv: " + smartTv.ligada);

        smartTv.aumentarVolume();

        System.out.println("Volume: " + smartTv.volume);

        smartTv.abaixarVolume();

        System.out.println("Volume: " + smartTv.volume);
    }

}
