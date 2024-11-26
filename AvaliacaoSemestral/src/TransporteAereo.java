
public class TransporteAereo implements Transporte {
	
    @Override
    public boolean podeEntregar(Encomenda encomenda) {
    	
        return encomenda.getPeso() >= 5 || encomenda.getPeso() <= 50 && encomenda.getDimensao() <= 1.5;
        
    }

    @Override
    public void entregar(Encomenda encomenda) {
    	
        System.out.println("Entregando via transporte aéreo para: " + encomenda.getDestino());
        
    }
}