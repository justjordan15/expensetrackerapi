package in.jordane.expensetrackerapi.exceptions;



public class ResourceNotFoundException extends RuntimeException{



    private static final long serialVersionUID = 6761564055894221026L;

    public ResourceNotFoundException(String message){
        super(message);
    }
}
