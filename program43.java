import java.util.Scanner;
class Demo{
    public int CountDigits(int Num){
        int iDigit=0;
        int iEven=0,iOdd=0;
        if(Num<0){
            Num=-Num;
        }
        while(Num!=0){
            iDigit=Num%10;
            if(iDigit%2==0){
                iEven=iEven+iDigit;
            }
            else{
                iOdd=iOdd+iDigit;
            }
            Num=Num/10;
        }
        return iEven-iOdd;

    }

}
public class program43 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sobj=new Scanner(System.in);
        int No=sobj.nextInt();
        Demo dobj=new Demo();
        int iRes=dobj.CountDigits(No);
        System.out.println(iRes);


        sobj.close();
    }
    
}

