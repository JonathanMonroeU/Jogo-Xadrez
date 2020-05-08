import java.lang.Math;

public class PecaPeao extends Peca{
	private int qtd;

	public PecaPeao(int i, int j,char cor, Tabuleiro T,char tipo) {
		super(i, j,cor,T,tipo);
		qtd=0; //quantidade de movimentos já feitos pelo peão
	}
	
	public boolean checar (int x2, int y2) {
		boolean permissao = false;
		
		if (T.getUltimoJogador() == cor)  //o jogador não pode se mover se foi o último a jogar
			return permissao;
		
		if ((tipo == 'p' && y2-j == 2 && T.vPecas[i][2] == null) || (tipo == 'P' && y2-j == -2 && T.vPecas[i][5] == null)) { 
			if (x2-i==0 && qtd==0) {
				permissao=(T.vPecas[x2][y2] == null) ? true : false;
				qtd++;
			}
		}
		
		if ((tipo == 'p' && y2-j == 1) || (tipo == 'P' && y2-j == -1)) { //se o peão avançou pra frente
			if (Math.abs(x2-i) == 1) 
				if (T.vPecas[x2][y2] == null)
					return permissao;
				else	
					permissao=(T.vPecas[x2][y2].cor !=cor)? true : false;
			if (x2-i== 0)
				permissao=(T.vPecas[x2][y2] == null) ? true : false;
		}
		return permissao;
	}
}