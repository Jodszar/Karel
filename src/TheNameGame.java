import java.util.Scanner;
public class TheNameGame {

        public static void First(String name) {
            System.out.println(name + " " + name + ", bo-B" + name.substring(1));
            System.out.println("Banana-fana fo-F" + name.substring(1));
            System.out.println("Fee-fi-mo-M" + name.substring(1));
            System.out.println(name.toUpperCase() + "!");
            System.out.println(" ");
        }

        public static void main(String [] arges){
            Scanner scan = new Scanner(System.in);
            System.out.println("What is your first name? ");
            System.out.println("What is your last name?");
            String Firstname = scan.nextLine();
            String Lastname = scan.nextLine();
            First(Firstname);
            First(Lastname);










            }


        }


