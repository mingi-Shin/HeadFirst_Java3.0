package chapter02;

public class Player {
	int number = 0;
	String name;
	// 추측한 숫자를 저장할 변수
	
	public Player(String name) {
		this.name = name;
	}
	
	public void guess() {
		number = (int) (Math.random()*10);
		System.out.println(name + "선수가 추측한 숫자 : " + number);
	}

}
