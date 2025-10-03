  import java.util.Scanner;
class Demo{
    public void Display(int iRow,int iCol){
        for(int i=0;i<iRow;i++){
            for(int j=0;j<iCol;j++){
                if(i%2==0){
                    char ch=(char)('a'+j);
                    System.out.print(ch+"\t");
                }
                else{
                    System.out.print(j+"\t");
                }
                

                }
                System.out.println();

            }
            
        }
    }

public class program75 {
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


