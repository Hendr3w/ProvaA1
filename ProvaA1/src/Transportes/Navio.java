package Transportes;

public class Navio implements iTransporte {
    @Override
    public void enviar() {
        System.out.println("Enviar com Navio!");
    }
}
