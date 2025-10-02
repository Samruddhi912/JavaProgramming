import java.util.Scanner;
class Demo{
    public int DisplayRange(int iStart,int iEnd){
        int iCnt=0;
        if(iStart>iEnd || iStart<0||iEnd<0){
            System.out.println("Invalid Range");
        }
        for(int i=iStart;i<=iEnd;i++){
            iCnt=iCnt+i;
        }
        return iCnt;
    }

}
public class program46 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner sobj=new Scanner(System.in);
        int No1=sobj.nextInt();
        int No2=sobj.nextInt();
        Demo dobj=new Demo();
        int iRes=dobj.DisplayRange(No1,No2);
        System.out.println(iRes);

        sobj.close();
    }
    
}


 