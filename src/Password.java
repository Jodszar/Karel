import java.util.Scanner;
public class Password {
    public static void main(String[] args) {


        Scanner name= new Scanner(System.in);
        System.out.println("First name: ");
        String F= name.next();
        System.out.println("Middle name: ");
        String M= name.next();
        System.out.println("Last name: ");
        String L= name.next();
        System.out.println("Age: ");
        int A= name.nextInt();

        String fn= F.substring(F.length()/2, F.length()/2+1);
        String mn= M.substring(M.length()/2, M.length()/2+1);
        String ln= L.substring(L.length()/2, L.length()/2+1);
        String fml=(fn.toUpperCase() + mn.toUpperCase() + ln.toUpperCase());
        String Fn= F.substring(F.length()-1, F.length());
        String Mn= M.substring(M.length()-1, M.length());
        String Ln= L.substring(L.length()-1, L.length());
        int Ag= A*75;

        System.out.println("Password: "+fml+ Fn+ Mn+ Ln +Ag );









    }
}
