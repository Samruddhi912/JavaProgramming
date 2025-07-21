import java.util.Scanner;
class IO{
    public static void main(String arr[]){
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter first number: ");
        int no1=sobj.nextInt();
        System.out.println("enter second number: ");
        int no2=sobj.nextInt();
        int ans=no1+no2;
        System.out.println("addition is :"+ans);
    }
}
/*
   Datatype    |      Function
               |
    boolean    |     nextBoolean()
    byte       |    nextByte()
    char       |    --------
    int        |    nextInt()
    float      |    nextFloat()
    double     |    nextDouble()
    string     |    nextLine()
    short      |    nextShort()
    long       |    nextLong()
 */