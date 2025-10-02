import java.util.Scanner;

public class program37 {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sobj=new Scanner(System.in);
        int No=sobj.nextInt();
        if(No<0){
            No=-No;
        }
        for(int i=1;i<=10;i++){
            System.out.println(No*i);
        }
        sobj.close();
    }
    
}
