package lesson3;

public class MainBord {
	private Memory memory;
	private DisplayCard displayCard;
	public MainBord(){}
	public MainBord(Memory memory, DisplayCard displayCard) {
		this.memory = memory;
		this.displayCard = displayCard;
	}
	//�����ڴ�
	public void cacheData(){
		memory.cache();
	}
	//�����Կ�
	public void disp(){
		displayCard.display();
	}
}
