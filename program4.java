import java.util.Scanner;

class Demo{
    public boolean Divisible(int num){
        if(num%5==0){
            return true;
        }
        else{
            return false;
        }
    }
}

public class program4 {
    public static void main(String A[]){
        System.out.println("Enter a number");
        Scanner sobj=new Scanner(System.in);
        int no=sobj.nextInt();
        Demo dobj=new Demo();
        boolean Res=dobj.Divisible(no);
        if (Res==true){
            System.out.println("Number is Divisible by 5");
        } 
        else{
            System.out.println("Number is not Divisible by 5");
        }
    }
}
