package in.jordane.expensetrackerapi.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException{


    @Serial
    private static final long serialVersionUID = 6761564055894221026L;

    public ResourceNotFoundException(String message){
        super(message);
    }
}
