public class Movimento extends Comando{
	private char letraX1, letraX2;
	private int x1,x2,y1,y2;
	
	public Movimento(char tipo,char letraX1, char letraX2, int x1, int y1, int x2,int y2) {
		super(tipo);
		this.letraX1=letraX1;
		this.letraX2=letraX2;
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	
	public char getLetraX1() {
		return letraX1;
	}
	public char getLetraX2() {
		return letraX2;
	}
	public int getX1() {
		return x1;
	}
	public int getY1() {
		return y1;
	}
	public int getX2() {
		return x2;
	}
	public int getY2() {
		return y2;
	}
}