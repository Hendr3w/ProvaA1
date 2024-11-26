public class Teste {
    public static void main(String[] args) {

        Pacote p = new Pacote(true, 5);

        p.envio.enviar();

        Pacote p2 = new Pacote(false,  5);

        p2.envio.enviar();

        Pacote p3 = new Pacote(false, 90);

        p3.envio.enviar();

        Pacote p4 = new Pacote(false, 150);
        p4.envio.enviar();



    }
}