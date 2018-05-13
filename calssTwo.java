import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
 
//主函数
public class calssTwo {
   
  public static void main(String[] args) {
	  first:{  
	  boolean t=true;
	  int result;
   //随机产生一个在100以内的数字
    second:{
		int number = (int)(Math.random()*100);
		System.out.println("1.开始游戏");
		System.out.println("2.退出游戏");
		System.out.println("3.再来一次");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if (a!=1&&a!=3)
		  System.exit(0);
		else {
		//shit+Ctrl+o
		System.out.println("\n***********猜数码小游戏，你hold得住吗？*********");
		System.out.println("\n  ********随机数字产生：不告诉你！*********\n");
		System.out.println("让我们动动脑筋来猜一猜吧，小提示：他是一个从1到100的整数");
		}
		long sTartTime=System.currentTimeMillis();//定义一个时间变量
		for(int i=1;i<100;i++){
		System.out.println("请输入你第"+i+"次的猜测");
		result=calssTwo.guess(i);//通过调用输入函数得到输入结果
    //通过比较输出控制台
		if(result>number)
			System.out.println("不好意思，您所猜的数字大于谜底数字!");
		else if(result < number)
			System.out.println("不好意思，您所猜的数字小于谜底数字!");
		else {
			SimpleDateFormat sNowDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			long sEndTime=System.currentTimeMillis();
			System.out.println("\n  ***********正确答案："+number+"***************\n");
			if(i==1){
				System.out.println("perfect!!恭喜您！一次就中!!");
			}
			else if(i<10){
				System.out.println("good job! 您总共猜了"+i+"次, 还要继续加油!!");
			}
			else{
				System.out.println("not bad! 您总共猜了"+i+"次, 任重而道远啊！");
			}
			System.out.println("当前时间 :" +sNowDate.format(new Date()));// new Date()为获取当前系统时间
			//System.out.println("当前时间 :" +sNowDate);
			System.out.println("所用时间 :" +(sEndTime-sTartTime)/1000+"秒");
		  }
		}
		if(t)
		break second;
	  }
	}
  }

  //输入函数
  public static int guess(int i){
    //通过引入import java.util.Scanner类包
   Scanner sc=new Scanner(System.in);
   int result;
   try{
     //使在控制台输入的内容必须为数字
     result=sc.nextInt();
     return result;
   }
   catch (Exception e) {
     // TODO: handle exception 
   System.out.println("你輸入的不是數字,请重新输入第"+i+"个数字");
   //调用本函数重新输入
   guess(i);
   }
   return 0;
  }
}