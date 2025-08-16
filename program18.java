import java.util.Scanner;
class Demo{
    public int Factorial(int Num){
        int iDiff=0;
        int iEven=1;
        int iOdd=1;
        if (Num<0){
            Num=-Num;
        }
        for(int i=Num;i>0;i--){
            if(i%2==0){
                iEven=iEven*i;
            }
            else{
                iOdd=iOdd*i;
            }
        }
        iDiff=iEven-iOdd;
        return iDiff;
        
    }
}

public class program18 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sobj=new Scanner(System.in);
        int no=sobj.nextInt();
        Demo dobj=new Demo();
        int Ans=dobj.Factorial(no);
        System.out.println("Difference between Even and Odd Factors are:"+Ans);
        sobj.close();

        
    }
    
}
