
public class Main {
    public static void main(String[] args) {
        SistemaEntrega sistema = new SistemaEntrega();

        sistema.adicionarTransporte(new TransporteDrone());
        sistema.adicionarTransporte(new TransporteTerrestre());
        sistema.adicionarTransporte(new TransporteMaritimo());
        sistema.adicionarTransporte(new TransporteAereo());


        Encomenda encomenda1 = new Encomenda("Bahia", 2, 0.1, false);
        Encomenda encomenda2 = new Encomenda("Japão", 300, 1.2, true);
        Encomenda encomenda3 = new Encomenda("Boa Esperança - PR", 3, 0.3, false);
        Encomenda encomenda4 = new Encomenda("Florianopólis", 40, 0.3, false);

        sistema.processarEntrega(encomenda1);
        sistema.processarEntrega(encomenda2);
        sistema.processarEntrega(encomenda3);
        sistema.processarEntrega(encomenda4);
    }
}
