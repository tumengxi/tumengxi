package day03;

import java.util.jar.Attributes.Name;

public class phone {

	String name ;
	String brand;
	int price;
	//xing wei (fang fa)
	void call(){
		System.out.println("打电话。。。");
	}
	void sendmsg (){
		System.out.println("发短信。。。");
	}
	public static void main(String[] args) {
		phone p = new phone();
		p.name =  "shouji";
		p.brand = "dajiji";
		p.price = 998;
		System.out.println("duixiang："+p.name);
		System.out.println("pingpai："+p.brand);
		System.out.println("jiage："+p.price+"yuan");
		p.call() ;
		p.sendmsg();
		
	}

}
