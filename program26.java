import java.util.Scanner;
class Hello{
    public int ConvertDistance(int distance){
        int iConvert=distance*1000;
        return iConvert;
    }
}
public class program26 {
    public static void main(String[] args) {
        System.out.println("Enter Distance (in km):");
        Scanner sobj=new Scanner(System.in);

        int iDist=sobj.nextInt();
        Hello hobj=new Hello();
        int iRet=hobj.ConvertDistance(iDist);

        System.out.println(iRet);
        sobj.close();

    }
    
}
