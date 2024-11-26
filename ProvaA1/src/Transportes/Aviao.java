package Transportes;

public class Aviao implements iTransporte {

    @Override
    public void enviar() {
        System.out.println("Enviar com Avião!");
    }
}
