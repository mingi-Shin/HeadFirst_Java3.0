package chapter02;

public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	
	
	public void startGame() {
		int round = 1;
		
		p1 = new Player("Raphael");
		p2 = new Player("Winter");
		p3 = new Player("Karina");
		
		// 플레이어가 추측한 숫자를 저장하기 위한 변수선
		int p1Num=0;
		int p2Num=0;
		int p3Num=0;
		
		// 추측한 숫자가 맞는지 여부 확
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNum = (int)(Math.random()*10);
		System.out.println("0이상 9이하의 숫자를 맞혀 보세요.");
		System.out.println("맞혀야 할 숫자는 " + targetNum + "입니다. \n");
		
		while (true) {
			//각 선수들은 숫자를 추측 
			p1.guess();
			p2.guess();
			p3.guess();
			
			p1Num = p1.number;
			//System.out.println("Raphael 선수가 추측한 숫자는 " + RGuessNum);
			p2Num = p2.number;
			//System.out.println("Winter 선수가 추측한 숫자는 " + WGuessNum);
			p3Num = p3.number;
			//System.out.println("Karina 선수가 추측한 숫자는 " + KGuessNum);
			
			if (p1Num == targetNum) {
				p1isRight = true;
			} else if (p2Num == targetNum) {
				p2isRight = true;
			} else if (p3Num == targetNum){
				p3isRight = true;
			}

			if (p1isRight || p2isRight || p3isRight) {
				System.out.print(round + "번째 시도 ");
				System.out.println("맞힌 선수가 있습니다. \n");
				System.out.println(p1.name + "선수 " + p1isRight);
				System.out.println(p2.name + "선수 " + p2isRight);
				System.out.println(p3.name + "선수 " + p3isRight);
				System.out.println("게임 끝 ");
				break; //게임이 끝났으므로 반복문 빠져나감 
			} else {
				//아직 못맞혔으므로 계속 진행
				System.out.println("정답자가 없으므로 다시 시도합니다.");
				System.out.println("----------------------------------------------------");
				round += 1;
				
			}	
		}
	}
}
