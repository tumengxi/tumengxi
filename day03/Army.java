package lengqiang;
interface Assaultable{
	//�ɹ����� 
	void attack();
}

interface Mobile{
	//���ƶ��� 
	void move();
}

abstract class  Weapon implements Assaultable,Mobile {  
	public void attack(){}  
	public void move(){}
}

class Tank extends Weapon{  
	public void attack(){
		System.out.println("̹�˹���������"); 
	}
	public void move(){
		System.out.println("̹���ƶ�������"); 
	}  
}

class Flighter extends Weapon{
	public void attack(){
		System.out.println("ս��������������"); 
	}
	public void move(){
		System.out.println("ս�����ƶ�������");
	}
}

class Warship extends Weapon{
	public void attack(){
		System.out.println("ս������������"); 
	}
	public void move(){
		System.out.println("ս���ƶ�������"); 
	}  
}

class Army{
	Weapon[] w; 
	int max;
	int j=0;
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public Army(int max){
		w= new Weapon[max];
		this.max=max;
		System.out.println("�����ӵ��"+max+"������������") ;
	}
	public void addWeapon(Weapon wa){
		if(j<getMax()){
			System.out.println("�������㹻��"+"������"+(j+1)+"������");
			w[j]=wa;
			j++;
		}
		else{
			System.out.println("���棺����������������������������������");
		}
	}
	public void attackAll(){
		System.out.println();
		System.out.println("��������׼��ս��������");
		for(int i=0;i<w.length;i++){
			System.out.print((i+1)+"��");
			w[i].attack();
		}
	}
	public void moveAll(){
		System.out.println();
		System.out.println("��������׼���ƶ�������");
		for(int i=0;i<w.length;i++){
			System.out.print((i+1)+"��");
			w[i].move();
		}
	}
}

