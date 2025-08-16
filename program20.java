import java.util.Scanner;

class Hello{
    public void DisplayFact(int Num){
        System.out.println("Factors in decreasing order are:");
        for(int i=Num/2;i>0;i--){
            if(Num%i==0){
                System.out.println(i);
            }
        }
    }
}

public class program20 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sobj=new Scanner(System.in);
        int No=sobj.nextInt();

        Hello hobj=new Hello();
        hobj.DisplayFact(No);

        sobj.close();
    }
    
}
