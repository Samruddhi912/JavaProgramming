import java.util.Scanner;
class Hello{
    public void Display(int Num){
        for (int i =1;i<=Num;i++){
            System.out.print("$\t*\t");
        }

    }
}

public class program29 {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sobj=new Scanner(System.in);

        int No=sobj.nextInt();
        Hello hobj=new Hello();
        hobj.Display(No);

        sobj.close();

    }
    
}
