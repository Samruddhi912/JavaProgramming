import java.util.Scanner;

class Demo{
    public void Display(int num1,int num2){
        for(int i=0;i<num2;i++){
            System.out.println(num1);
        }
    }
}

public class program7 {

    public static void main(String A[]){
        System.out.println("Enter number");
        Scanner sobj=new Scanner(System.in);
        int no1=sobj.nextInt();
        int no2=sobj.nextInt();
        Demo dobj=new Demo();
        dobj.Display(no1,no2);

    }
    
}
