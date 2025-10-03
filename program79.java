  import java.util.Scanner;
class Demo{
    public void Display(int iRow,int iCol){
        for(int i=iRow;i>=1;i--){
            for(int j=1;j<=iCol;j++){
                if(i==j){
                    System.out.print("#"+"\t");
                }
                else if(i<j){
                    System.out.print("*"+"\t");
                }
                else{
                    System.out.print("@"+"\t");
                }

            }
            System.out.println();

            }
            
        }
    }

public class program79{
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


