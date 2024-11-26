import java.util.ArrayList;
import java.util.List;

public class SistemaEntrega {
	
    private List<Transporte> transportes = new ArrayList<>();

    public void adicionarTransporte(Transporte transporte) {
    	
        transportes.add(transporte);
        
    }
    
    public void processarEntrega(Encomenda encomenda) {
    	
        for (Transporte transporte : transportes) {
        	
            if (transporte.podeEntregar(encomenda)) {
            	
                transporte.entregar(encomenda);
                return;
                
            }
        }
        
        System.out.println("Nenhum transporte disponível para a encomenda.");
        
    }
}