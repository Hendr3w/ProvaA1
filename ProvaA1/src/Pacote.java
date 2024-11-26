import Transportes.*;

public class Pacote {
    private boolean internacional = false;
    private float peso;

    public iTransporte envio;


    public Pacote(boolean inter, float peso){
        this.internacional = inter;
        this.peso = peso;
        selecionarEnvio();
    }

    public void mudarEnvio(iTransporte novoEnvio){
        this.envio = novoEnvio;
    }

    public void selecionarEnvio(){
        if (internacional == true){
            envio = new Navio();
            return;
        } else if (peso <= 10.0) {
            envio = new Drone();
            return;
        } else if (peso <= 100.0) {
            envio = new Aviao();
            return;
        }
        envio = new Caminhao();
    }




}
