public class Tabuleiro {
	public Peca vPecas[][];
	private char ultimoJogador='X'; //nenhuma peça foi movimentada ainda
	private int ultX,ultY; //ultima posição (x,y) para onde se movimentou uma peça
	
	public Tabuleiro(){
		vPecas=new Peca[8][8];
	}
	
	public char getUltimoJogador() {
		return ultimoJogador;
	}
	
	public void instanciaPecas(Tabuleiro T) {
		int x,y;
		for(y=7;y>=0;y--) {		//criação das peças nas posições em que elas devem iniciar
			if (y==7) {
				for (x=0;x<=7;x++) {
					if (x==0||x==7)
						vPecas[x][y]=new PecaTorre(x,y,'P',T,'T');
					if (x==1||x==6)
						vPecas[x][y]=new PecaCavalo(x,y,'P',T,'H');
					if (x==2||x==5)
						vPecas[x][y]=new PecaBispo(x,y,'P',T,'B');
					if (x==3)
						vPecas[x][y]=new PecaRei(x,y,'P',T,'K');
					if (x==4)
						vPecas[x][y]=new PecaRainha(x,y,'P',T,'Q');
				}	
			}else if (y==6) {
				for (x=0;x<=7;x++) {
					vPecas[x][y]=new PecaPeao(x,y,'P',T,'P');	
				}
			}else if (y==1) {
				for (x=0;x<=7;x++) {
					vPecas[x][y]=new PecaPeao(x,y,'B',T,'p');	
				}
			}else if (y==0) {
				for (x=0;x<=7;x++) {
					if (x==0||x==7)
						vPecas[x][y]=new PecaTorre(x,y,'B',T,'t');
					if (x==1||x==6)
						vPecas[x][y]=new PecaCavalo(x,y,'B',T,'h');
					if (x==2||x==5)
						vPecas[x][y]=new PecaBispo(x,y,'B',T,'b');
					if (x==3)
						vPecas[x][y]=new PecaRainha(x,y,'B',T,'q');
					if (x==4)
						vPecas[x][y]=new PecaRei(x,y,'B',T,'k');	
				}	
			}	
		}	
	}
	
	public void mostraTabuleiro() { 	
		int x,y;
		for(y=7;y>=0;y--) {
			System.out.print(y+1);
			for (x=0;x<=7;x++) {
				if (vPecas[x][y]!=null)
					System.out.print(" "+vPecas[x][y].getTipo());
				else 
					System.out.print(" -");
			}System.out.print("\n");
		}	
		System.out.println("  a b c d e f g h");
		System.out.print("\n");
	}
	
	public void transformaPeca(String transformaEm, Tabuleiro T) {
		if (ultY==7 && vPecas[ultX][ultY].getTipo()=='p') {
			if (transformaEm.equals("t"))
				vPecas[ultX][ultY]=new PecaTorre(ultX,ultY,'B',T,'t');
			if (transformaEm.equals("h"))
				vPecas[ultX][ultY]=new PecaCavalo(ultX,ultY,'B',T,'h');
			if (transformaEm.equals("b"))
				System.out.println(transformaEm);
				vPecas[ultX][ultY]=new PecaBispo(ultX,ultY,'B',T,'b');
			if (transformaEm.equals("q"))
				vPecas[ultX][ultY]=new PecaRainha(ultX,ultY,'B',T,'q');	
		}
		else if (ultY==0 && vPecas[ultX][ultY].getTipo()=='P') {
			if (transformaEm.equals("T"))
				vPecas[ultX][ultY]=new PecaTorre(ultX,ultY,'P',T,'T');
			if (transformaEm.equals("H"))
				vPecas[ultX][ultY]=new PecaCavalo(ultX,ultY,'P',T,'H');
			if (transformaEm.equals("B"))
				vPecas[ultX][ultY]=new PecaBispo(ultX,ultY,'P',T,'B');
			if (transformaEm.equals("Q"))
				vPecas[ultX][ultY]=new PecaRainha(ultX,ultY,'P',T,'Q');
		}
	}
	
	public void modificaTabuleiro(int posX1, int posY1, int posX2,int posY2) {
		
		//o método deixa vazio o espaço de onde a peça movida saiu 
		
			vPecas[posX2][posY2]=vPecas[posX1][posY1];
			vPecas[posX2][posY2].setI(posX2);
			vPecas[posX2][posY2].setJ(posY2);
			ultimoJogador = vPecas[posX2][posY2].getCor();
			
			vPecas[posX1][posY1]=null;
			
			ultX=posX2; ultY=posY2;
	}
}