import java.util.Scanner;

class Demo{
    public void Display(int num){
        int i=0;
        for(i=0;i<num;i++){
            System.out.println("*");
        }
    }
}


public class program5 {
    public static void main(String A[]){
        System.out.println("Enter number;");
        Scanner sobj=new Scanner(System.in);
        int num=sobj.nextInt();

        Demo dobj=new Demo();
        dobj.Display(num);

    }
    
}
