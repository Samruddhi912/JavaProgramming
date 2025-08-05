import java.util.Scanner;

public class program9 {
    public static void main(String A[]){
        System.out.println("Enter Number");
        Scanner sobj=new Scanner(System.in);
        int no=sobj.nextInt();
        int i=1;
        for(i=1;i<=no;i++){
            System.out.println(2*i);            
        }
    }
    
}
