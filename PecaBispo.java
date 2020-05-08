import java.lang.Math;

public class PecaBispo extends Peca{
	
	public PecaBispo(int i, int j,char cor, Tabuleiro T,char tipo) {
		super(i, j,cor,T,tipo);
	}
	
	public boolean checar (int x2, int y2) {
		boolean permissao = false;
		
		if (T.getUltimoJogador() == cor)  //o jogador não pode se mover se foi o último a jogar
			return permissao;
		
		if (Math.abs(x2-i) == Math.abs(y2-j)) {
			if (x2 > i && y2 > j) {
				for (int a = 1; i+a < x2; a++) {
					if (T.vPecas[i+a][j+a] != null)
						return permissao;
				}
			}
			else if (x2 > i && y2 < j) {
				for (int a = 1; i+a < x2; a++) {
					if (T.vPecas[i+a][j-a] != null)
						return permissao;
				}
			}
			else if (x2 < i && y2 > j) {
				for (int a = 1; i-a > x2; a++) {
					if (T.vPecas[i-a][j+a] != null)
						return permissao;
				}
			}
			else if (x2 < i && y2 < j) {
				for (int a = 1; i-a > x2; a++) {
					if (T.vPecas[i-a][j-a] != null)
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