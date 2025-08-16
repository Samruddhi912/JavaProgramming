import java.util.Scanner;
class Hello{
    public int SumNonFact(int Num){
        int iAns=0;
        for (int i=1;i<Num;i++){
            if(Num%i!=0){
                iAns=iAns+i;
            }
        }
        return iAns;
    }

}

public class program22 {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sobj=new Scanner(System.in);
        int No=sobj.nextInt();

        Hello hobj=new Hello();
        int iRet=hobj.SumNonFact(No);

        System.out.println("Multiplication of Non-Factors are:"+iRet);

        sobj.close();

    }
    
}
