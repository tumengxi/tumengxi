package day03;
public class student {
	String name;
	String sex;
	int lg;
	void movement(){
		System.out.println("看小说");
	}
	void sleep(){
		System.out.println("玩游戏");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student l=new student();
		l.name="涂梦溪";
		l.sex="女";
		l.lg=165;
		System.out.println("姓名："+leng.name);
		System.out.println("性别："+leng.sex);
		System.out.println("身高："+leng.lg+"cm");
		l.movement();
		l.sleep();
	}

}

