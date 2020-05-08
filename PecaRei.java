import java.lang.Math;

public class PecaRei extends Peca{
	
	public PecaRei(int i, int j,char cor, Tabuleiro T,char tipo) {
		super(i, j,cor,T,tipo);
	}
	
	public boolean checar (int x2, int y2) {
		boolean permissao = false;
		
		if (T.getUltimoJogador() == cor)  //o jogador não pode se mover se foi o último a jogar
			return permissao;
		
		if ((Math.abs(x2-i) == 1 && Math.abs(y2-j) == 1) || (x2 == i && Math.abs(y2-j) == 1) || (y2 == j && Math.abs(x2-i) == 1)) {
			if (T.vPecas[x2][y2] == null)
				permissao = true;
			else
				permissao = (T.vPecas[x2][y2].cor != cor) ? true : false;
		}
		
		return permissao;
	}
}