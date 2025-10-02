import java.util.Scanner;
class Demo{
    public int CountEven(int Num){
        if(Num<0){
            Num=-Num;
        }
        int iDigit=0;
        int iCount=0;
        while(Num!=0){
            iDigit=Num%10;
            if(iDigit%2==0){
                iCount++;
            }
            Num=Num/10;
        }
        return iCount;

    }

}
class program39{
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sobj=new Scanner(System.in);
        int No=sobj.nextInt();
        Demo dobj=new Demo();
        int iRes=dobj.CountEven(No);
        System.out.println(iRes);

        sobj.close();
    }
}