import java.util.Scanner;
class Division{
    public int No1;
    public int No2;
    public Division(int a,int b){
        No1=a;
        No2=b;
    }
    public int Divide(){
        if(this.No2==0){
            System.out.println("Denominator cannot be zero");
            return 0;
        }
        else{
        int Ans=0;
        Ans=this.No1/this.No2;
        return Ans;
        }
    }
}

class program1{
    public static void main(String A[]){
        System.out.println("Enter two numbers:");
        Scanner scanner=new Scanner(System.in);
        int Num1=scanner.nextInt();
        int Num2=scanner.nextInt();
        Division dobj=new Division(Num1,Num2);
        int Ans=dobj.Divide();
        System.out.println("Division is:"+Ans);
    }
}