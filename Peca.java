public class Peca {
	protected int i,j;  //posição em que a peça se encontra
	protected char cor,tipo;
	protected Tabuleiro T;
	
	Peca(int i,int j,char cor,Tabuleiro T, char tipo){
		this.i=i; 
		this.j=j;
		this.cor=cor;
		this.T=T;
		
		this.tipo=tipo; //de qual dos 6 tipos é a peça
	}
	public boolean checar(int a,int b) { 
		return false;
	}
	public char getTipo() {
		return tipo;
	}
	public void setI(int i) {
		this.i = i;
	}
	public void setJ(int j) {
		this.j = j;
	}
	public char getCor() {
		return cor;
	}
}