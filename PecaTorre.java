import java.lang.Math;

public class PecaTorre extends Peca{
	
	public PecaTorre(int i, int j,char cor, Tabuleiro T,char tipo) {
		super(i, j,cor,T,tipo);
	}
	
	public boolean checar (int x2, int y2) {
		boolean permissao = false;
		
		if (T.getUltimoJogador() == cor)  //o jogador não pode se mover se foi o último a jogar
			return permissao;
		
		if (x2 == i && Math.abs(y2-j) > 0) {
			if (y2 > j) {
				for (int a = j+1; a < y2; a++) {
					if (T.vPecas[i][a] != null)
						return permissao;
				}
			}
			else {
				for (int a = j-1; a > y2; a--) {
					if (T.vPecas[i][a] != null)
						return permissao;
				}
			}
		}
		else if (y2 == j && Math.abs(x2-i) > 0) {
			if (x2 > i) {
				for (int a = i+1; a < x2; a++) {
					if (T.vPecas[a][j] != null)
						return permissao;
				}
			}
			else {
				for (int a = i-1; a < y2; a--) {
					if (T.vPecas[a][i] != null)
						return permissao;
				}
			}
		}
		else
			return permissao;
		
		
		if (T.vPecas[x2][y2] == null)
			permissao = true;
		else
			permissao = (T.vPecas[x2][y2].cor != cor) ? true : false;
		
		return permissao;
	}	
}