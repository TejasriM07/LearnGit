public class Validation{
    public void validate(int age) throws InvalidAgeException{
            if ( age < 0 && age > 100){
                System.out.println("Invalid Age");
                InvalidAgeException e = new InvalidAgeException();
                throw e;
            }else{
                System.out.println("Valid Age ");
            }
    }
}