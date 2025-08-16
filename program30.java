import java.util.Scanner;
class Hello{
    public void Display(int Num){
        for (int i =Num;i>0;i--){
            System.out.println(i);
        }

    }
}

public class program30 {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sobj=new Scanner(System.in);

        int No=sobj.nextInt();
        Hello hobj=new Hello();
        hobj.Display(No);

        sobj.close();

    }
    
}
