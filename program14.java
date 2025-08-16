import java.util.Scanner;

class Demo{
    public int ConvertCurrency(int Num){
        Num=Num*70;
        return Num;
    }
}

public class program14 {
    public static void main(String[] args) {
        System.out.println("Enter the amount(in US dollars($)):");
        Scanner sobj=new Scanner(System.in);
        int No=sobj.nextInt();
        Demo dobj=new Demo();
        int iRet=dobj.ConvertCurrency(No);
        System.out.println("Indian currency is:"+iRet);

        sobj.close();


    }
    
}
