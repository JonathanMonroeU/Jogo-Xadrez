public class Transforma extends Comando{
	private String transformaEm;
	
	public Transforma(char tipo, String transformaEm) {
		super(tipo);
		this.transformaEm=transformaEm;
	}
	public String getTransformaEm() {
		return transformaEm;
	}
}