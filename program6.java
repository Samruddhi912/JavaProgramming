import java.util.Scanner;

class Demo{
    public void Display(int num){
        if(num<10){
            System.out.println("Hello");
        }
        else{
            System.out.println("Demo");
        }
    }
}

public class program6 {
    public static void main(String A[]){
        System.out.println("Enter number");
        Scanner sobj=new Scanner(System.in);
        int no=sobj.nextInt();
        Demo dobj=new Demo();
        dobj.Display(no);


    }
    
}
