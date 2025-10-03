 import java.util.Scanner;

public class program58{
    public static void main(String[] args) {
        System.out.println("Enter  number:");
        Scanner sobj=new Scanner(System.in);
        int No1=sobj.nextInt();
        

        for(int i=1;i<=No1;i++){
            System.out.print(i*2+"\t");
            
        }

        sobj.close();
    }
    
}

