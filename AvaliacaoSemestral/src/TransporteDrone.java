
public class TransporteDrone implements Transporte {
	
    @Override
    public boolean podeEntregar(Encomenda encomenda) {
    	
        return !encomenda.isInternacional() && encomenda.getPeso() <= 2.0 && encomenda.getDimensao() <= 0.5;
        
    }

    @Override
    public void entregar(Encomenda encomenda) {
    	
        System.out.println("Entregando via drone para: " + encomenda.getDestino());
    }
}