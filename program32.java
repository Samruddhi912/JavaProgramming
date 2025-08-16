import java.util.Scanner;
class Hello{
    public void DisplayOdd(int Num){
        for (int i =1;i<=Num;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }

    }
}

public class program32 {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sobj=new Scanner(System.in);

        int No=sobj.nextInt();
        Hello hobj=new Hello();
        hobj.DisplayOdd(No);

        sobj.close();

    }
    
}
