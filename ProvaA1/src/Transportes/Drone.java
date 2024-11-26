package Transportes;

public class Drone implements iTransporte {

    @Override
    public void enviar() {
        System.out.println("Enviar com Drone!");
    }
}
