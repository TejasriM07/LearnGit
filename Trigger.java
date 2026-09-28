public class Trigger {
    public static void main(String[] args) {
        Validation v = new Validation();
        try {
            v.validate(101);

        } catch (InvalidAgeException e) {
            System.err.println("Invalid age");
        }

    }
    
}
