import java.util.Scanner;

public class program10 {
    public static void main(String A[]){
        System.out.println("Enter number:");
        Scanner sobj=new Scanner(System.in);
        int num=sobj.nextInt();

        for(int i=1;i<=num/2;i++){
            if((num%i==0) && (i%2==0)){
                    System.out.println(i);                
            }
        }
        sobj.close();
    }
}
