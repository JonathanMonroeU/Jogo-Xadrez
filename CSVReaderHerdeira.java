public class CSVReaderHerdeira extends CSVReader{
	private Comando vComandos[]; //declaração do vetor de comandos com objetos das subclasses Movimento e Transforma
	private int posX1 = 0,posX2=0,posY1=0,posY2=0;
	private char convertLetra[]= {'a','b','c','d','e','f','g','h'};
	private char l,m;
	private String s;
	
	public CSVReaderHerdeira(){
		super();
	}
	
	public void decifraComandos() {
		for(int i=0;i<commands.length;i++){
			//primeiro são captados os dados do comando e transformados em posições de matriz:
			s=commands[i];
			if (s.length()>1) {
				l=s.charAt(0);
				posY1 =Character.getNumericValue(s.charAt(1))-1;
				m=s.charAt(3);
				posY2 =Character.getNumericValue(s.charAt(4))-1;
			
				for (int k=0;k<=7;k++) {
					if(l==convertLetra[k])
						posX1 = k;
					if(m==convertLetra[k])
						posX2=k;
				}
				vComandos[i]=new Movimento('m',l,m,posX1,posY1,posX2,posY2);
				
			}else {
				vComandos[i]=new Transforma('t',s);
			}
		}
	}
	
	public Comando[] requestComandos() {
		vComandos=new Comando[commands.length];
		decifraComandos();
	    return vComandos;
	  }
}