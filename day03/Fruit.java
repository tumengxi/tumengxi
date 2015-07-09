package day03;

public abstract class Fruit {
	public String toString(){
		return "ˮ��";
	}
}

class Apple extends Fruit {
	public String toString(){
		return "ƻ��";
	}
}

class Mango extends Fruit{
	public String toString(){
		return "â��";
	}
}
class Juicer{
	public void juice(Fruit fruit){
		System.out.println("ե"+fruit+"֭");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Juicer j=new Juicer();
		Fruit fruit=new Mango();
		j.juice(fruit);
	}
}
