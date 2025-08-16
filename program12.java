import java.util.Scanner;

class Vowels{
    public boolean CheckVowels(char str){
    if (str=='a' || str=='e'||str=='i'||str=='o'||str=='u'||str=='A' || str=='E'||str=='I'||str=='O'||str=='U'){
        return true;
    }
    else{
        return false;
    }
}
}


public class program12 {
    public static void main(String A[]){
        System.out.println("Enter one character");
        Scanner sobj=new Scanner(System.in);
        char ch=sobj.next().charAt(0);
        Vowels vobj=new Vowels();
        boolean bRet=vobj.CheckVowels(ch);
        if (bRet==true){
            System.out.println("True");
        }
        else{
            System.out.println("False");

        }

        sobj.close();


    }
    
}

