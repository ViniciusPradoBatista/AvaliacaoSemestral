
public class TransporteMaritimo implements Transporte {
	
    @Override
    public boolean podeEntregar(Encomenda encomenda) {
    	
        return encomenda.isInternacional();
        
    }

    @Override
    public void entregar(Encomenda encomenda) {
    	
        System.out.println("Entregando via transporte marítimo para: " + encomenda.getDestino());
        
    }
}