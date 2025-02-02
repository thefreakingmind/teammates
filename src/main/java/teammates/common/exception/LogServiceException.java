package teammates.common.exception;

/**
 * Exception thrown when the logs service fails to create or retrieve logs.
 */
@SuppressWarnings("serial")
public class LogServiceException extends Exception {

    public LogServiceException(Throwable cause) {
        super(cause);
    }

}
