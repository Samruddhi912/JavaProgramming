import java.util.Scanner;

public class program54 {
    public static void main(String[] args) {
        System.out.println("Enter  number:");
        Scanner sobj=new Scanner(System.in);
        int No1=sobj.nextInt();
        

        for(int i=0;i<No1;i++){
            char ch=(char)('A'+i);
            System.out.println(ch+"\t");
            
        }

        sobj.close();
    }
    
}
