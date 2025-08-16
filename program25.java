import java.util.Scanner;
class Hello{
    public float Area(float Length,float breadth){
        float fAns=Length*breadth;
        return fAns;
    }
}
public class program25 {
    public static void main(String[] args) {
        
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter  height:");
        float fHeight=sobj.nextFloat();
        System.out.println("Enter width :");
        float fWidth=sobj.nextFloat();

        Hello hobj=new Hello();
        float iRet=hobj.Area(fHeight, fWidth);

        System.out.println(iRet);
        sobj.close();


    }
}
