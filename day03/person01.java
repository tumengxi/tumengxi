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
		person02 li=new person02("Ϳ��Ϫ", "Ů", 165);
		System.out.println("������"+leng.name);
		System.out.println("�Ա�"+leng.sex);
		System.out.println("��ߣ�"+leng.lg+"cm");
		li.introduce();
	}
}