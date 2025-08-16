import java.util.Scanner;
class Demo{
    public void Fact(int num){
        if(num<0){
            num=-num;
        }
        for(int i=1;i<num;i++){
            if(num%i==0 && i%2==0){
                System.out.println(i);
            }
        }
        
    }
}

public class program15 {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sobj=new Scanner(System.in);
        int No=sobj.nextInt();
        Demo dobj=new Demo();
        dobj.Fact(No);

        sobj.close();

    }
    
}
