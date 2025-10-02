import java.util.Scanner;
class Demo{
    public void DisplayRange(int iStart,int iEnd){
        if(iStart>iEnd){
            System.out.println("Invalid Range");
        }
        for(int i=iStart;i<=iEnd;i++){
            System.out.print(i+"\t");
        }
    }

}
public class program44 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner sobj=new Scanner(System.in);
        int No1=sobj.nextInt();
        int No2=sobj.nextInt();
        Demo dobj=new Demo();
        dobj.DisplayRange(No1,No2);

        sobj.close();
    }
    
}

