abstract class demo{
    public int addition (int a,int b){
        return a+b;
    }
    public int substraction (int a,int b){
        return a-b;
    }
    public abstract int multiplication (int a,int b);
}
class marvellous extends demo{
    public int division (int a,int b){
        return a/b;
    }
    public int multiplication (int a,int b){
        return a*b;
    }
}

class hello{
    public static void main(String Arg[]){
        //demo obj=new demo();
        marvellous mobj=new marvellous();
        System.out.println(mobj.addition(10,11));
        System.out.println(mobj.substraction(10,11));
        System.out.println(mobj.multiplication(10,11));
        System.out.println(mobj.division(100,10));

    }
}