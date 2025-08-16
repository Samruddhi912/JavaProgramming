import java.util.Scanner;
class Hello{
    public float ConvertTemperature(float temp){
        float fConvert=0.0f;
        fConvert=((temp-32)*(5.0f/9.0f));
        return fConvert;
    }
}
public class program27 {
    public static void main(String[] args) {
        System.out.println("Enter Temperature (in Fahrenhiet):");
        Scanner sobj=new Scanner(System.in);

        float fTemp=sobj.nextFloat();
        Hello hobj=new Hello();
        float iRet=hobj.ConvertTemperature(fTemp);

        System.out.println(iRet);
        sobj.close();

    }
    
}