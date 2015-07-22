package corelesson3;

import java.util.LinkedList;

public class Worm {
	private LinkedList<Node> nodes = new LinkedList<Node>();
	public static final int UP = -10;
	public static final int DOWN = 10;
	public static final int LEFT = -1;
	public static final int RIGHT = 1;
	private int dir;//�洢��ǰ����
	public Worm(){
		nodes.add(new Node(3,9));
		nodes.add(new Node(4,9));
		nodes.add(new Node(5,9));
		nodes.add(new Node(5,10));
		nodes.add(new Node(5,11));
		nodes.add(new Node(6,11));
		nodes.add(new Node(7,11));
		this.dir = RIGHT;
	}
	public boolean contains(int i,int j){
		return nodes.contains(new Node(i,j));
	}
	public void step(){
		//ȥβ��
		nodes.removeLast();
		//��ͷ
		Node head = nodes.getFirst();
		int i = head.getI() + dir  / 10;
		int j = head.getJ() + dir % 10;
		nodes.addFirst(new Node(i,j));
	}
	public void step(int dir){
		if(this.dir+dir==0)
			throw new RuntimeException("������������");
		this.dir = dir;
		step();
	}
	
}
