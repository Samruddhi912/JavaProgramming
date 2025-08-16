import java.util.Scanner;
class Hello{
    public float ConvertSqFeet(float temp){
        float fConvert=0.0f;
        fConvert=(temp*0.0929f);
        return fConvert;
    }
}
public class program28 {
    public static void main(String[] args) {
        System.out.println("Enter Square Feet (in Sq. feet):");
        Scanner sobj=new Scanner(System.in);

        float fSqFeet=sobj.nextFloat();
        Hello hobj=new Hello();
        float iRet=hobj.ConvertSqFeet(fSqFeet);

        System.out.println(iRet);
        sobj.close();

    }
    
}