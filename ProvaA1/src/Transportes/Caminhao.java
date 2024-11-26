package Transportes;

public class Caminhao implements iTransporte {

    @Override
    public void enviar() {
        System.out.println("Enviar com Caminhão.");
    }
}
