import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
 
//������
public class calssTwo {
   
  public static void main(String[] args) {
	  first:{  
	  boolean t=true;
	  int result;
   //�������һ����100���ڵ�����
    second:{
		int number = (int)(Math.random()*100);
		System.out.println("1.��ʼ��Ϸ");
		System.out.println("2.�˳���Ϸ");
		System.out.println("3.����һ��");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if (a!=1&&a!=3)
		  System.exit(0);
		else {
		//shit+Ctrl+o
		System.out.println("\n***********������С��Ϸ����hold��ס��*********");
		System.out.println("\n  ********������ֲ������������㣡*********\n");
		System.out.println("�����Ƕ����Խ�����һ�°ɣ�С��ʾ������һ����1��100������");
		}
		long sTartTime=System.currentTimeMillis();//����һ��ʱ�����
		for(int i=1;i<100;i++){
		System.out.println("���������"+i+"�εĲ²�");
		result=calssTwo.guess(i);//ͨ���������뺯���õ�������
    //ͨ���Ƚ��������̨
		if(result>number)
			System.out.println("������˼�������µ����ִ����յ�����!");
		else if(result < number)
			System.out.println("������˼�������µ�����С���յ�����!");
		else {
			SimpleDateFormat sNowDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			long sEndTime=System.currentTimeMillis();
			System.out.println("\n  ***********��ȷ�𰸣�"+number+"***************\n");
			if(i==1){
				System.out.println("perfect!!��ϲ����һ�ξ���!!");
			}
			else if(i<10){
				System.out.println("good job! ���ܹ�����"+i+"��, ��Ҫ��������!!");
			}
			else{
				System.out.println("not bad! ���ܹ�����"+i+"��, ���ض���Զ����");
			}
			System.out.println("��ǰʱ�� :" +sNowDate.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��
			//System.out.println("��ǰʱ�� :" +sNowDate);
			System.out.println("����ʱ�� :" +(sEndTime-sTartTime)/1000+"��");
		  }
		}
		if(t)
		break second;
	  }
	}
  }

  //���뺯��
  public static int guess(int i){
    //ͨ������import java.util.Scanner���
   Scanner sc=new Scanner(System.in);
   int result;
   try{
     //ʹ�ڿ���̨��������ݱ���Ϊ����
     result=sc.nextInt();
     return result;
   }
   catch (Exception e) {
     // TODO: handle exception 
   System.out.println("��ݔ��Ĳ��ǔ���,�����������"+i+"������");
   //���ñ�������������
   guess(i);
   }
   return 0;
  }
}