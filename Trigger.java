import java.util.*;
public class Trigger {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("Enter your age");
        int age  = sc.nextInt();
        Validation v = new Validation();
        try {
            v.validate(101);

        } catch (InvalidAgeException e) {
            System.err.println("Invalid age");
        }

    }
    
}
