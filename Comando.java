public class Comando {
	protected char tipo;
	protected char a;
	protected int b; 
	protected String c;//variáveis criadas apenas para evitar transformar os métodos em abstract
	
	public Comando(char tipo) {
		this.tipo=tipo; //se o tipo do Comando é 'm', se trata de um Movimento, 
							//se é 't' se trata de um Transforma
	}
	
	public char getTipo() {
		return tipo;
	}
	//os métodos abaixo foram criados apenas para permitir o acesso aos métodos nas duas subclasses
	public char getLetraX1() {
		return a;
	}
	public char getLetraX2() {
		return a;
	}
	public int getX1() {
		return b;
	}
	public int getY1() {
		return b;
	}
	public int getX2() {
		return b;
	}
	public int getY2() {
		return b;
	}
	public String getTransformaEm() {
		return c;
	}
}