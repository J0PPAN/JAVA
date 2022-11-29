import java.util.*;
public class multithreading implements Runnable{
  public static void main(String args[]){
    multithreading et = new multithreading();
    Thread t1 = new Thread(et , "odd");
    Thread t2 = new Thread(et , "even");
    t1.start();
    t2.start();
  }
synchronized public void run(){
  Scanner sc = new Scanner(System.in);
  String s1 = new String();
  System.out.println("Enter the String with whitespace as the delimiter : ");
  s1 = sc.nextLine();
  int sum = 0 ;
  StringTokenizer stk = new StringTokenizer(s1);
  while(stk.hasMoreTokens()){
    int n = Integer.parseInt(stk.nextToken());
    if(Thread.currentThread().getName() == "even"){
      if(n%2 == 0)
        System.out.println(Thread.currentThread().getName()+n);
     }
    else if(Thread.currentThread().getName() == "odd"){
      if(n%2 != 0)
        System.out.println(Thread.currentThread().getName()+n);
      }
    }
  }

