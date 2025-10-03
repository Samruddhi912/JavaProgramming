import java.util.Scanner;

public class program55 {
    public static void main(String[] args) {
        System.out.println("Enter  number:");
        Scanner sobj=new Scanner(System.in);
        int No1=sobj.nextInt();
        

        for(int i=No1;i>=1;i--){
            System.out.print(i+"\t"+"#"+"\t");
            
        }

        sobj.close();
    }
    
}
