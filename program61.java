import java.util.Scanner;
class Demo{
    public void Display(int iRow,int iCol){
        for(int i=iRow;i>=1;i--){
            for(int j=iCol;j>=1;j--){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
public class program61 {
    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter  row:");
        int No1=sobj.nextInt();
        System.out.println("Enter Column");      
        int No2=sobj.nextInt();
        Demo dobj=new Demo();
        dobj.Display(No1,No2);

        sobj.close();
    }
    
}
