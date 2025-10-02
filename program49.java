 import java.util.Scanner;
class Demo{
    public void DisplayDigit(int iNum){
        int iDigit=0;
        if(iNum<0){
            iNum=-iNum;
        }
        while(iNum!=0){
            iDigit=iNum%10;
            System.out.println(iDigit);
            iNum=iNum/10;
        }
        
    }

}
public class program49 {
    public static void main(String[] args) {
        System.out.println("Enter  number:");
        Scanner sobj=new Scanner(System.in);
        int No1=sobj.nextInt();
        Demo dobj=new Demo();
        dobj.DisplayDigit(No1);

        sobj.close();
    }
    
}


 

