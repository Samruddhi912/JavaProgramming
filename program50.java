import java.util.Scanner;
class Demo{
    public boolean ChkZero(int iNum){
        int iDigit=0;
        if(iNum<0){
            iNum=-iNum;
        }
        while(iNum!=0){
            iDigit=iNum%10;
            if(iDigit==0){
                return true;
            }
            iNum=iNum/10;
        }
        return false;
        
    }

}
public class program50 {
    public static void main(String[] args) {
        System.out.println("Enter  number:");
        Scanner sobj=new Scanner(System.in);
        int No1=sobj.nextInt();
        Demo dobj=new Demo();
        boolean bRes=dobj.ChkZero(No1);
        if (bRes==true){
            System.out.println("It contains Zero");
        }
        else{
            System.out.println("There is no Zero");
        }

        sobj.close();
    }
    
}


 


