public class GuessGame{
	//GuessGame tem 3 variáreis de instancia para os 3 objetos players
	Player p1;
	Player p2;
	Player p3;
		
	public void startGame(){
		//cria 3 objetos player e atribui a eles as 3 variáveis  de instancia player
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		//declara 3 variáveis para armazenar os palpites dos jogadores
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		//declara 3 variáreis para armazenar verdadeiro ou falso de acordo com a resposta de  cada player
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		//cria o numero alvo que os players deverão adivinhar
		int targetNumber = (int) (Math.random()*10);
		
		while(true){
			System.out.println("O numero a adivinhar eh "+ targetNumber);
			
			//chama o método guess para cada jogador
			p1.guess();
			p2.guess();
			p2.guess();
			
			//obtém o palpite de cada jogador (o resultado da execução do seu método guess()) acessando a variável numerica de cada um
			guessp1 = p1.number;
			System.out.println ("O Jogador um forneceu o palpite "+ guessp1);
			guessp2 = p2.number;
			System.out.println("O Jogador dois forneceu o palpite "+ guessp2);
			guessp3 = p3.number;
			System.out.println("O Jogador tres forneceu o palpite "+ guessp3);
			
			//verifica o palpite de cada jogador par aver se é igual ao numero alvo. se um jogador acertar será atribuido true a sua variável (definimos false no inicio)
			if (guessp1 == targetNumber){
				p1isRight = true;
			}
			if(guessp2 == targetNumber){
				p2isRight = true;
			}
			if(guessp3 == targetNumber){
				p3isRight = true;
			}
			
			//se o player 1 ou 2 ou 3 acertarem
			if(p1isRight || p2isRight || p3isRight){
				System.out.println("Temos um vencedor");
				System.out.println("O Jogador um acertou? " + p1isRight);
				System.out.println("O jogador dois acertou? " + p2isRight);
				System.out.println("O jogador tres acertou? "+ p3isRight);
				System.out.println("Fim do jogo");
				break;// fim do jogo, portanto saia do loop
			}
			else{
				//devemos continuar porque ninguém acertou!
			System.out.println("Os jogadores terão que tentar novamente.");

			}
		}//fim do while
	}//fim do metodo startGame

}//fim da classe GuessGame
