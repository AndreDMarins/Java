public class Phrase{
	public static void main (String[] args){
		//cria tres conjuntos de palavras onde será feita a seleção. posso colocar mais palavras.
		String[] wordListOne = {"24/7", "varias camadas","30.000 pes","B-to-B","Todos ganham","front-end","Baseado na Web","difundindo","inteligente","seis sigma","caminho critico","dinamico"};
		String[] wordListTwo = {"habilitado","adesivo","valor agregado","orientado","central","distribuido","agrupado","solidificado","independente da máquina","posicionado","em rede", "dedicado", "alavancado","alinhado","destinado","compartilhado", "cooperativo","acelerado"};
		String[] wordListThree = {"processo","ponto maximo","solucao","arquitetura","habilitacao no nucleo","estrategia","mindshare", "portal","espaco","visao","paradigma","missao"};
		
		//retorna a quantidade de palavras em cada matriz/lista
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		for(int x=0; x<10; x++){
					
			//gere tres numeros aleatórios
			int rand1 = (int) (Math.random()*oneLength);
			int rand2 = (int) (Math.random()*twoLength);
			int rand3 = (int) (Math.random()*threeLength);
		
			//construindo a frase
		
			String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
			//exibindo a frase
		
			System.out.println("Precisamos de " + phrase);
		}//fim do for
	}
	
}