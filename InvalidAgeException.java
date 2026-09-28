
public class InvalidAgeException  extends Exception{
    public InvalidAgeException() {

    }

    public InvalidAgeException(int age){
        System.out.println("age ="+age+" is Invalid age");
    }

    @Override
    public String toString() {
        return "Invalid age Exception";
    }
    
    
}
