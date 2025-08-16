import java.util.Scanner;

class Demo{
    public void Display(int Num){
        if(Num<0){
            Num=-Num;
        }
        for (int i=1;i<=Num;i++){
            System.out.print("*\t");
        }
        for (int j=1;j<=Num;j++){
            System.out.print("#\t");
        } 
}
}

public class program13 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sobj=new Scanner(System.in);
        int No=sobj.nextInt();
        Demo dobj=new Demo();
        dobj.Display(No);

        sobj.close();
        
    }
    
}
