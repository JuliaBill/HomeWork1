import java.util.Scanner;

public class DomashkaOne {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Geben Sie Ihren Vornamen ein");

        String firstName = reader.nextLine();

        System.out.println("Hallo " + firstName);

        System.out.println("Geben Sie Ihren Nachnamen ein");

        String secondName = reader.nextLine();

        System.out.println("Hallo," + firstName +" "+ secondName);

        String fullName = firstName+" "+secondName;

        System.out.println("Ihr vollständiger Name ist:"+ fullName);




    }
}
