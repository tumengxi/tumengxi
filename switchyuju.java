import java.util.Scanner;

public class switchyuju {
   public static void main(String[] args){
	   //TODO Auto-generated method stub
	   Scanner scanner=new Scanner(System.in);
	   int day=scanner.nextInt();
	   String monthString="";
	   //根据day的值判断是星期几。星期一-星期日：1-7；
	   switch(day)
	   {
	   case 1:monthString="monday";break;
	   case 2:monthString="tuesday";break;
	   case 3:monthString="wednesday";break;
	   case 4:monthString="thursday";break;
	   case 5:monthString="friday";break;
	   case 6:monthString="saturday";break;
	   case 7:monthString="sunday";break;
	   default:monthString="error day";
	   }
	   System.out.println();
   }
   
}
