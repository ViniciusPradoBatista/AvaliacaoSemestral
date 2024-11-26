

public interface Transporte {
	
    boolean podeEntregar(Encomenda encomenda);
    
    void entregar(Encomenda encomenda);
    
}