public class Xadrez {
	public static void main(String[] args) {
		Tabuleiro T=new Tabuleiro();
		T.instanciaPecas(T);
		
		
		boolean autorizado;
		
		System.out.println("Tabuleiro  inicial:");
		T.mostraTabuleiro();
		
		CSVReaderHerdeira csv = new CSVReaderHerdeira();
		csv.setDataSource("/home/jonathan/eclipse-workspace/Xadrez/src/Movimentos.csv");
		Comando comandos[] = csv.requestComandos();
	
		for(int i=0;i<comandos.length;i++){
			if (comandos[i].getTipo()=='t') {
				T.transformaPeca(comandos[i].getTransformaEm(),T);
			}
			else {
				//as peças checam se o comando é válido e solicitam ao tabuleiro a movimentação
				if (T.vPecas[comandos[i].getX1()][comandos[i].getY1()]!=null) {
					System.out.println("Source: "+comandos[i].getLetraX1()+""+(comandos[i].getY1()+1));
					System.out.println("Target: "+comandos[i].getLetraX2()+""+(comandos[i].getY2()+1));
					
					autorizado=T.vPecas[comandos[i].getX1()][comandos[i].getY1()].checar(comandos[i].getX2(),comandos[i].getY2());
					
					if (autorizado) { 
						T.modificaTabuleiro(comandos[i].getX1(),comandos[i].getY1(),comandos[i].getX2(),comandos[i].getY2());
					}else 
						System.out.println("A peça não pode fazer o movimento solicitado.");	
				}else
					System.out.println("Não há peça na posição solicitada.");
			}
			T.mostraTabuleiro();
		}
		
		
	}
}