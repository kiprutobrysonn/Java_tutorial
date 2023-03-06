package java_tuto;
import  java.util.*;
public class ABC implements  Runnable{
    public void run(){
       System.out.println("Enter your details:");
       String name;
       Scanner myObj= new Scanner(System.in);
       name=myObj.nextLine();
       System.out.println("Your name is"+name);
    }
    public  static  void main(String[]args){
        ABC obj = new ABC();
        Thread t1 = new Thread(obj);
        t1.start();
        main.sleep
    }
}
