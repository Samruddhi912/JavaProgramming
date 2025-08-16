import java.util.Scanner;
class Hello{
    public void Display(int Num){
        for (int i =-Num;i<=Num;i++){
            System.out.println(i);
        }

    }
}

public class program31 {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sobj=new Scanner(System.in);

        int No=sobj.nextInt();
        Hello hobj=new Hello();
        hobj.Display(No);

        sobj.close();

    }
    
}
