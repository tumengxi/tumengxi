package day03;


public class person01{
	String name;
	String sex;
	int lg;
	person01(String n,String s,int h){
		name=n;
		sex=s;
		lg=h;
	}
	void introduce(){
		System.out.println("Hello Everbaby");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person02 li=new person02("涂梦溪", "女", 165);
		System.out.println("姓名："+leng.name);
		System.out.println("性别："+leng.sex);
		System.out.println("身高："+leng.lg+"cm");
		li.introduce();
	}
}