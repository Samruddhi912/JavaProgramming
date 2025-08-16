import java.util.Scanner;

class Demo{
    public int MultFact(int Num){
        int iSum=1;
        for (int i=1;i<=Num/2;i++){
            if(Num%i==0){
                iSum=iSum*i;
            }

        }
        return iSum;
    }
}

public class program19 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sobj=new Scanner(System.in);
        int No=sobj.nextInt();
        Demo dobj=new Demo();
        int iRet=dobj.MultFact(No);

        System.out.println("Multiplication of factors are:"+iRet);
        sobj.close();


        
    }
    
}
