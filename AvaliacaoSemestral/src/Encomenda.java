
public class Encomenda {
	
    private String destino;
    private double peso;
    private double dimensao;
    private boolean internacional;

    public Encomenda(String destino, double peso, double dimensao, boolean internacional) {
    	
        this.destino = destino;
        
        this.peso = peso;
        
        this.dimensao = dimensao;
        
        this.internacional = internacional;
        
    }

    public String getDestino() {
        return destino;
    }

    public double getPeso() {
        return peso;
    }

    public double getDimensao() {
        return dimensao;
    }

    public boolean isInternacional() {
        return internacional;
    }
}