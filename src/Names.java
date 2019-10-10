public class Names {
    public static void main(String [] arges ){

        String firstname= "Joseph";
        String lastname= "Akanyachab";
        System.out.println("First name: " + firstname);
        System.out.println("Last name: " + lastname);
        System.out.println(firstname+" "+lastname);
        System.out.println("Length of first name: " + firstname.length());
        System.out.println("Length for last name: " + lastname.length());
        System.out.print("Initials: " +firstname.substring(0,1));
        System.out.println(lastname.substring(0,1));
        System.out.println("Comparison of two names: " +firstname.compareTo(lastname));
        System.out.println(lastname.indexOf('h'));
        System.out.println(firstname.indexOf('b'));


        String fn= "Jane";
        String ln= "Azar";
        System.out.println("First name: " + fn);
        System.out.println("Last name: " + ln);
        System.out.print(fn.substring(0,2));
        System.out.println(ln.substring(2,4));
        System.out.print(ln.substring(0,2));
        System.out.println(fn.substring(2,4));
        String mid1= fn.substring(0,fn.length()/2)+ ln.substring(ln.length()/2);
        System.out.print(mid1);
        String mid2= ln.substring(0, ln.length()/2)+ fn.substring(fn.length()/2);
        System.out.print(" " +mid2);

    }
}
