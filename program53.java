import java.util.Scanner;
class Demo{
    public int CountFreq(int iNum){
        int iDigit=0,iCnt=0;
        if(iNum<0){
            iNum=-iNum;
        }
        while(iNum!=0){
            iDigit=iNum%10;
            if(iDigit<6){
                iCnt++;
            }
            iNum=iNum/10;
        }
        return iCnt;
        
    }

}
public class program53 {
    public static void main(String[] args) {
        System.out.println("Enter  number:");
        Scanner sobj=new Scanner(System.in);
        int No1=sobj.nextInt();
        Demo dobj=new Demo();
        int iRes=dobj.CountFreq(No1);
        System.out.println(iRes);
        
        sobj.close();
    }
    
}


 



