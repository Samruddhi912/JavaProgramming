import java.util.Scanner;
class Hello{
    public void NonFact(int Num){
        for(int i=1;i<Num;i++){
            if(Num%i!=0){
                System.out.println(i);
            }
        }

    }
}

public class program21 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sobj=new Scanner(System.in);
        int iRet=sobj.nextInt();

        Hello hobj=new Hello();
        hobj.NonFact(iRet);

        sobj.close();

        
        
    }
    
    
}
