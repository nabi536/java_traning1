package Day_31;

public class InvalidAge extends Exception{

    String message;

    public InvalidAge(String message){
        this.message=message;
    }
    public String getMessage(){
        return message;
    }
}
