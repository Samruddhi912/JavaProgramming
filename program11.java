import java.util.Scanner;

class Convert{
    void Conversion(char ch){
        if((ch>='a')&&(ch<='z')){
            ch=(char)(ch-32);
            System.out.println("Update character :"+ch);
        }
        else if((ch>='A')&&(ch<='Z')){
            ch=(char)(ch+32);
            System.out.println("Update character :"+ch);
        
        }
    }
}

public class program11 {
    public static void main(String A[]){
        System.out.println("Enter a character");
        Scanner sobj=new Scanner(System.in);
        char str=sobj.next().charAt(0);
        Convert cobj=new Convert();
        cobj.Conversion(str);

        sobj.close();

    }
    
}
