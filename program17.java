import java.util.Scanner;
class Demo{
    public int Factorial(int num){
        if(num<0){
            num=-num;
        }
        int Fact=1;

        for(int i=num;i>0;i--){
            if(i%2!=0){
                Fact=Fact*i;     
            }
        }
        return Fact;
    }
}

public class program17 {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sobj=new Scanner(System.in);
        int No=sobj.nextInt();
        Demo dobj=new Demo();
        int iRet=dobj.Factorial(No);
        System.out.println("Odd Factorial are: "+iRet);

        sobj.close();

    }    
}
 