import java.util.Scanner;

class Hello{
    public double Area(double iRad){
        double dArea=0.0;
        dArea=(3.14*iRad*iRad);

        return dArea;
    }
}

public class program24 {
    public static void main(String[] args) {
        System.out.println("Enter Number:");
        Scanner sobj=new Scanner(System.in);

        double dRadius=sobj.nextDouble();

        Hello hobj=new Hello();
        double dRet=hobj.Area(dRadius);

        System.out.println("Area:"+dRet);

        sobj.close();


    }
    
}
