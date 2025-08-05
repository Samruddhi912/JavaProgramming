import java.util.Scanner;

public class program8 {
    public static void main(String A[]){
        System.out.println("Enter Number");
        Scanner sobj=new Scanner(System.in);
        int no=sobj.nextInt();

        if(no%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is not even");
        }
    }
    
}
