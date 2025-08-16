import java.util.Scanner;
class Hello{
    public int Diff(int Num){
        int iFactSum=0;
        int iNonFactSum=0;
        int iDiff=0;
        for(int i=1;i<Num;i++){
            if(Num%i==0){
                iFactSum=i+iFactSum;
            }
        }
        for(int j=1;j<Num;j++){
            if(Num%j!=0){
                iNonFactSum=j+iNonFactSum;
            }
        }
        iDiff=iFactSum-iNonFactSum;
        return iDiff;

    }
}
public class program23 {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sobj=new Scanner(System.in);
        int iNo=sobj.nextInt();

        Hello hobj=new Hello();
        int Ans=hobj.Diff(iNo);

        System.out.println(Ans);

        sobj.close();


    }
    
}
