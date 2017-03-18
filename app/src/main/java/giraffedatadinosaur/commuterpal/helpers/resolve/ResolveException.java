package giraffedatadinosaur.commuterpal.helpers.resolve;

/**
 * Created by Daniel on 18/03/2017.
 */

public class ResolveException extends Exception {
    public ResolveException() {
        super();
    }
    public ResolveException(String message) {
        super(message);
    }
    public ResolveException(String message, Throwable cause) {
        super(message, cause);
    }
    public ResolveException(Throwable cause) {
        super(cause);
    }
}
